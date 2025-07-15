package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest {
@Test
public void tc003() {
    String username = "johansebastian";
    String password = "123qwe";

    SignIn signIn = new SignIn();

    signIn.setUsername(username);
    signIn.setPassword(password);
    boolean actual = signIn.onSignIn();

    Assert.assertTrue(actual);
}
}
