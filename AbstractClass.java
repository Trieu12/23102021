package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(TestNG.ListenerTest.class)
public class AbstractClass {

	public static String baseUrl = "http://demo.guru99.com/test/newtours/index.php";
    public static String driverPath = "E:\\HOCTAP\\KIỂM THỰ TỰ ĐỘNG\\geckodriver.exe";
    public static WebDriver driver; 
   

    
    @BeforeTest 
	public void beforeTest()
	{
    	System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
    
   
    @AfterTest 
	public void tearDown()
	{
		//driver.close();
	}
  
    @BeforeClass
	public void beforeClass()
	{
    	//System.out.println("Start testing for class");
	}
  

    @org.testng.annotations.AfterClass
	public void AfterClass()
	{
    	//System.out.println("End testing for class");
	}
}