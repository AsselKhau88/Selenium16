package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver=new ChromeDriver();

        //facebook.com
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);
        //maximize the window
        driver.manage().window().maximize();

        //send some text in the email
        // find the element          . send some text
        driver.findElement(By.id("email")).sendKeys("assel@gmail.com");
        Thread.sleep(2000);

        //send some text to the password field
        driver.findElement(By.name("pass")).sendKeys("abracadabra");
        Thread.sleep(2000);

       //print the url on console
        String url=driver.getCurrentUrl();
        System.out.println(url);

        Thread.sleep(2000);

        //print title on  the console
        String title=driver.getTitle();
        System.out.println(title);

//        confirm that the title is "Facebook – log in or sign up"
        if(title.equals("Facebook – log in or sign up")){
            System.out.println("the title is correct");
        }
        else{
            System.out.println("the title is incorrect");
        }
//        close
        driver.quit();





    }

}
