package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FlightCheck extends AbstractClass{
	@Test
	public static void FlightCheck() {
		WebElement w =driver.findElement(By.xpath("//*[@style ='margin-left:20px;']/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody[1]/tr[2]/td[2]/a"));
		w.click();
	}
	
}
