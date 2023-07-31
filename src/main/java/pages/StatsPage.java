package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class StatsPage extends AbsBasePage<StatsPage> {
    private SelenideElement settingsButton = $("[text='Settings']");

    public StatsPage checkSettingsButtonVisibble() {
        settingsButton.shouldNotBe(Condition.visible);

        return this;
    }

    public StatsPage clickSettingsButton() {
        settingsButton.click();

        return this;
    }
}
