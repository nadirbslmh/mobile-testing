package org.example.steps;

import org.example.BaseTest;
import io.cucumber.java.en.And;

public class ListPageSteps extends BaseTest {

    @And("user do scroll")
    public void userDoScroll() {
        listPage.swipeList();
    }

}
