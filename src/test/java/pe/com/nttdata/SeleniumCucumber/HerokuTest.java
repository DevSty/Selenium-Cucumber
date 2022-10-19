package pe.com.nttdata.SeleniumCucumber;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class HerokuTest {
    private static WebDriver driver;
    private static Map<String, Object> vars;
    private static JavascriptExecutor js;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterAll
    public static void tearDown() {
        //driver.quit();
    }

    @Test
    public void altaCliente() {
        driver.get("https://christophermen4.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(1536, 824));
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(6)")).click();
        driver.findElement(By.id("nombre")).click();
        driver.findElement(By.cssSelector(".container:nth-child(3)")).click();
        driver.findElement(By.linkText("Agregar")).click();
        driver.findElement(By.id("nombre")).click();
        driver.findElement(By.id("nombre")).sendKeys("Simon");
        driver.findElement(By.id("apellido")).click();
        driver.findElement(By.id("apellido")).sendKeys("Tavara");
        driver.findElement(By.id("direccion")).click();
        driver.findElement(By.id("direccion")).sendKeys("Enrique Segoviano");
        driver.findElement(By.id("telefono")).click();
        driver.findElement(By.id("telefono")).sendKeys("976854678");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("dev@xd.com");
        driver.findElement(By.id("pension")).click();
        driver.findElement(By.id("pension")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id("pension")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id("pension")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id("pension")).sendKeys("5000");
        driver.findElement(By.id("fechaNacimiento")).click();
        /*driver.findElement(By.id("fechaNacimiento")).sendKeys("0001-11-18");
        driver.findElement(By.id("fechaNacimiento")).sendKeys("0019-11-18");
        driver.findElement(By.id("fechaNacimiento")).sendKeys("0199-11-18");*/
        driver.findElement(By.id("fechaNacimiento")).sendKeys("18111998");
        js.executeScript("window.scrollBy(0,5000)");
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
        driver.findElement(By.id("pais")).click();
        {
            WebElement dropdown = driver.findElement(By.id("pais"));
            dropdown.findElement(By.xpath("//option[. = 'Brasil']")).click();
        }
        driver.findElement(By.id("tipoSeguro")).click();
        {
            WebElement dropdown = driver.findElement(By.id("tipoSeguro"));
            dropdown.findElement(By.xpath("//option[. = 'Rimac']")).click();
        }
        driver.findElement(By.cssSelector(".btn")).click();
    }
}
