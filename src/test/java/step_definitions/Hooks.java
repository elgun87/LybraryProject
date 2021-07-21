package step_definitions;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.BrowserSleep;
import utilities.Driver;

public class Hooks {
    @Before
    public void setDriver(){
        Driver.setDriver();
    }
    @After
    public void closeApp(Scenario scenario){
        if(scenario.isFailed()){
            byte [] screenShoot = ((TakesScreenshot)Driver.setDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShoot,"image/png", scenario.getName());
        }
        BrowserSleep.time(1);
        Driver.closeDriver();
    }
}
