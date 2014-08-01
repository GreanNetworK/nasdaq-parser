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
import org.junit.Ignore;

/**
 *
 * @author San
 */
public class SendIndexClientTest {
    
    public SendIndexClientTest() {
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
     * Test of getInstance method, of class SendIndexClient.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SendIndexClient result = SendIndexClient.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of sendIndex method, of class SendIndexClient.
     * 
     * ignore test because it will generate real data in abct.io
     */
    @Test
    @Ignore
    public void testSendIndex() {
        System.out.println("sendIndex");
        IndexName indexName = IndexName.NASDAQ;
        SendIndexClient instance = new SendIndexClient();
        int expResult = 204;
        int result = instance.sendIndex(indexName);
        assertEquals(expResult, result);
    }
    
}
