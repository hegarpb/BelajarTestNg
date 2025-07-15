package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignInTest {
  private SignIn signIn;

  @BeforeClass
  public void setup() {
    signIn = new SignIn();
  }

  @Test(priority = 1)
  @Parameters("username")
  public void fillUsername(String username) {
    signIn.setUsername(username);
    Assert.assertEquals(username, signIn.getUsername());
  }

  @Test(priority = 2)
  @Parameters("password")
  public void fillPassword(String password) {
    signIn.setPassword(password);
    Assert.assertEquals(password, signIn.getPassword());
  }

  @Test(priority = 3)
  public void clickButtonSignIn() {
    boolean actual = signIn.clickButtonSignIn();
    Assert.assertTrue(actual);
  }

}
