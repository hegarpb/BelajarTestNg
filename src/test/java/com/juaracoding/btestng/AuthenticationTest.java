package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AuthenticationTest {
  private Register register;
  private SignIn signIn;

  @BeforeClass(groups = { "setup" })
  public void setup() {
    register = new Register();
    signIn = new SignIn();
  }

  /**
   * TC-003 Sign In with Valid Credential.
   * 
   * @param username
   * @param password
   */
  @Test(groups = { "auth", "regression", "high" })
  @Parameters({ "username", "password" })
  public void signinTest(String username, String password) {
    signIn.setUsername(username);
    signIn.setPassword(password);
    boolean actual = signIn.clickButtonSignIn();

    Assert.assertTrue(actual);
  }

  /**
   * TC-004 Register with Valid Credential.
   * 
   * @param username
   * @param email
   * @param password
   */
  @Test(groups = { "auth", "regression", "medium" })
  @Parameters({ "username", "email", "password" })
  public void registerTest(String username, String email, String password) {
    register.setUsername(username);
    register.setEmail(email);
    register.setPassword(password);
    boolean actual = register.clickButtonRegister();

    Assert.assertTrue(actual);
  };

  @Test(groups = { "auth", "regression", "high", "negative-test" })
  @Parameters({ "invalidUsername", "password" })
  public void signinWithInvalidUsernameTest(String invalidUsername, String password) {
    signIn.setUsername(invalidUsername);
    signIn.setPassword(password);
    boolean actual = signIn.clickButtonSignIn();

    Assert.assertFalse(actual);
  }

}
