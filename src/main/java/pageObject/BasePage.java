package pageObject;

import com.github.javafaker.Faker;

import setupBrowser.UiRunner;


import java.util.ResourceBundle;

public class BasePage extends UiRunner {

    public ResourceBundle env = ResourceBundle.getBundle("envs");
    public ResourceBundle creds = ResourceBundle.getBundle("creds");

    public Faker faker = new Faker();
    public static LoginPage loginPage = new LoginPage();
    public SpacesPage spacesPage = new SpacesPage();

 //   public Authorization authorization = new Authorization();
 //   public Home home = new Home();
    // API
  //  public SubscriptionAction subscriptionAction = new SubscriptionAction();

}
