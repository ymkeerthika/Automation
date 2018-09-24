package qsp;

import java.io.FileInputStream;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

//import java.io.FileInputStream;

//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {

	public static void main(String[] args)throws Exception{
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		String s = w.getSheet("sheet1").getRow(1).getCell(1).toString();
		System.out.println(s);


	}

}
