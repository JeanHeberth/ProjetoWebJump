package br.com.webjump.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import static br.com.webjump.core.DriveFactory.getDriver;

public class ScreenShot {

    public static void capturarEvidencias() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH:mm");
        try {

            TakesScreenshot screenshotFile = (TakesScreenshot) getDriver();
            File arquivo = screenshotFile.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(arquivo, new File("src/test/resources/screenshots/"
                    + File.separator  + "evidencia"+ /*+ formatter.format(new Date())*/
                    ""+ RandomStringUtils.randomNumeric( 1) +".png"
            ));
        } catch (IOException ex) {
            throw new RuntimeException("Não foi possivel capturar a imagem");
        }
    }
}
