package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClass {

    @Test
    void testFileUploadUsingRobot() throws AWTException {
        Robot robot = new Robot();
        System.setProperty("Webdriver.chrome.driver", "/Users/ppshetty/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        WebElement ele=driver.findElement(By.xpath("//input[@id='imagesrc']"));
        Actions act=new Actions(driver);
        act.moveToElement(ele).click().build().perform();
        StringSelection stringSelection = new StringSelection("addcarts.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.delay(9000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
        robot.mouseMove(550,400);
        robot.delay(3000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
