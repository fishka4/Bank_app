package com.bank_app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

/**
 * Created by Alex on 1/24/2017.
 */
public class SavingAccountTest {
    private SavingAccount account;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Tests in progress...");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Done.");
    }

    @Before
    public void initTest(){
        account = new SavingAccount();
    }

    @After
    public void afterTest(){
        account = null;
    }

    @org.junit.Test
    public void negativeNumb() throws Exception {
        account.setBalance(-0.01);
        assertEquals(0, account.getRateOfInterest());
    }

    @org.junit.Test
    public void zeroNumb() throws Exception {
        account.setBalance(0);
        assertEquals(0, account.getRateOfInterest());
    }

    @org.junit.Test
    public void firstValidNumb() throws Exception {
        account.setBalance(0.01);
        assertEquals(3, account.getRateOfInterest());
    }

    @org.junit.Test
    public void secondValidNumb() throws Exception {
        account.setBalance(99.99);
        assertEquals(3, account.getRateOfInterest());
    }

    @org.junit.Test
    public void thirdValidNumb() throws Exception {
        account.setBalance(100);
        assertEquals(5, account.getRateOfInterest());
    }

    @org.junit.Test
    public void fourthValidNumb() throws Exception {
        account.setBalance(100.01);
        assertEquals(5, account.getRateOfInterest());
    }

    @org.junit.Test
    public void fifthValidNumb() throws Exception {
        account.setBalance(999.99);
        assertEquals(5, account.getRateOfInterest());
    }

    @org.junit.Test
    public void sixthValidNumb() throws Exception {
        account.setBalance(1000);
        assertEquals(7, account.getRateOfInterest());
    }

    @org.junit.Test
    public void seventhValidNumb() throws Exception {
        account.setBalance(1000.01);
        assertEquals(7, account.getRateOfInterest());
    }


}