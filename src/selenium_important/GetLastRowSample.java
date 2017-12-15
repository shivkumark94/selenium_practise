package selenium_important;

import java.io.File;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastRowSample
{
	public static void main(String[] args) throws Exception
	{
		File file=new File("/home/tyss/Desktop/input.xlsx");
		FileInputStream fis=new FileInputStream(file);
		new WorkbookFactory();
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(0);
		int rownum = sh.getLastRowNum();
		short cellnum = r.getLastCellNum();
		System.out.println(rownum);
		System.out.println(cellnum);
		
	}

}
