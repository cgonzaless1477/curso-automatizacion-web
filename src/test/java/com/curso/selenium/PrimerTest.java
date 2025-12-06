package com.curso.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PrimerTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Configura el driver de Chrome automáticamente
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verificarTituloDeGoogle() {
        driver.get("https://www.google.com");
        String titulo = driver.getTitle();
        System.out.println("Título de la página: " + titulo);
        Assert.assertTrue(titulo.toLowerCase().contains("google"));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
