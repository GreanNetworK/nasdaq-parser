/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.abct.test.api.nasdaq.parser.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author San
 */
public class UrlContentUtilsTest {
    
    public UrlContentUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loadContent method, of class UrlContentUtils.
     */
    @Test
    public void testLoadContent() {
        System.out.println("loadContent");
        UrlContentUtils instance = new UrlContentUtils();
        String expResult = "nasdaqHomeIndexChart.storeIndexInfo";
        String result = instance.loadContent();
        assertTrue(result.contains(expResult));
    }
    
}
