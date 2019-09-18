package ApachePoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLutils {

	public static int getRowCount(String xlfile,String xlsheet) throws IOException {
	
		FileInputStream fi = new FileInputStream(xlfile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		Sheet ws=wb.getSheet(xlsheet);
		
		int rowCount=ws.getLastRowNum();
		
		wb.close();
		
		fi.close();
		
		return rowCount;
		

	}
	public static int getcolCount(String xlfile,String xlsheet,int rowNum) throws IOException {
		
		FileInputStream fi = new FileInputStream(xlfile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		Sheet ws =wb.getSheet(xlsheet);
		
		Row r = ws.getRow(rowNum);
		
		int colCount = r.getLastCellNum();
	
		wb.close();
		
		fi.close();
		
		return colCount;
	
	
	}
	
	
	public static String getCelldata(String xlfile,String xlsheet,int rowNum,int colNum) throws IOException {
		
		
		FileInputStream fi =new FileInputStream(xlfile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		Sheet ws = wb.getSheet(xlsheet);
		
		Row r = ws.getRow(rowNum);
		
		String data;
		
		try {
			
			Cell c=r.getCell(colNum);
			
			 data = c.getStringCellValue();
			
			
		} catch (Exception e) {
			
			 data = "";
		}
		
		
		fi.close();
		
		wb.close();
		
		return data;
	}

	public static void setCellData(String xlfile,String xlsheet,
			 int rownum,int colnum,String data) throws IOException{
		
		FileInputStream fi =new FileInputStream(xlfile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		Sheet ws = wb.getSheet(xlsheet);
		
		Row r = ws.getRow(rownum);
		
		Cell c = r.createCell(colnum);
		
		c.setCellValue(data);

		FileOutputStream fo = new FileOutputStream(xlfile);
		
		wb.write(fo);
		
		wb.close();
		
		fi.close();
		
		fo.close();
		
	}
	
	public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
		
		FileInputStream fi =new FileInputStream(xlfile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		Sheet ws = wb.getSheet(xlsheet);
		
		Row r = ws.getRow(rownum);
		
		Cell c = r.getCell(colnum);
		
		CellStyle style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		c.setCellStyle(style);
		
		FileOutputStream fo = new FileOutputStream(xlfile);
		
		wb.write(fo);
		
		wb.close();
		
		fi.close();
		
		fo.close();
		
		
	}
	
	
	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
	
		FileInputStream fi = new FileInputStream(xlfile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		Sheet ws =wb.getSheet(xlsheet);
		
		Row r= ws.getRow(rownum);
		
		Cell c = r.getCell(colnum);
		
		CellStyle style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		c.setCellStyle(style);
		
		FileOutputStream fo = new FileOutputStream(xlfile);
		wb.write(fo);
		
		wb.close();
		
		fi.close();
		
		fo.close();
	}
}
