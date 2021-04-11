package com.nst;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;

public class thuocHelper {

    private static DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd+HH.mm.ss");

    public static List<thuoc> timkiem(String name, HashMap<String, thuoc> data)
    {
        List<thuoc> ToReturn = new ArrayList<>();
        for (String i : data.keySet())
        {
            if(i.toLowerCase().contains(name.toLowerCase()))
            {
                ToReturn.add(data.get(i));
            }
        }
        for(thuoc i : data.values())
        {
            if(i.getName().toLowerCase().contains(name.toLowerCase())
                && !ToReturn.contains(i))
            {
                ToReturn.add(i);
            }
        }
        return ToReturn;
    }
    public static List<thuoc> danhsach(HashMap<String, thuoc> data)
    {
        List<thuoc> ToReturn = new ArrayList<>();
        for(String i : data.keySet())
        {
            ToReturn.add(data.get(i));
        }
        return ToReturn;

    }
    public static Object[][] Statistic(Date begin,Date end)    //hàm đưa vào 2 khoảng thời gian lấy ra tất cả thuốc đã bán trong khoảng đó kèm theo số lượng bán
    {
        //nothing for now
        return null;      
    }

    public static void NhapThuoc(thuoc thuocObject, double amount, HashMap<String, thuoc> data)
    {
        if(data.containsKey(thuocObject.getCode()))
        {
            thuoc ethuoc = data.get(thuocObject.getCode());
            ethuoc.setStocks(ethuoc.getStocks() + amount);
        }
        else data.put(thuocObject.getCode(), thuocObject);
    }

    public static void BanThuoc(String key, double amount, HashMap<String, thuoc> data) throws Exception
    {
        if(data.containsKey(key))
        {

            try
            {
                NhapThuoc(data.get(key), -amount, data);
                XuatHoaDon(data.get(key), amount);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        else throw new Exception();

    }

    public static void XuatHoaDon(thuoc obj, double amount) throws IOException
    {
        Path billPath;
        LocalDateTime now = LocalDateTime.now();
        String billFileName = dtf.format(now) + " - " + obj.getCode();
        billPath = Paths.get("bills/" + billFileName + ".tdt").toAbsolutePath();
        Files.createFile(billPath);
        FileWriter writer = new FileWriter(billPath.toFile());
        BufferedWriter output = new BufferedWriter(writer);
        output.write(obj.getCode());
        output.newLine();
        output.write(obj.getName());
        output.newLine();
        output.write(Double.toString(obj.getCoeff()* obj.getPriceIn()));
        output.newLine();
        output.write(Double.toString(amount));
        output.close();
        writer.close();
    }
}
