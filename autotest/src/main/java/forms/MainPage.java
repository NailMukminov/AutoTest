package forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private static final By LABEL_LOCATOR = By.xpath("//li[contains(@class, 'breadcrumb-item')]");
    private static final By BTN_LOCATOR = By.xpath("//button[contains(@class, 'btn')]");
    private static final By TEXT_BOX_LOCATOR = By.xpath("//input[contains(@class, 'input')]");
    private static final By ALERT_LOCATOR = By.xpath("//section[@class='n2o-alerts top']//div//a//div//section");
    private final IButton sendBtn = getElementFactory().getButton(BTN_LOCATOR, "SendBtn");
    private final ITextBox inputTextBox = getElementFactory().getTextBox(TEXT_BOX_LOCATOR, "InputTextBox");
    private final ILabel alertLabel = getElementFactory().getLabel(ALERT_LOCATOR, "AlertLabel");

    public MainPage() {
        super(LABEL_LOCATOR, "PageNameLabel");
    }

    public void inputName(String value) {
        inputTextBox.clearAndType(value);
    }

    public void sendName() {
        sendBtn.click();
    }

    public String getAlertMessage() {
        return alertLabel.getText();
    }

    public ITextBox getInputTextBox() {
        return inputTextBox;
    }
}
