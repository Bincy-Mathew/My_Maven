package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CodeExampleExcel {// Here we write all codes that we need to return
	//file--->workbook--->sheet--->row--->column--->value fetch.
	public static FileInputStream f;// to find out the given file.
	public static XSSFWorkbook w;//to find out the workbook.
	public static XSSFSheet s;// to find out the sheet.
	
	public static  String readStringValue(int i, int j ) throws IOException  
	{
		
		
		f = new FileInputStream ("C:\\Users\\hp\\Desktop\\ExcelReadCousins.xlsx");//for finding the file by this link
		w =new XSSFWorkbook(f);//Then fetch that workbook from that  file
		s=w.getSheet("Cousins");//then it will fetch/get the sheet from that Cousins sheet
		XSSFRow r = s.getRow(i);// we call with s because row is within the sheet
		XSSFCell c =r.getCell(j);//we call with r because column is next to its corresponding row
		return c.getStringCellValue();//inbuilt for getting the value of cell 
				
	}
	
	
	public static  double readIntegerValue(int i, int j) throws IOException  
	{
		
		
		f = new FileInputStream ("C:\\Users\\hp\\Desktop\\ExcelReadCousins.xlsx");//for finding the file by this link
		w =new XSSFWorkbook(f);//Then fetch that workbook from that  file
		s=w.getSheet("Cousins");//then it will fetch/get the sheet from that Cousins sheet
		XSSFRow r = s.getRow(i);// we call with s because row is within the sheet
		XSSFCell c =r.getCell(j);//we call with r because column is next to its corresponding row
		return c.getNumericCellValue();//inbuilt for getting the value of cell 
	
	}

}
