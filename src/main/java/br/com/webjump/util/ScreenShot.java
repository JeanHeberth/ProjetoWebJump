package br.com.webjump.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static br.com.webjump.core.DriveFactory.getDriver;

public class ScreenShot {

    public static void takeScreenShot (WebDriver driver){
            try {
                File screenshotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File(fileNameGenerator()));
            } catch (IOException e) {
                throw new RuntimeException("Não foi possível capturar a tela");
            }
        }

        private static String fileNameGenerator () {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss");
            String path = "src/test/resources/screenshots/";
            return path + "evidencia-" + formatter.format(date) + "_horas" + ".jpg";
        }
    }
