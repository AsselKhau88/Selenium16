package class01.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1HW {
    /*
   navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
   fill out the form
   close the browser
   Note: use name or id as locators
   */
    public static void main(String[] args) throws InterruptedException, RuntimeException {


        WebDriver driver=new ChromeDriver();



        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        Thread.sleep(2000);
        //maximize the window
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Monika");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Miller");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.street")).sendKeys("23 Eagle Street");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.city")).sendKeys("San Diego");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("564445");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("75842615948");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.ssn")).sendKeys("458712665");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("monika@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.password")).sendKeys("Miller123");
        Thread.sleep(2000);
        driver.findElement(By.name("repeatedPassword")).sendKeys("Miller123");
        Thread.sleep(2000);
        driver.quit();

    }}


