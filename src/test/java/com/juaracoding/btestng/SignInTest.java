package com.juaracoding.btestng;

import org.testng.annotations.Test;

public class SignInTest {

  @Test(priority = 1, timeOut = 3000)
  public void signinTest() throws InterruptedException {
    Thread.sleep(2000);
    System.out.println("Method SignInTest.signinTest dijalankan");
  }

  @Test(priority = 2, enabled = false)
  public void dashboardTest() {
    System.out.println("Method SignInTest.dashboardTest dijalankan");
  }

  @Test(priority = 3)
  public void profileTest() {
    System.out.println("Method SignInTest.profileTest dijalankan");
  }

}
