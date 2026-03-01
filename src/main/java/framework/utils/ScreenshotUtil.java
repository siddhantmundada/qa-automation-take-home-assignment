package framework.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String testName) {

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            Path destination = Path.of("screenshots",
                    testName + "_" + System.currentTimeMillis() + ".png");

            Files.createDirectories(destination.getParent());
            Files.copy(src.toPath(), destination);

            System.out.println("Screenshot saved at: " + destination.toAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}