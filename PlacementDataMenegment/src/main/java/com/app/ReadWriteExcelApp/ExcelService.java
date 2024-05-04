package com.app.ReadWriteExcelApp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelService {
	
	
    
	public static void writeToExcelSheet() {
    	
		  String[] row_heading = {"First Name","Last Name","Address","Email"};
		  
		  List<User> users = createUserData();

    	 XSSFWorkbook workbook = new XSSFWorkbook();
         
         XSSFSheet spreadsheet = workbook.createSheet( "User Details ");
			Row headerRow = spreadsheet.createRow(0);

         // Creating header
	        for (int i = 0; i < row_heading.length; i++) {
				Cell cell = headerRow.createCell(i);
				cell.setCellValue(row_heading[i]);
			}
	     // Creating data rows for each user
	        for(int i = 0; i < users.size(); i++) {
	        	Row dataRow = spreadsheet.createRow(i + 1);
	        	dataRow.createCell(0).setCellValue(users.get(i).getStudent_Name());
	        	dataRow.createCell(1).setCellValue(users.get(i).getYear());
	        	dataRow.createCell(2).setCellValue(users.get(i).getCompany_Name());
	        	dataRow.createCell(3).setCellValue(users.get(i).getGPA());
	        } 
	        
	      //Write the workbook in file system
	        FileOutputStream out;
			try {
				out = new FileOutputStream( new File("E:\\\\KAPIL 22\\\\placement_details.xlsx"));
				 
		        workbook.write(out);
		        out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	       
	        System.out.println("Write to excel sheet done  successfully...........");
	        
    }
    
    
	public static  List<User> createUserData() {

		List<User> users = new ArrayList<User>();
		users.add(new User("Lipsa", 2024, "BBSR","Placed" ,9.5));
		users.add(new User("Ravish", 2024, "Banglore","not Placed",6.5));
		users.add(new User("Julia", 2024,  "Amsterdam","Placed",7.5));
		users.add(new User("Meghna", 2024, "London","not Placed",8.5));
		users.add(new User("Morish", 2024,  "USA","Placed",6.5));
    	return users;
	}
	
	
  
	public List<User> ReadDataFromExcel(String path) {

		List<User> userList = new ArrayList<User>();
		
		try {
            XSSFWorkbook workbook = new XSSFWorkbook(path); 
			
			// Retrieving the number of sheets in the Workbook
	      //  System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
	        //System.out.println("Retrieving Sheets using for-each loop");
	        for(Sheet sheet: workbook) {
	        	
	        	
	        	int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	        	//System.out.println("rowCount........ "  +  rowCount);
	        	for (int i=1; i<=rowCount; i++) {
	        		 Row row = sheet.getRow(i);
	        		// System.out.println("no of rows.... "  +  row.getRowNum() );
	        		 String studentName = row.getCell(0).getStringCellValue();
	        		 int year = row.getCell(1).getColumnIndex();
	        		 String companyName = row.getCell(2).getStringCellValue();
	        		 String placeMentStatus = row.getCell(3).getStringCellValue();
	        		 double gpa = row.getCell(4).getNumericCellValue();
	             	
	                 System.out.println("firstName........ "  + studentName);	
	                 System.out.println("lastName........ "  + year);	
	                 System.out.println("email........ "  + companyName);	
	                 System.out.println("address........ "  + placeMentStatus);	
	                 System.out.println("address........ "  + gpa);	
	                 System.out.println("-----------------------------------------");	
	              User user = new User();
	              user.setStudent_Name(studentName);
	              user.setYear(year);
	              user.setCompany_Name(companyName);
	              user.setPlacementStatus(placeMentStatus);
	              user.setGPA(gpa);
	              
	              userList.add(user);   
	        	 }
	        	
	        }
		}catch (IOException e) {
			e.printStackTrace();
		}
		return userList;
	
		
		
	}
	
	

}
