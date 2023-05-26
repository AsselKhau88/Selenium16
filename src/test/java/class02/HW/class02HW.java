package class02.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class02HW {
    /*
    HW  (only use XPATH)
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    close the popup
    close the browser
    Note : in order for ur code to work
    u have to put Thread.sleep(2000) after clicking on Create new account
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

       WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
       createNewAccount.click();

       Thread.sleep(2000);

       WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
       firstName.sendKeys("Monika");

        Thread.sleep(2000);
        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
       lastName.sendKeys("Miller");

        Thread.sleep(2000);

        WebElement phoneNumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        phoneNumber.sendKeys("7578964251");

        Thread.sleep(2000);

        WebElement password=driver.findElement(By.xpath("//input[@id='password_step_input']"));
        password.sendKeys("M458554ka");

        Thread.sleep(2000);


        driver.close();
        driver.quit();














    }





}
