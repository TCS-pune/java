package Utilitypack;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility {

	public static String putData(int rowindex, int cellindex) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return data;
	}

	

}
