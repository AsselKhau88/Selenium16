package class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    /*
    goto facebook.com
    click on create account
    and select your date of birth using select class
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid = 'open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(2000);

        WebElement month= driver.findElement(By.cssSelector("select[id= 'month']"));
        Select s = new Select(month);
        s.selectByValue("8");

        Thread.sleep(2000);

        WebElement day= driver.findElement(By.cssSelector("select[id= 'day']"));
        Select s1 = new Select(day);
        s1.selectByIndex(2);

        Thread.sleep(2000);

        WebElement year= driver.findElement(By.cssSelector("select[id= 'year']"));
        Select s2 = new Select(year);
        s2.selectByVisibleText("1988");

        Thread.sleep(2000);

        driver.quit();



    }
}
