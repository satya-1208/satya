package newpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Framework {
  @Test(enabled=true,priority=19,groups="login")
  public void TC009() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\MD\\Desktop\\firefoxnew\\geckodriver.exe");
		WebDriver to = new FirefoxDriver();
		to.get("http://dmlogics.in/build2/Loging.html");
		to.findElement(By.xpath("//input[@name='id']")).sendKeys("ramesh");
		to.findElement(By.name("pass")).sendKeys("kishore");
		to.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		Assert.assertEquals(to.switchTo().alert().getText(), "Invalid UserID");
		to.switchTo().alert().accept();
		to.close();
  }
  @Test(enabled=true,priority=111,groups="login")
  public void TC011() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\MD\\Desktop\\firefoxnew\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		bo.get("http://dmlogics.in/build2/Loging.html");
		bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kishore");
		bo.findElement(By.name("pass")).sendKeys("ramesh");
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		Assert.assertEquals(bo.switchTo().alert().getText(), "Invalid Password");
		bo.switchTo().alert().accept();
		bo.close();
				
  }
  @Test(enabled=true,priority=112,groups="admin")
  public void TC012() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\MD\\Desktop\\firefoxnew\\geckodriver.exe");
		WebDriver bu = new FirefoxDriver();
		bu.get("http://dmlogics.in/build2/Loging.html");
		bu.findElement(By.xpath("//input[@name='id']")).sendKeys("ramesh");
		bu.findElement(By.name("pass")).sendKeys("ramesh");
		bu.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		Assert.assertEquals(bu.switchTo().alert().getText(), "Invalid UserID");
		bu.switchTo().alert().accept();
		bu.close();

		
  }
}
