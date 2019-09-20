package meghana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC009LOGIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MD\\Desktop\\firefoxnew\\geckodriver.exe");
		WebDriver to = new FirefoxDriver();
		to.get("http://dmlogics.in/build2/Loging.html");
		to.findElement(By.xpath("//input[@name='id']")).sendKeys("ramesh");
		to.findElement(By.name("pass")).sendKeys("kishore");
		to.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		if(to.switchTo().alert().getText().equals("Invalid UserID"))
			System.out.println("pass");
		else
			System.out.println("fail");
		to.switchTo().alert().accept();
		to.close();
		
		
	}

}
