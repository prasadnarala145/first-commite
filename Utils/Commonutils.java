package ksgcollege.Utils;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Commonutils {

    public EdgeDriver driver;
    @BeforeTest
    public void openBrowser() throws Exception {
        driver = new EdgeDriver();
        driver.get(PropertyReader.readKey("Url"));
        Thread.sleep(10000);
        driver.manage().window().maximize();

    }



}
