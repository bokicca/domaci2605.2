import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class pekica {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Intel\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.stealmylogin.com/demo.html");

            driver.findElement(By.name("username")).sendKeys("bojanaaa");
            WebElement inputPassword = driver.findElement(By.name("password"));
            inputPassword.sendKeys("bojanaaa");
            inputPassword.sendKeys(Keys.ENTER);

            String url = driver.getCurrentUrl();
            String expected = "https://example.com/";


            if (url.equals(expected)) {
                System.out.println("Nice!");
            }else{
                System.out.println("Not nice!");
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.close();

        }

    }



