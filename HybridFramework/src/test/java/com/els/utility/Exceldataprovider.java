package com.els.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	
	XSSFWorkbook wb;
	public Exceldataprovider()
	{
		File src=new File("C:\\Users\\shail\\git\\HybridFramework\\HybridFramework\\TestData\\data.xlsx");
		try {
		FileInputStream fis=new FileInputStream(src);
		
		  wb= new XSSFWorkbook(fis);
		} catch (IOException e) {
			System.out.print("Unable to read Excel file"+e.getMessage());
		}
			
	}
	
	public String getStringData(String Sheetname,int row,int col)
	{
		return wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
		
	}
	
	public String getStringData(int SheetIndex,int row,int col)
	{
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(col).getStringCellValue();
		
	}
	public void getNumbericData()
	{
		
	}

}
