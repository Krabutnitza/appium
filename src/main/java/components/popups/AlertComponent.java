package components.popups;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class AlertComponent<T> extends AbsPopupBase<AlertComponent> {
    private SelenideElement alertElement = $(By.id("android:id/parentPanel"));
    private SelenideElement okButton = $(By.id("android:id/button1"));

    @Override
    public AlertComponent popupShouldBeVisible() {
        alertElement.shouldBe(Condition.visible);

        return this;
    }

    @Override
    public AlertComponent popupShouldNotBeVisible() {
        alertElement.shouldNotBe(Condition.visible);

        return this;
    }

    public void clickOkButton() {
        okButton.click();
    }
}
