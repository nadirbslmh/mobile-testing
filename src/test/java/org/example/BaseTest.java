package org.example;

import org.example.app.pages.CalculatorPage;
import org.example.app.pages.ListPage;
import org.example.app.pages.LoginPage;
import org.example.app.pages.NavigationMenu;

public class BaseTest {
    public LoginPage loginPage = new LoginPage();
    public CalculatorPage calculatorPage = new CalculatorPage();
    public NavigationMenu navigationMenu = new NavigationMenu();
    public ListPage listPage = new ListPage();
}
