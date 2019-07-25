package BB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Prac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		//driver.findElement(By.name("userName")).sendKeys("hello");
		//driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
		//driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//driver.findElement(By.linkText("Register here")).click();
		//driver.findElement(By.partialLinkText("here")).click();
		//driver.findElement(By.className("inputtext")).sendKeys("hello");
		/*List<WebElement>  al=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(al.size());

		for(int i=0;i<al.size();i++)
		{
			System.out.println("radio button text:"+al.get(i).getAttribute("value"));
		}
		//driver.close();*/
		/*WebElement w=driver.findElement(By.name("country"));
		Select s=new Select(w);
		Thread.sleep(300);
		s.selectByVisibleText("ANDORRA");
		Thread.sleep(300);
		s.selectByValue("ANTIGUA AND BARBUDA");
		Thread.sleep(300);
		s.selectByIndex(4);*/

		/*WebElement w=driver.findElement(By.id("fruits"));
		Select s=new Select(w);
		Thread.sleep(300);
		s.selectByVisibleText("Banana");
		Thread.sleep(300);
		s.selectByValue("grape");
		Thread.sleep(300);
		s.selectByIndex(2);*/
		/*WebElement d=driver.findElement(By.id("day"));
		Select s1=new Select(d);
		s1.selectByIndex(1);
		WebElement m=driver.findElement(By.id("month"));
		Select s2=new Select(m);
		s2.selectByValue("2");
		WebElement y=driver.findElement(By.id("year"));
		Select s3=new Select(y);
		s3.selectByVisibleText("2014");*/
		WebElement w=driver.findElement(By.name("country"));
		Select s=new Select(w);
		Thread.sleep(300);
		s.selectByIndex(2);
		Thread.sleep(300);
		s.selectByVisibleText("ANTIGUA AND BARBUDA");
		Thread.sleep(300);
		s.selectByValue("BELGIUM");

		int l=s.getOptions().size();
		List<WebElement> arl=s.getOptions();//if same names elements are there u can use findelements method but if during drop down no same names 
		//options are there then 
		//Syntax: select.getOptions ();
		//Returns: List
		//Purpose: Returns all the option elements displayed in this select tag (dropdown list)
		System.out.println(l);
		Thread.sleep(300);
		for(WebElement lw : arl)
		{
			System.out.println(lw.getText());
		}
		Thread.sleep(300);
		int sl=s.getAllSelectedOptions().size();
		System.out.println(sl);
		List<WebElement> asl=s.getAllSelectedOptions();
		for(WebElement t:asl)
		{
			System.out.println("FOR SELECTED OPTIONS"+" "+t.getText());
		}

		WebElement f=s.getFirstSelectedOption();
		System.out.println("first selected webelement value"+f.getAttribute("value"));
		Thread.sleep(300);
		if(s.isMultiple())
		{
			System.out.println("Select tag allows multiple selection");	 
		}
		else
		{
			System.out.println("Select tag does not allow multiple selection");	
		}



	}

}
