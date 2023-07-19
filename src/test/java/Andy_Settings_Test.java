import com.codeborne.selenide.Selenide;
import components.popups.AlertComponent;
import data.StartPageHeaderData;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;
import pages.SettingsPage;
import pages.StartPage;
import pages.StatsPage;

@ExtendWith(AppiumExtension.class)
public class Andy_Settings_Test {
    @Test
    public void startPage() {
        new MainPage()
                .open()
                .startPageTextSameAs(StartPageHeaderData.FIRST_PAGE_HEADER)
                .clickNextButton()
                .startPageTextSameAs(StartPageHeaderData.SECOND_PAGE_HEADER)
                .clickNextButton()
                .skipButtonShouldeBeVisible()
                .clickSkipButton()
                .popupShouldBeVisible();

        new AlertComponent()
                .clickOkButton();

        new StartPage()
                .checkHeaderButtonsVisible()
                .clickStatsButton();

        new StatsPage()
                .checkSettingsButtonVisibble()
                .clickSettingsButton();

        new SettingsPage()
                .checkSettingsButtonsVisible()
                .clickTranslationsButton()
                .languagePageShouldBeVisible();

        Selenide.back();

        new SettingsPage()
                .clickTermsButton()
                .termsPageShouldBeVidible(); // в приложении баг - с 1 раза не заходит на страницу
    }
}
