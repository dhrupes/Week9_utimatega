import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEdge {
    public static void main(String[] args) {
        TestEdge d = new TestEdge();
        d.edgetest();
    }
    public void edgetest(){
        String baseurl ="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
       // driver.close();

    }
}
