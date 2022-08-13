import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {
    public static void main(String[] args) {
        TestFirefox d = new TestFirefox();
        d.firefoxtest();
    }

    public void firefoxtest(){
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title =driver.getTitle();
        System.out.println(title);
    }

}
