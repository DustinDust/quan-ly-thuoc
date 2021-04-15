package com.nst;

import com.nst.Medicine.Medicine;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;

public class MedicineHelper {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd+HH.mm.ss");

    public static List<Medicine> timkiem(String name, HashMap<String, Medicine> data)
    {
        List<Medicine> ToReturn = new ArrayList<>();
        for (String i : data.keySet())
        {
            if(i.toLowerCase().contains(name.toLowerCase()))
            {
                ToReturn.add(data.get(i));
            }
        }
        for(Medicine i : data.values())
        {
            if(i.getName().toLowerCase().contains(name.toLowerCase())
                && !ToReturn.contains(i))
            {
                ToReturn.add(i);
            }
        }
        return ToReturn;
    }
    public static List<Medicine> MedList(HashMap<String, Medicine> data)
    {
        List<Medicine> ToReturn = new ArrayList<>();
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

    public static void ImportMed(Medicine thuocObject, double amount, HashMap<String, Medicine> data)
    {
        if(data.containsKey(thuocObject.getCode()))
        {
            Medicine ethuoc = data.get(thuocObject.getCode());
            ethuoc.addStocks(amount);
        }
        else {
            thuocObject.addStocks(amount);
            data.put(thuocObject.getCode(), thuocObject);
        }
    }

    public static void ExportMed(String key, double amount, HashMap<String, Medicine> data) throws Exception
    {
        if(data.containsKey(key))
        {

            try
            {
                ImportMed(data.get(key), -amount, data);
                BillsOut(data.get(key), amount);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        else throw new Exception();

    }

    public static void BillsOut(Medicine obj, double amount) throws IOException
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
