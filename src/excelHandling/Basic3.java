package excelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic3 {
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
				
		String inputString = "C:\\Users\\SUMIT\\Dropbox\\PC\\Desktop\\Excel Test\\Test File.xlsx";
		
		FileInputStream file = new FileInputStream(inputString);
		
		Workbook book;
		book = WorkbookFactory.create(file);
		
		double value;
		boolean a;
		String content;
	//	value = book.getSheetAt(0).getRow(0).getCell(0).getNumericCellValue();
	//	System.out.println(value);
		
		//a = book.getSheetAt(0).getRow(0).getCell(1).getBooleanCellValue();
		
		content = book.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
		
		
		System.out.println(content);
		
		
	}
	

}
