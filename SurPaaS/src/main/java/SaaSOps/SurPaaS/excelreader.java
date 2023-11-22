package SaaSOps.SurPaaS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("D:\\SepBatchJava\\mybook.xlsx");
		
		//read file image,audio,xls 
		FileInputStream fis = new FileInputStream(f);		
		//workbook
		XSSFWorkbook  workbook= new XSSFWorkbook(fis);//mybook open
		
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		
		//rows and cols
		int rows =sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		
		//1.no.of wrows,iterate,,come to 1st row,total no.of cell,cell point
		
		for(int i=1;i<rows;i++) {
			
			XSSFRow  rowval=sheet.getRow(i);			
			int cells=rowval.getLastCellNum();			
			for(int j=0;j<cells;j++)
			{
								
			XSSFCell  cell=rowval.getCell(j);			
			//numeric,blank/null,string
			//find the cell ty[e			
			if(cell.getCellType()==CellType.STRING) {
				System.out.println(cell.getStringCellValue());

			}else if(cell.getCellType()==CellType.NUMERIC) {
				cell.getNumericCellValue();//.0
				int d=(int)cell.getNumericCellValue();
			}else if(cell.getCellType()==CellType.BLANK || cell==null) {
				//javanullpointer
				
			}
			
			if(j==1)
			if(rowval.getCell(2)==null || rowval.getCell(2).getCellType()==CellType.BLANK) {
				
				//create cell and write
				rowval.createCell(2);
				rowval.getCell(2).setCellValue("false");
				
			}else {
				//setcellvalue
				rowval.getCell(2).setCellValue("true");
				
			}
				//excel should not be in open state
				//byte,,fileoutstream
				
			}
			
		}
		//mandataory
		FileOutputStream fos= new FileOutputStream(f);
		//write
		workbook.write(fos);
		//close
		fos.close();
		
		
		
	}

}

