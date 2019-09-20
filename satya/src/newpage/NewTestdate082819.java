package newpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestdate082819 {
  
	WebDriver bo;

	@Test(enabled=true,priority=19,groups="login")
  public void TC009() {
	  bo.findElement(By.xpath("//input[@name='id']")).sendKeys("ramesh");
		bo.findElement(By.name("pass")).sendKeys("kishore");
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		Assert.assertEquals(bo.switchTo().alert().getText(), "Invalid UserID");
		bo.switchTo().alert().accept();
		
  }
  @Test(enabled=true,priority=111,groups="login")
  public void TC011() {
	  bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kishore");
		bo.findElement(By.name("pass")).sendKeys("ramesh");
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		Assert.assertEquals(bo.switchTo().alert().getText(), "Invalid Password");
		bo.switchTo().alert().accept();
				
  }
  @Test(enabled=true,priority=112,groups="admin")
  public void TC012() {
	  bo.findElement(By.xpath("//input[@name='id']")).sendKeys("ramesh");
		bo.findElement(By.name("pass")).sendKeys("ramesh");
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		Assert.assertEquals(bo.switchTo().alert().getText(), "Invalid UserID");
		bo.switchTo().alert().accept();
		
  }
  @BeforeMethod 
  public void TC007() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\MD\\Desktop\\firefoxnew\\geckodriver.exe");
		bo = new FirefoxDriver();
		bo.get("http://dmlogics.in/build2/Loging.html");
		
	  
  }
  
  @AfterMethod
  public void TC006() {
	  bo.close();
	  
  }
}
