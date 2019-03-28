package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;

import main.java.*;

public class Test_Login {

    @Test
    public void test1(){
        guru_login check1 = new guru_login();
        assertEquals("Login Medyo Sprint should be valid", true, check1.isUserValid("medyo","sprint"));
    }

    @Test
    public void test2(){
        guru_login check2 = new guru_login();
        assertNotEquals("Login Wrong Mistake should be invalid", true, check2.isUserValid("wrong","mistake"));
    }

    @Test
    public void test3(){
        guru_login check3 = new guru_login();
        assertEquals("Login Valid3 Valid3 should be valid", true, check3.isUserValid("valid","valid"));
    }
    @Test
    public void test4(){
        guru_login check4 = new guru_login();
        assertEquals("Login Valid4 Valid4 should be valid", true, check4.isUserValid("valid","valid"));
    }
	    @Test
    public void test5(){
        guru_login check5 = new guru_login();
        assertEquals("Login Valid5 Valid5 should be valid", true, check5.isUserValid("valid","valid"));
    }
	    @Test
    public void test6(){
        guru_login check6 = new guru_login();
        assertEquals("Login Valid6 Valid6 should be valid", true, check6.isUserValid("valid","valid"));
    }	
		    @Test
    public void test7(){
        guru_login check7 = new guru_login();
        assertEquals("Login Valid7 Valid7 should be valid", true, check7.isUserValid("valid","valid"));
    }
	@Test
    public void test8(){
        guru_login check8 = new guru_login();
        assertEquals("Login Valid8 Valid8 should be valid", true, check8.isUserValid("valid","valid"));
    }
	@Test
    public void test9(){
        guru_login check9 = new guru_login();
        assertEquals("Login Valid9 Valid9 should be valid", true, check9.isUserValid("valid","valid"));
    }			
	@Test
    public void test10() {
        guru_login check10 = new guru_login();
        assertEquals("Login Valid10 Valid10 should be valid", true, check10.isUserValid("valid", "valid"));
    }
    @Test
     public void testempty(){
     guru_login testempty = new guru_login();
        assertEquals("Login Empty Username or Password should be valid", true, testempty.isUserValid("",""));

        }
}
