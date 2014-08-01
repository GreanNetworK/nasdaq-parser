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
public class ContentUtilsTest {

    public ContentUtilsTest() {
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
     * Test of loadContent method, of class ContentUtils.
     */
    @Test
    public void testLoadContent() {
        System.out.println("loadContent");
        ContentUtils instance = new ContentUtilsImpl();
        String result = instance.loadContent();
        assertNotNull(result);
    }

    /**
     * Test of getNasdaqIndex method, of class ContentUtils.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getNasdaqIndex");
        ContentUtils instance = new ContentUtilsImpl();
        String expResult = "4462.90";
        String result = instance.getIndex(IndexName.NASDAQ);
        assertEquals(expResult, result);
    }

    public class ContentUtilsImpl extends ContentUtils {

        @Override
        public String loadContent() {
            return "//<![CDATA[\n" +
"            \n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"NASDAQ\",\"4462.90\",\"20.20\",\"0.45\",\"1,828,983,426\",\"4476.06\",\"4444.51\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"DJIA\",\"16880.36\",\"-31.75\",\"0.19\",\"\",\"16983.94\",\"16817.16\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"S&P 500\",\"1970.07\",\"0.12\",\"0.01\",\"\",\"1978.90\",\"1962.42\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"NASDAQ-100\",\"3976.07\",\"17.04\",\"0.43\",\"\",\"3989.00\",\"3960.29\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"NASDAQ-100 PMI\",\"3978.42\",\"19.39\",\"0.49\",\"\",\"3980.82\",\"3971.64\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"NASDAQ-100 AHI\",\"3973.31\",\"-2.76\",\"0.07\",\"\",\"3975.78\",\"3972.10\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"Russell 1000\",\"1097.38\",\"0.53\",\"0.05\",\"\",\"1102.12\",\"1093.24\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"Russell 2000\",\"1146.57\",\"4.93\",\"0.43\",\"\",\"1150.61\",\"1141.64\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"FTSE All-World ex-US*\",\"282.70\",\"-0.10\",\"0.04\",\"\",\"282.84\",\"282.70\");\n" +
"                nasdaqHomeIndexChart.storeIndexInfo(\"FTSE RAFI 1000*\",\"8992.84\",\"-9.44\",\"0.10\",\"\",\"9038.47\",\"8958.66\");\n" +
"            //]]>";
        }
    }

}
