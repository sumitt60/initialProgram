package excelHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic5 {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		String input;
	
		input = "C:\\Users\\SUMIT\\Dropbox\\PC\\Desktop\\Excel Test\\Test File.xlsx";
		
		FileInputStream file = new FileInputStream(input);
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sh = book.getSheet("Random");
		
		int a = sh.getLastRowNum();
		System.out.println(a);
		System.out.println("Last Cell: "+sh.getRow(0).getLastCellNum());
		
	
		
		for(int i = 0; i <= a; i++)
		{
			int b = sh.getRow(i).getLastCellNum()-1;
			
			for(int j = 0; j <= b; j++)
			{
				System.out.print(sh.getRow(i).getCell(j)+" ");
			}
			
			System.out.println();
		}	
	
	}
}
