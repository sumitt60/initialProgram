package excelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic4 {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		String input;
	
		input = "C:\\Users\\SUMIT\\Dropbox\\PC\\Desktop\\Excel Test\\Test File.xlsx";
		
		FileInputStream file = new FileInputStream(input);
		
		Workbook book = WorkbookFactory.create(file);
		
		String a;
		a = book.getSheet("Random").getRow(0).getCell(0).getStringCellValue();		
		
		System.out.println(a);
		
		
		
	
		
	}
	
}
