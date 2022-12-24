package Utilitypack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_OrangeHrm {

	public static String putData(int row, int cell) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("C:\\\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
}
