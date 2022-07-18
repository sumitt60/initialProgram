package excelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.ITestResult;

public class Basic1 {

	public static void main(String[] args)throws EncryptedDocumentException, IOException {

		//To reach the file
		FileInputStream file = new FileInputStream("C:\\Users\\SUMIT\\Dropbox\\PC\\Desktop\\Excel Test\\Test File.xlsx");
		
		
		//To open the file
		Workbook book = WorkbookFactory.create(file);
		
		
		//To get to the sheet
		Sheet sh = book.getSheet("Random");
		
		
		//To highlight a row
		Row r1 = sh.getRow(0);
		
		//To highlight a column
		Cell c1 = r1.getCell(0);
		
		//To fetch information
		String content = c1.getStringCellValue();
		
		System.out.println(content);
		
		
		
		
		
	}

}
