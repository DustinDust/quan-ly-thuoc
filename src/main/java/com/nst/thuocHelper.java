package com.nst;

import java.util.ArrayList;
import java.util.List;

public class thuocHelper {
    
    public static List<thuoc> timkiem(String name)
    {
        //ham go here  (tìm kiếm 1 tên thuốc)
        return null;
    }
    public static List<thuoc> danhsach()
    {
        //ham go here(lấy danh sách tất cả thuốc trong database), tôi tạo list 1 cái để đỡ nullpointerexception
        List<thuoc> list= new ArrayList<thuoc>() {};
        thuoc test=new thuoc();
        test.setCode("10");
        test.setName("Paradon");
        test.setColor("Blue");
        test.setCoeff(1.5);
        test.setPriceIn(10);
        test.setShape("circle");
        test.setStocks(100);
        list.add(test);
        return list;
    }
    public static List<thuoc> Statistic(String begin,String end)    //hàm đưa vào 2 khoảng thời gian lấy ra tất cả thuốc đã bán trong khoảng đó kèm theo số lượng bán
    {
        return null;      
    }
}
