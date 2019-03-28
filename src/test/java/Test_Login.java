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

        guru_login obj = new guru_login();
        assertEquals("SPRINT", obj.getMessage("SPRINT"));

    }

    @Test
    public void test4() {

        guru_login obj = new guru_login();
        assertEquals("MEDYO", obj.getMessage("MEDYO"));

    }

    @Test
    public void test5() {

        guru_login obj = new guru_login();
        assertEquals("Please provide a name!", obj.getMessage(null));

    }
    
}
