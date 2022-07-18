package excelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic6 {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		//"C:\Users\SUMIT\Dropbox\PC\Desktop\Excel Test\Test File.xlsx"
		
		FileInputStream file = new FileInputStream("C:\\Users\\SUMIT\\Dropbox\\PC\\Desktop\\Excel Test\\Test File.xlsx");

		Workbook book = WorkbookFactory.create(file);
		
		Sheet s = book.getSheet("Random");
		
		System.out.println(s.getWorkbook());
		
		
		System.out.println(s.getDefaultRowHeight());
		System.out.println(s.getRow(0).getCell(0));
		
		
		
		
	}
	
	
	

}
