package meghana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC012invald {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MD\\Desktop\\firefoxnew\\geckodriver.exe");
		WebDriver bu = new FirefoxDriver();
		bu.get("http://dmlogics.in/build2/Loging.html");
		bu.findElement(By.xpath("//input[@name='id']")).sendKeys("ramesh");
		bu.findElement(By.name("pass")).sendKeys("ramesh");
		bu.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		if(bu.switchTo().alert().getText().equals("Invalid UserID & Password"))
			System.out.println("pass");
		else
			System.out.println("fail");
		bu.switchTo().alert().accept();
		bu.close();

	}

}
