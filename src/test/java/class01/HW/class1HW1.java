package class01.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1HW1 {
     /*
    navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
    enter the username "Tester"
    enter the password "test"
    get the title of the webPage and confirm that it is  "Web Orders Login"
    ------------------__------__**happy coding ***

     */

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.className("txt")).sendKeys("Tester");
        Thread.sleep(2000);

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(2000);

        String url=driver.getCurrentUrl();
        System.out.println(url);

        Thread.sleep(2000);

        String title=driver.getTitle();
        System.out.println(title);

        Thread.sleep(2000);


        if(title.equals("Web Orders Login")){
            System.out.println("the title is correct");
        }
        else{
            System.out.println("the title is incorrect");
        }


        driver.quit();

    }
}
