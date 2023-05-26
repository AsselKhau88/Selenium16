package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    //navigate
    //"http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard"
    public static void main(String[] args) throws InterruptedException {
        //declare the instance.
        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //maximize the screen
        driver.manage().window().maximize();


        // driver.findElement(By.id("txtUsername"));
        //or you can do this one

        //find the element TextBox
        WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");

        //slow down
        Thread.sleep(2000);

        //after sending the username to the textBox clear the text box JUST FOR PRACTICE
        userNameTextBox.clear();

        //sending the username again
        userNameTextBox.sendKeys("Admin");

        //find the password
        WebElement pass=driver.findElement(By.name("txtPassword"));
        pass.sendKeys(("Hum@nhrm123"));

        //find the login button
        WebElement loginButton=driver.findElement(By.className("button"));
        loginButton.click();

        //get the welcome message
        WebElement message=driver.findElement(By.linkText("Welcome Admin"));
        String text=message.getText();
        System.out.println(text);
        //click on the recruitment tab

        driver.findElement(By.partialLinkText("Recru")).click();


    }
}
