package demos;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestActivity6 {

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        Assert.assertEquals(username, "admin");
        Assert.assertEquals(password, "password");
    }
}