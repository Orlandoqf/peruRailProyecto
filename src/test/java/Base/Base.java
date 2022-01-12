package Base;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class Base {

    public WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public Base() {

    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void iniciarSesion(String user, String pass){

    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    Double num1 = 20.00;
    String num2 = num1.toString();

    public void visit(String url){
        driver.get(url);
    }

    public void isDisplayed(By locator){
        driver.findElement(locator).isDisplayed();
    }

    public void maximize(){
        driver.manage().window().maximize();
    }

    public void elegir(String numero, By locator) {
        Select selectList = new Select(findElement(locator));
        selectList.selectByValue(numero);
    }

    public static String getValueFromDataTable(DataTable dataTable, String title) {
        List<Map<String, String>> list = dataTable.asMaps();
        return (String)((Map)list.get(0)).get(title);
    }

}
