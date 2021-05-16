package com.nst.helper;

import com.nst.Medicine.LiquidMedicine;
import com.nst.Medicine.Medicine;
import com.nst.Medicine.PowderedMedicine;
import com.nst.Medicine.TabletsMedicine;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;

public class MedicineHelper {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy [HH-mm-ss]");


    //tìm danh sách các loại thuốc có chưa String key (trong mã hoặc trong tên)
    public static List<Medicine> MedSearch(String name, HashMap<String, Medicine> data)
    {
        List<Medicine> ToReturn = new ArrayList<>();
        for (String i : data.keySet())
        {
            //search Mã thuốc trước, nếu có trùng thì adđ vô danh sách tìm được
            if(i.toLowerCase().contains(name.toLowerCase()))
            {

                ToReturn.add(data.get(i));
            }
        }
        //search tên thuốc sau
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

    //chuyển hóa thuốc trong data -> danh sách list, dùng cho hiển thị trong GUI
    public static List<Medicine> MedList(HashMap<String, Medicine> data)
    {
        List<Medicine> ToReturn = new ArrayList<>();
        for(String i : data.keySet())
        {
            ToReturn.add(data.get(i));
        }
        return ToReturn;

    }

    //thống kê lượng thuốc đã bán dựa trên hóa đơn
    public static Object[][] Statistic(Date begin,Date end) throws NullPointerException, ParseException //hàm đưa vào 2 khoảng thời gian lấy ra tất cả thuốc đã bán trong khoảng đó kèm theo số lượng bán
    {
        //Path of the bill list, for reading only
        List<Path> BillPaths = new ArrayList<>();
        Path BillsFolder = Paths.get("bills").toAbsolutePath();

        //is used for iteration
        File[] BillList = BillsFolder.toFile().listFiles();

        for(File bill : BillList)
        {
            String DateInString = bill.getName().substring(0, bill.getName().indexOf(' '));
            Date BillDate = new SimpleDateFormat("dd-MM-yyyy").parse(DateInString);
            //nằm trong khoảng ngày tháng chuẩn mới nhận
            if(BillDate.compareTo(begin) >= 0 && BillDate.compareTo(end) <= 0)
            {
                BillPaths.add(Paths.get(bill.getAbsolutePath()));
            }
        }

        //the returned Array, which contains one Object and one Amount buy in String (or Double, idk yet)
        Object[][] Infos = new Object[3][BillPaths.size()];
        for(int i = 0; i < BillPaths.size(); i++)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(BillPaths.get(i).toFile()))) //try (with resources) 'n catch
            {
                String MedType = reader.readLine();
                String code = reader.readLine();
                String name = reader.readLine();
                double coeff = Double.parseDouble(reader.readLine());
                double priceIn = Double.parseDouble(reader.readLine());
                Medicine foundMed = null;
                if(MedType.equals(LiquidMedicine.class.toString())) {
                    foundMed = new LiquidMedicine(code, name, 0, priceIn, coeff, null, null);
                }
                if(MedType.equals(TabletsMedicine.class.toString()))
                {
                    foundMed = new TabletsMedicine(code, name, 0, priceIn, coeff, null, null);
                }
                if(MedType.equals(PowderedMedicine.class.toString()))
                {
                    foundMed = new PowderedMedicine(code, name, 0, priceIn, coeff, null, null);
                }
                String amount = reader.readLine();
                String BillName = BillPaths.get(i).getFileName().toString();
                String BillTime = BillName.substring(0, BillName.indexOf(' '));
                Infos[0][i] = foundMed;
                Infos[1][i] = amount;
                Infos[2][i] = BillTime;
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        //Infos[0][i] sẽ chứa object thuốc đã bán được (tạm thời và có thể ko tồn tại trong database)
        //Infos[1][i] sẽ chứa lượng thuốc đã bán (String, not Double)
        return Infos;

        //parse exception nghĩa là ngày tháng trong tên của file bill bị sai, cái này có thể ko cần xử lý
        //NullPointer Exception nghĩa là chưa có data về bill/ lỗi thư mục bill, nên xử lý;
    }

    //nhập thuốc, basically là update stocks;
    public static void ImportMed(Medicine thuocObject, double amount, HashMap<String, Medicine> data)
    {
        boolean update = false;
        List<Medicine> dataList = MedicineHelper.MedList(ExcelHelper.MedData);
        for(Medicine med: dataList)
        {
            if(thuocObject.getCode().equals(med.getCode()))
            {
                update = true;
                if(thuocObject.check(med) == 1) {
                    med.addStocks(amount);
                }
                if(thuocObject.check(med) ==0 && thuocObject.getClass().equals(med.getClass()))
                {
                    med.setShape(thuocObject.getShape());
                    med.setColor(thuocObject.getColor());
                    med.setCoeff(thuocObject.getCoeff());
                    med.setName(thuocObject.getName());
                    med.addStocks(amount);
                    med.setPriceIn(thuocObject.getPriceIn());
                }
                else if(thuocObject.check(med) == -1 || !thuocObject.getClass().equals(med.getClass()))
                {
                    update = false;
                }
            }
        }
        if(!update)
        {
            data.put(thuocObject.getCode(), thuocObject);
        }

    }

    //xuất thuốc, basically update stocks với kiểm tra điều kiện âm và có báo lỗi
    public static void ExportMed(String key, double amount, HashMap<String, Medicine> data) throws IOException
    {
        if(data.get(key).getStocks() >= amount)
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
        else throw new IOException("Numbers are too large");

    }

    //chỉnh sửa thông tin của thuốc
    public static void Edit(String oldKey, HashMap<String, Medicine> Data, String key, String name, double coeff, double priceIn, String color, String shape) throws IOException
    {
        if(Data.containsKey(oldKey))
        {
            Medicine newMed = Data.get(oldKey);
            newMed.setCode(key);
            newMed.setName(name);
            newMed.setCoeff(coeff);
            newMed.setPriceIn(priceIn);
            newMed.setColor(color);
            newMed.setShape(shape);
            Data.remove(oldKey);
            Data.put(newMed.getCode(), newMed);
        }
        else throw new IOException("No Medicine Found!");
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
        output.write(obj.getClass().toString());
        output.newLine();
        output.write(obj.getCode());
        output.newLine();
        output.write(obj.getName());
        output.newLine();
        output.write(Double.toString(obj.getCoeff()));
        output.newLine();
        output.write(Double.toString(obj.getPriceIn()));
        output.newLine();
        output.write(Double.toString(amount));
        output.close();
        writer.close();
    }
}
