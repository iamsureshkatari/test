package test.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./DataProvider2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		
		System.out.println(sh.getPhysicalNumberOfRows());

		System.out.println("Changes to readfile.java on branch excel-comments");
		
		
		Iterator rowIterator = sh.rowIterator();
		while(rowIterator.hasNext()) {
			Row row = (Row) rowIterator.next();
			Iterator col = row.cellIterator();
			while(col.hasNext()) {
				Cell c = (Cell) col.next();
				System.out.print(c + "\t\t");
			}
			System.out.println();
			System.out.println(row.getPhysicalNumberOfCells());
		}
		

	}

}
