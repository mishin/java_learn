/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ira
 */
public class StringUtilsJUnit4Test extends Assert {
  private final Map<String, byte[]> toHexStringData = new HashMap<String, byte[]>();

  @Before
  public static void setUpToHexStringData() {
    toHexStringData.put("", new byte[0]);
    toHexStringData.put("01020d112d7f", new byte[] { 1, 2, 13, 17, 45, 127 });
    toHexStringData.put("00fff21180", new byte[] { 0, -1, -14, 17, -128 });
    //...
  }

  @After
  public static void tearDownToHexStringData() {
    toHexStringData.clear();
  }

  @Test
  public void testToHexString() {
    for (Map.Entry<String, byte[]> entry : toHexStringData.entrySet()) {
      final byte[] testData = entry.getValue();
      final String expected = entry.getKey();
      final String actual = StringUtils.toHexString(testData);
      assertEquals(expected, actual);
    }
  }
}
