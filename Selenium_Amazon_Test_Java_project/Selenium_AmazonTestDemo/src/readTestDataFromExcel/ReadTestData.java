package readTestDataFromExcel;
import java.io.File;
import java.io.FileInputStream;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {
	public static void main (String[] args) throws Exception
	{
		File testDataFile = new File("C:\\Vishnuvardhan_Balaji_System_Backup\\Mtech_Software_System\\Bits Sem 3\\Software Testing Methodology\\Boundary_Value_Analysis_Test_Case.xlsx");
		FileInputStream stream= new FileInputStream(testDataFile);
		XSSFWorkbook testDataWB= new XSSFWorkbook(stream);
		XSSFSheet sheet1= testDataWB.getSheetAt(0); // sheet index starts from 0
		int count = sheet1.getLastRowNum(); // row count from 0 to n-1
		System.out.println("Total row count:: "+count);
		String Price= null;
		String BatteryCategory= null;
		String InternalMemory= null;
		String ScreenSize= null;
		for (int i=0; i<=count; i++)
		{
			Price= sheet1.getRow(i).getCell(1).getStringCellValue();
			BatteryCategory= sheet1.getRow(i).getCell(2).getStringCellValue();
			InternalMemory= sheet1.getRow(i).getCell(3).getStringCellValue();
			ScreenSize= sheet1.getRow(i).getCell(4).getStringCellValue();
			System.out.println(Price);
			System.out.println(BatteryCategory);
			System.out.println(InternalMemory);
			System.out.println(ScreenSize);
		}
		testDataWB.close();
	}
}
