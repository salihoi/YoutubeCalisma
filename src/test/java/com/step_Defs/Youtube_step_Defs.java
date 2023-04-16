package com.step_Defs;

import com.pages.anasayfa;
import com.pages.video_sayfası;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.pages.video_sayfası.skipADD2;

public class Youtube_step_Defs {

    anasayfa anasayfa = new anasayfa();
    video_sayfası videoSayfası = new video_sayfası();


    @Given("Youtube'a Git")
    public void youtube_a_git() {

        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("MongoDB Database Skills Ara")
    public void mongo_db_database_skills_ara() {

        anasayfa.arama.sendKeys("MongoDB Database Skills");
        BrowserUtils.waitFor(2);
        anasayfa.arama_btn.click();
        BrowserUtils.waitFor(3);

    }
    @When("MongoDB Database Skills videosuna tıkla")
    public void mongo_db_database_skills_videosuna_tıkla() {
        videoSayfası.videolink.click();
        BrowserUtils.waitFor(3);


    }
    @Then("MongoDB Database Skills videosunda olduğunu doğrula")
    public void mongo_db_database_skills_videosunda_olduğunu_doğrula() {
        String actualText = videoSayfası.videoisim.getText();
        String expectedText = "MongoDB Database Skills (Sia Cheap Thrills Parody)";
        Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);
        System.out.println(expectedText);


    }
    @When("Videoda varsa reklamı atla")
    public void videoda_varsa_reklamı_atla() {

        try {
            skipADD2(Driver.get());
        } catch (Exception e) {
            System.out.println("Skip Ad button is not available for this video.");
        }




    }
    @When("Videoyu tam ekran yap")
    public void videoyu_tam_ekran_yap() {

    }


    @And("Videonun sesini yüzde elli'ye kadar kıs")
    public void videonunSesiniYüzdeElliYeKadarKıs() {

    }

    @Then("Videoyu iki dakika otuzbeş'inci saniyeye ilerlet.")
    public void videoyuIkiDakikaOtuzbeşInciSaniyeyeIlerlet() {

    }


}
