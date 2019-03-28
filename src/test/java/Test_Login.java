package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;

import main.java.*;

public class Test_Login {

    @Test
    public void test1(){
        guru_login check = new guru_login();
        assertNotEquals("Login is invalid", true, check.isUserValid("wrong","mistake"));
    }

    @Test
    public void test2(){
        guru_login check2 = new guru_login();
        assertNotEquals("Login is invalid", true, check2.isUserValid("wrong","mistake"));
    }
    
    @Test
    public void test3() {

        guru_login check3 = new guru_login();
        assertEquals("Login is valid", true, check3.isUserValid("true","mistake"));

    }
    
    @Test
    public void test4() {

        guru_login check4 = new guru_login();
        assertEquals("Login is valid", true, check4.isPasswordValid("true","mistake"));

    }

}
