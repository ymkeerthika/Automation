package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	public static String getPropertyValue(String path,String key) {
		String v="";
		try {
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return v;
	}
	public static void writeResultToXL(String path,String sheet,int pass,int fail) {
		try {
			Workbook w=WorkbookFactory.create(new FileInputStream(path));
			w.getSheet(sheet).getRow(1).getCell(0).setCellValue(pass);
			w.getSheet(sheet).getRow(1).getCell(1).setCellValue(fail);
			w.write(new FileOutputStream(path));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
