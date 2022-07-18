package excelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		String inputString = "C:\\Users\\SUMIT\\Dropbox\\PC\\Desktop\\Excel Test\\Test File.xlsx";
	
		FileInputStream file = new FileInputStream(inputString);
		
		Workbook Book = WorkbookFactory.create(file);
		
		Sheet sh = Book.getSheet("Random");
		
		Row r1 = sh.getRow(1);
		
		Cell c1 = r1.getCell(1);
		
		String content = c1.getStringCellValue();
		
		System.out.println(content);		
		
	}
	
	
}
