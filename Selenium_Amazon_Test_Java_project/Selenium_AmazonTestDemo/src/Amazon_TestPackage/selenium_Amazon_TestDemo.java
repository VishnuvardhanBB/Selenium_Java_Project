package Amazon_TestPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class selenium_Amazon_TestDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Vishnuvardhan_Balaji_System_Backup\\Mtech_Software_System\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.amazon.in/");
		
		
		WebElement SearchItem = driver1.findElement(By.id("twotabsearchtextbox"));
		SearchItem.sendKeys("mobiles");
		WebElement SearchButton = driver1.findElement(By.className("nav-input"));
	    SearchButton.click();
		
	    driver1.navigate().to("https://www.amazon.in/s?k=mobiles&rh=n%3A976419031%2Cn%3A1805560031&dc&qid=1569511173&rnid=3576079031&ref=sr_nr_n_2");
	    
	    WebElement MobileMinPrice = driver1.findElement(By.id("low-price"));
	    MobileMinPrice.sendKeys("10000");
	    
	    WebElement MobileMaxPrice = driver1.findElement(By.id("high-price"));
	    MobileMaxPrice.sendKeys("30000");
	    
	    //WebElement SearchPriceButton = driver1.findElement(By.cssSelector("input.a-button-input[aria-labelledby='a-autoid-1-announce']"));
	    WebElement SearchPriceButton = driver1.findElement(By.className("a-button-input"));
	    SearchPriceButton.click(); 
	    
	    //WebElement SearchPriceButton = driver1.findElement(By.xpath("//span[contains(@class,'a-button a-spacing-top-mini') and contains(text(), 'Go')]"));
	   // SearchPriceButton.click();
	    
	    
	    
	    driver1.navigate().to("https://www.amazon.in/s?k=mobiles&i=electronics&rh=n%3A976419031%2Cn%3A1805560031%2Cp_36%3A1000000-3000000%2Cp_n_feature_thirteen_browse-bin%3A8561100031|8561101031&dc&qid=1569667405&rnid=8561098031&ref=sr_nr_p_n_feature_thirteen_browse-bin_4");
	    
	      
	    
		 System.exit(0);

	}
}
