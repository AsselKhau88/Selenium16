package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        //click on create new account
        WebElement createNewAccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        //because the DOM doesn't have firstname by default
        //it only shows up after click on create new account
        //and the code takes some time

        Thread.sleep(2000);

        //enter first name
       WebElement fName= driver.findElement(By.cssSelector("input[name='firstname']"));
       fName.sendKeys("Anita");

    //   WebElement closePopUp = driver.findElement(By.cssSelector("(img[src$='Gm8t.png']"));


    }
}
