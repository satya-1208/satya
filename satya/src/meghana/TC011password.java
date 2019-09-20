package meghana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC011password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MD\\Desktop\\firefoxnew\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		bo.get("http://dmlogics.in/build2/Loging.html");
		bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kishore");
		bo.findElement(By.name("pass")).sendKeys("ramesh");
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		if(bo.switchTo().alert().getText().equals("Invalid Password"))
			System.out.println("pass");
		else
			System.out.println("fail");
		bo.switchTo().alert().accept();
		bo.close();

		
	}

}
