package com.oneapp.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
public 	XSSFWorkbook wb;
	
	public ExcelData() {
		
		File file= new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis= new FileInputStream(file);         // for converting the excel file into a RAW data.
			 wb =new XSSFWorkbook(fis);            //In order to read xlsx, we need XSSFworkbook class
		}  
		catch (Exception e) {
			System.out.println("Unable to read excel file "+e.getMessage());	
		}
		
	}
		public String getStringData(String SheetName, int Row, int Column)
		{
			return wb.getSheet(SheetName).getRow(Row).getCell(Column).getStringCellValue();
		}
		
		public double getNumericData(String SheetName, int Row, int Column)
		{
			return wb.getSheet(SheetName).getRow(Row).getCell(Column).getNumericCellValue();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
