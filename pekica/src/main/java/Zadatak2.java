import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class Zadatak2 {
        public static void main(String[] args) {
            try {

            System.setProperty("webdriver.chrome.driver", "C:\\Intel\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.kupujemprodajem.com");


                Thread.sleep(3000);



//            driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]")).click();
                WebElement  elpop = driver.findElement(By.className("kpBoxCloseButton"));
                elpop.click();
            WebElement inputSearch = driver.findElement(By.id("searchKeywordsInput"));
            inputSearch.sendKeys("iphone 13");
            inputSearch.sendKeys(Keys.ENTER);


            driver.findElement(By.xpath("//*[@id=\"adDescription7321776\"]/div/section[2]/div[1]/div[1]/a")).click();
            String title = driver.getTitle();
            String expected = "iPhone 13, iPhone 12, iPhone 11 - NOVO!";
            if(title.equals(expected)){
                System.out.println("Validno");

                driver.close();

            }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }



