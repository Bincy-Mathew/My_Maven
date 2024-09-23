package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
//file---workbook---sheet---row and column
	// if we need to fetch above details java has 3 predefined class.
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public static String readStringData(int i, int j) throws IOException
	{
		f =new FileInputStream("C:\\Users\\hp\\Desktop\\ExcelRead.xlsx");
		w= new XSSFWorkbook(f);// workbook inside the file
		s= w.getSheet("Sheet1");//sheet inside the workbook
		XSSFRow r = s.getRow(i);//XSSFRow is predefined class and it denoted to 
		XSSFCell c= r.getCell(j);//column fetching
		return c.getStringCellValue();//for fetching only cell value
		
		
	}	
	
	
	public static double readIntegerData(int i, int j) throws IOException
	
	{
		f =new FileInputStream("C:\\Users\\hp\\Desktop\\ExcelRead.xlsx");
		w= new XSSFWorkbook(f);// workbook inside the file
		s= w.getSheet("Sheet1");//sheet inside the workbook
		XSSFRow r = s.getRow(i);//XSSFRow is predefined class and it denoted to 
		XSSFCell c= r.getCell(j);
		return c.getNumericCellValue();
	}
	
}
