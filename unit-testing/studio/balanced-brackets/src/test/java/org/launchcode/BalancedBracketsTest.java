package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void notNull(){
        assertNotNull(BalancedBrackets.hasBalancedBrackets("example"));
    }

    @Test
    public void twoOpenOneClosed(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void oneOpenTwoClosed(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }


//    These strings have balanced brackets:
//            *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"


    @Test
    public void launchCodeEndsBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void launchCodeMiddleBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void launchCodeBeginningBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void noBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void onlyBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

//    While these do not:
//            *   "[LaunchCode", "Launch]Code[", "[", "]["

    @Test
    public void oneOpenZeroClosed(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsWrongOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void onlyOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void reverseOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }






}