package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class StartPage extends AbsBasePage<StartPage>{
    private SelenideElement chatButton = $("[text='Chat']");
    private SelenideElement exerciseButton = $("[text='Exercise']");
    private SelenideElement grammarButton = $("[text='Grammar']");
    private SelenideElement statsButton = $("[text='Stats']");

    public StartPage checkHeaderButtonsVisible() {
        chatButton.shouldBe(Condition.visible);
        exerciseButton.shouldBe(Condition.visible);
        grammarButton.shouldBe(Condition.visible);
        statsButton.shouldBe(Condition.visible);

        return this;
    }

    public StartPage clickStatsButton() {
        statsButton.click();

        return this;
    }

    public StartPage clickEexerciseButton() {
        exerciseButton.click();

        return this;
    }
}