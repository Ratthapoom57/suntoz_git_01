package com.suntoz.viewertest;

import android.test.ActivityInstrumentationTestCase2;
import android.webkit.WebView;

import com.robotium.solo.By;
import com.robotium.solo.Solo;

import static com.suntoz.viewertest.R.id.myview;


/**
 * Created by Asus on 8/9/2560.
 */

public class TestViewer extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public TestViewer() {
        super(Room_select.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testCase1() throws Exception{
        solo.unlockScreen();
        WebView webView = (WebView) solo.getView(myview);
        solo.waitForView(webView, 2000, false);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("299"));
        solo.clickOnWebElement(By.id("startViewer"));
        solo.scrollDown();
        solo.scrollUp();
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("terminate_viewer"));
        solo.sleep(2000);
        solo.goBack();
        solo.sleep(2000);
        solo.sendKey(Solo.CLOSED);
    }

    public void testCase2() throws Exception{
        solo.unlockScreen();
        WebView webView = (WebView) solo.getView(myview);
        solo.waitForView(webView, 2000, false);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("300"));
        solo.clickOnWebElement(By.id("startViewer"));
        solo.scrollDown();
        solo.scrollUp();
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("terminate_viewer"));
        solo.sleep(2000);
        solo.goBack();
        solo.sleep(2000);
        solo.sendKey(Solo.CLOSED);
    }

    public void testCase3() throws Exception{
        solo.unlockScreen();
        WebView webView = (WebView) solo.getView(myview);
        solo.waitForView(webView, 2000, false);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("301"));
        solo.scrollDown();
        solo.scrollUp();
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("startViewer"));
        solo.scrollDown();
        solo.scrollUp();
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("terminate_viewer"));
        solo.sleep(2000);
        solo.goBack();
        solo.sleep(2000);
        solo.sendKey(Solo.CLOSED);
    }
/* -----------------------------------------------------------------------------------------------*/

    public void testCase4() throws Exception{
        solo.unlockScreen();
        WebView webView = (WebView) solo.getView(myview);
        solo.waitForView(webView, 2000, false);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("searchRooms"));
        solo.enterTextInWebElement(By.id("searchRooms"), "bot");
        solo.sleep(2000);
        solo.sendKey(Solo.ENTER);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("299"));
        solo.clickOnWebElement(By.id("startViewer"));
        solo.scrollDown();
        solo.scrollUp();
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("terminate_viewer"));
        solo.sleep(2000);
        solo.goBack();
        solo.sleep(2000);
        solo.sendKey(Solo.CLOSED);
    }

    public void testCase5() throws Exception{
        solo.unlockScreen();
        WebView webView = (WebView) solo.getView(myview);
        solo.waitForView(webView, 2000, false);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("searchRooms"));
        solo.enterTextInWebElement(By.id("searchRooms"), "agent");
        solo.sleep(2000);
        solo.sendKey(Solo.ENTER);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("300"));
        solo.clickOnWebElement(By.id("startViewer"));
        solo.scrollDown();
        solo.scrollUp();
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("terminate_viewer"));
        solo.sleep(2000);
        solo.goBack();
        solo.sleep(2000);
        solo.sendKey(Solo.CLOSED);
    }

    public void testCase6() throws Exception{
        solo.unlockScreen();
        WebView webView = (WebView) solo.getView(myview);
        solo.waitForView(webView, 2000, false);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("searchRooms"));
        solo.enterTextInWebElement(By.id("searchRooms"), "ace");
        solo.sleep(2000);
        solo.sendKey(Solo.ENTER);
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("301"));
        solo.scrollDown();
        solo.scrollUp();
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("startViewer"));
        solo.scrollDown();
        solo.scrollUp();
        solo.sleep(2000);
        solo.clickOnWebElement(By.id("terminate_viewer"));
        solo.sleep(2000);
        solo.goBack();
        solo.sleep(2000);
        solo.sendKey(Solo.CLOSED);
    }
}
