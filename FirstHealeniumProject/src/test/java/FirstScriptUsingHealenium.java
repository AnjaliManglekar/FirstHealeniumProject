import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScriptUsingHealenium {

    //public void testScript(){}
    //WebDriver driver;
    public static void main(String[] args) {
        //WebDriver driver;
        WebDriverManager.chromedriver().setup();
       //System.setProperty("webdriver.chrome.driver","D:\\Download\\selenium jars and drivers\\drivers\\chromedriver\\chromedriver.exe");
        //declare delegate
        WebDriver delegate = new ChromeDriver();
        //create Self-healing driver
       SelfHealingDriver driver = SelfHealingDriver.create(delegate);
       // driver = SelfHealingDriver.create(seleniumDriver);
        driver.manage().window().maximize();
        /*driver.get("https://sha-test-app.herokuapp.com/");
        By testButton = By.xpath("//button[contains(@class,'default-btn')]");
        driver.findElement(testButton).click();*/
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//a[text()='Gmail']")).click();
       // driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
        //driver.findElement(By.xpath("//a[text()='Image']")).click();
        //driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']")).click();
       // @FindBy(xpath = "//button[@type='submit']")

        /*driver.get("http://tutorialsninja.com/demo");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/span")).click();*/
    }

}
