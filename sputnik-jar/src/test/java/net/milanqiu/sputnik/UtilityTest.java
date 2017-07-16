package net.milanqiu.sputnik;

import org.junit.Assert;
import org.junit.Test;

/**
 * Creation Date: 2017-07-16
 * @author Milan Qiu
 */
public class UtilityTest {

    @Test
    public void test_subTwo() throws Exception {
        Assert.assertEquals(1, Utility.subTwo(3));
    }
}
