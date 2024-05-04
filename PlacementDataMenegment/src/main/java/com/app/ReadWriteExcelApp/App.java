
package com.app.ReadWriteExcelApp;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        
        
       ExcelService servie = new ExcelService();
       List<User> userList = servie.ReadDataFromExcel("E:\\KAPIL 22\\placement_details.xlsx");
       //System.out.println("userList........ "  +  userList);
         
    }
    
    

}
