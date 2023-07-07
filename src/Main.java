import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lidl.com/register");
        WebElement firstName = driver.findElement(By.id("input0"));
        firstName.click();
        firstName.sendKeys("Elvira");


  

        WebElement lastName = driver.findElement(By.id("input1"));
        lastName.sendKeys("Nazir");
        WebElement email = driver.findElement(By.id ("input2"));
        email.sendKeys("elvira.nzr@gmail.com");
        WebElement confirmemail = driver.findElement(By.id("input3"));
        confirmemail.sendKeys("elvira.nzr@gmail.com");
      
      
     
      
         WebElement password = driver.findElement(By.id("input4"));
        password.sendKeys("Techno-B-8");
        WebElement phoneNumber =driver.findElement(By.id("input5"));
        phoneNumber.sendKeys("4044679532");
        WebElement zipcode = driver.findElement(By.id("input6"));
        zipcode.sendKeys("30004");


    }
}