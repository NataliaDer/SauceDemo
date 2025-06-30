import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
    @Test
    public void findLocators() {
        ChromeDriver driver = new ChromeDriver();
        //id is the fastest
        driver.findElement(By.id("user-name"));
        driver.findElement(By.name("login-button"));
        //with space means different classes!!! need to choose one to work correctly-> driver.findElement(By.className("input_error form_input"));
        driver.findElement(By.className("input_error"));
        driver.findElement(By.tagName("a"));
        //link works only with a tag
        driver.findElement(By.linkText("Twitter"));
        driver.findElement(By.partialLinkText("Test.allTheThings()"));
        //css tag name(just put tag in the brackets)
        driver.findElement(By.cssSelector("noscript"));
        //css class put a dot and next name of the class
        driver.findElement(By.cssSelector(".footer_copy"));
        //css id put #
        driver.findElement(By.cssSelector("#item_2_img_link"));
        //css .class1+class2 put dots before classes
        driver.findElement(By.cssSelector(".input_error.form_input"));
        // css tag name.class
        driver.findElement(By.cssSelector("span.title"));
        //css [attribute=value]
        driver.findElement(By.cssSelector("[value=az]"));
        // css .class1 .class2
        driver.findElement(By.cssSelector(".primary_header .primary_header"));
        // [attribute~=value]
        driver.findElement(By.cssSelector("[data-test~=social]"));
        //[attribute|=value]
        driver.findElement(By.cssSelector("[data-test=inventory-item-price]"));
        //[attribute^=value]
        driver.findElement(By.cssSelector("[href^=https://fonts.googleapis.com/css2?family=DM+Mono:wght@400;500&family=DM+Sans:wght@400;500]"));
        //[attribute$=value] 	[href$=".pdf"]	Selects all elements with a href attribute value ends with ".pdf"
        driver.findElement(By.cssSelector("[href$=.pdf"));
        //[attribute*=value]
        driver.findElement(By.cssSelector("[data-test*=shopping-cart-link"));
        //• xpath:- поиск по атрибуту, например By.xpath("//tag[@attribute='value']");
        driver.findElement(By.xpath("//span[@data-test='title']"));
        //поиск по тексту, например By.xpath("//tag[text()='text']");
        driver.findElement(By.xpath("//div[text()='carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.'"));
        //- поиск по частичному совпадению атрибута, например By.xpath("//tag[contains(@attribute,'text')]");
        driver.findElement(By.xpath("//a[contains(@data-test,'shopping-cart-badge')]"));
        //- поиск по частичному совпадению текста, например  By.xpath("//tag[contains(text(),'text')]");
        driver.findElement(By.xpath("//slot[contains(text(),'(A to Z)')]"));
        //ancestor, например //*[text()='Enterprise Testing']//ancestor::div https://docs.google.com/document/d/1F6wJLOvMDYx8a3MpbTVxJMUDt4ysBAo5/edit?tab=t.0#bookmark=id.s88sax3d045
        driver.findElement(By.xpath("//button[@id='checkout']/button/ancestor::div"));
        //descendant
        driver.findElement(By.xpath("//div[@cass='bm-burger-button']/descendant::"));
        //following
        driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_medium']/following::"));
        //parent
        driver.findElement(By.xpath("//footer/ul/li/parent::ul"));
        //preceding
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/preceding::"));

    }
}