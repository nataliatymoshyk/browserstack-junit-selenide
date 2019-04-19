package com.browserstack;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {

    open("http://www.google.com");

    $(By.name("q")).setValue("Selenide").pressEnter();

    sleep(2000);

    Assert.assertEquals(title(), "BrowserStack - Google Search");

  }

}
