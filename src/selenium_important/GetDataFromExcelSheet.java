package selenium_important;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelSheet
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("/home/tyss/Desktop/input.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(0);
		org.apache.poi.ss.usermodel.Cell c=r.getCell(0);
		String data=c.getStringCellValue();
		System.out.println(data);
	}

}
