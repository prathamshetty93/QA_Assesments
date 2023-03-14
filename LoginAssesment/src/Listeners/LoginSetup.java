package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSetup {

    @Test
    void loginViaEmail(){
        System.out.println("Login via Email");
        Assert.assertEquals("pavan","pavan");

    }

    @Test
    void loginViaFacebook(){
        System.out.println("login via facebook");
        Assert.assertEquals("pavan","kumar");
    }
}
