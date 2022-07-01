package tests;

import forms.MainPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SendMessagesTest extends ParentsTests{
    @Test
    @Parameters({"name"})
    public void test(String name) {
        var page = new MainPage();
        Assert.assertTrue(page.state().waitForDisplayed(), "Page isn't opened");

        page.inputName(name);
        Assert.assertEquals(name, page.getInputTextBox().getValue(), "Inputted value isn't equals entered value");

        page.sendName();
        String text = page.getAlertMessage();
        Assert.assertEquals(name, text.split(" ")[1], "Alerts message have not  expected name");
    }
}
