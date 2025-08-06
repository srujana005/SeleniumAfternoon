package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadtoExl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		// 1. Load the Excel file from the given path
		File file = new File("./ExcelFile/data1.xlsx");

		// 2. Create a stream to read the Excel file
		FileInputStream fis = new FileInputStream(file);

		// 3. Create a Workbook instance from the input stream
		Workbook wb = WorkbookFactory.create(fis);

		// 4. Get the first sheet from the workbook (index 0)
		Sheet sheet = wb.getSheetAt(0);

		// 5. Loop through each row from 0 to the last row with data
		for (int i = 0; i <= sheet.getLastRowNum(); i++)

		{

			// Get the current row

			Row row = sheet.getRow(i); // row --> admin2 pass2

			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);

				String u = cell.toString();
				j++;
				Cell cell2 = row.getCell(j);
				String p = cell2.toString(); // test1(u,p);

				System.out.print(u + "\t" + p);
			}
			System.out.println();
		}

	}

}
