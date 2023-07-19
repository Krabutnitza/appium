package pages;

import com.codeborne.selenide.Condition;
import data.StartPageHeaderData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends AbsBasePage<MainPage> {

    public MainPage clickNextButton() {
        String nextButton = "[text='Next']";
        $(nextButton).click();

        return this;
    }

    public MainPage startPageShouldBeOpened() {
        $(By.id("android:id/content")).shouldBe(Condition.visible);

        return this;
    }

    public MainPage startPageTextSameAs(StartPageHeaderData text) {
        $(String.format("[text='%s']", text.getHeader())).shouldBe(Condition.visible);

        return this;
    }
}
