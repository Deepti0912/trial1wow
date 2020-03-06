
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {

    WebDriver driver;

    @Given("^open google page$")
    public void open_Browser(){

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.dropbox.com/login");
        System.out.println("Page title" + driver.getTitle());
    }

    @Then("^close the browser$")
    public void close_Browser(){
        driver.close();
    }




}
