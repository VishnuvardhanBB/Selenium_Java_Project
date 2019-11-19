package readTestDataFromExcel;
import java.io.File;
import java.io.FileInputStream;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		String PriceValue=null;
		String BatteryCategory= null;
		String InternalMemory= null;
		String ScreenSize= null;

		System.setProperty("webdriver.gecko.driver","C:\\Vishnuvardhan_Balaji_System_Backup\\Mtech_Software_System\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.amazon.in");
		
		
		
		WebElement SearchItem = driver1.findElement(By.id("twotabsearchtextbox"));
		SearchItem.sendKeys("mobiles");
		WebElement SearchButton = driver1.findElement(By.className("nav-input"));
	    SearchButton.click();			
	    driver1.navigate().to("https://www.amazon.in/s?k=mobiles&rh=n%3A976419031%2Cn%3A1805560031&dc&qid=1569511173&rnid=3576079031&ref=sr_nr_n_2");
	    	    
		for (int i=1; i<=count; i++)
		{
			PriceValue=  sheet1.getRow(i).getCell(1).getStringCellValue();
			Price= sheet1.getRow(i).getCell(2).getStringCellValue();
			BatteryCategory= sheet1.getRow(i).getCell(3).getStringCellValue();
			InternalMemory= sheet1.getRow(i).getCell(4).getStringCellValue();
			ScreenSize= sheet1.getRow(i).getCell(5).getStringCellValue();
			
			driver1.navigate().to("https://www.amazon.in/s?k=mobiles&i=electronics&rh=n%3A976419031%2Cn%3A1805560031%2Cp_n_feature_thirteen_browse-bin%3A8561100031%7C8561101031%2Cp_n_feature_six_browse-bin%3A6631756031&dc&qid=1574172563&rnid=1318502031&ref=sr_nr_p_36_2");
			
		    WebElement MobileMinPrice = driver1.findElement(By.id("low-price"));
		    MobileMinPrice.sendKeys("0");
		    
		    WebElement MobileMaxPrice = driver1.findElement(By.id("high-price"));
		    MobileMaxPrice.sendKeys(PriceValue);
		    
		    WebElement SearchPriceButton = driver1.findElement(By.className("a-button-input"));
		    SearchPriceButton.click(); 
		    System.out.println(PriceValue);
			System.out.println(Price);
			System.out.println(BatteryCategory);
			System.out.println(InternalMemory);
			System.out.println(ScreenSize);
		}
		testDataWB.close();
	}
}
