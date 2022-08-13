import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

    public static void main(String[] args) {
        TestChrome d = new TestChrome();
           d.testchrome();
    }

    public void testchrome(){
 String baseurl ="https://courses.ultimateqa.com/users/sign_in";
 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);




    }

}
