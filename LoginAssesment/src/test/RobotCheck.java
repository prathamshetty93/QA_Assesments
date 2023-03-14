package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

@Test
public class RobotCheck {
    public static void main(String args[]) throws AWTException, InterruptedException {
        System.setProperty("Webdriver.chrome.driver","/Users/ppshetty/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@class='makeFlex hrtlCenter column active']")).click();
        Thread.sleep(2000);

        Robot robot =new Robot();


        StringSelection ss= new StringSelection("/Users/ppshetty/Desktop/Screenshots/checkout.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

}
