package class03.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
   Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
   Enter valid username
   Leave password field empty
   Click on login button
   Verify that error message with text “Password cannot be empty” is displayed.
    */
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
        userName.sendKeys("Admin");

        WebElement loginBtn= driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();

        WebElement errorMessage= driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String message=errorMessage.getText();
        System.out.println(message);

        if(message.equals("Password cannot be empty")){
            System.out.println("Error message is displayed");
        }else{
            System.out.println("Error message is not displayed");

            Thread.sleep(2000);
            driver.quit();
        }





    }
}