package class03.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
     /*
    Open Chrome browser
    Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
    fill in the complete form
    */
     public static void main(String[] args) throws InterruptedException {

     WebDriver driver=new ChromeDriver();

     driver.manage().window().maximize();

     driver.get("http://practice.syntaxtechs.net/input-form-demo.php");


         WebElement firstName= driver.findElement(By.cssSelector(" input[name = 'first_name']"));
        firstName.sendKeys("Monika");

         Thread.sleep(2000);

         WebElement lastName= driver.findElement(By.cssSelector(" input[name = 'last_name']"));
         lastName.sendKeys("Jones");

         Thread.sleep(2000);

         WebElement eMail= driver.findElement(By.cssSelector(" input[name = 'email']"));
         eMail.sendKeys("mjones70@gmail.com");

         Thread.sleep(2000);

         WebElement phone= driver.findElement(By.cssSelector("input[name = 'phone']"));
         phone.sendKeys("(757)89-43629");

         Thread.sleep(2000);

         WebElement homeAddress= driver.findElement(By.cssSelector("input[name = 'address']"));
         homeAddress.sendKeys("8579 Eagle Creek Rd");

         Thread.sleep(2000);


         WebElement city= driver.findElement(By.cssSelector(" input[name = 'city']"));
         city.sendKeys("San Diego");

         Thread.sleep(2000);

         WebElement state = driver.findElement(By.xpath("//select[@name='state']"));

         Select sel=new Select(state);

         sel.selectByVisibleText("California");

         Thread.sleep(2000);

         WebElement zipCode= driver.findElement(By.cssSelector(" input[name = 'zip']"));
         zipCode.sendKeys("85247");

         Thread.sleep(2000);

         WebElement webSite= driver.findElement(By.cssSelector(" input[name = 'website']"));
         webSite.sendKeys("Syntax-Website for practice Syntax Automation Platform");

         Thread.sleep(2000);


         WebElement checkBox= driver.findElement(By.xpath("//input[@value='no']"));
         checkBox.click();

         WebElement projectDescription=driver.findElement(By.xpath("//textarea[@name='comment']"));
         projectDescription.sendKeys("Automation testing platform by Syntax");

         Thread.sleep(2000);

         WebElement sendButton=driver.findElement(By.xpath("//button[text()='Send ']"));
         sendButton.click();



         driver.quit();
     }
}