package com.ensa;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// 3:
// ce code est utilisé afin que le bureau d'ordre peut enregister une demande.
public class Main {

	public static void main(String[] args) throws InterruptedException{
	     System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://127.0.0.1:5173/login");
	        driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        Thread.sleep(2000);
	        WebElement inputEmail = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
	        inputEmail.sendKeys("bureau-order@gmail.com");
	        Thread.sleep(500);
	        
	        WebElement inputPasswd = driver.findElement(By.xpath("//input[@id='passwdInput']"));
	        inputPasswd.sendKeys("123456789");
	        Thread.sleep(1000);
	        
	        WebElement ButtonLogin = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]"));
	        ButtonLogin.click();
	        Thread.sleep(4000);
	        
	        WebElement ButtonSave = driver.findElement(By.xpath("//div[@id='save_27S11T']"));
	        ButtonSave.click();															
	        Thread.sleep(1000);
	        
	        WebElement ButtonSure = driver.findElement(By.xpath("//p[contains(text(),'Oui, je suis sûr(e)')]"));
	        ButtonSure.click();
	        Thread.sleep(3000);
	        
	  
	        WebElement svgElement = driver.findElement(By.xpath("//button[@id='closeSvg']"));
	        svgElement.click();
	        Thread.sleep(4000);
	        
	        WebElement ButtonLogOut = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/p[1]"));
			 ButtonLogOut.click();
	        Thread.sleep(3000);
	        
	        driver.close();
	        
	        
	}

}
