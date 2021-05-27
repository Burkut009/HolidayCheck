package de.holdidaycheck.step_defs;

import de.holdidaycheck.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("This comes before");
    }

    @After
    public void tearDown(Scenario scenario){
        Driver.closeDriver();
    }

}
