package net.milanqiu.sputnik;

import net.milanqiu.mimas.collect.IntInt;
import net.milanqiu.mimas.instrumentation.TestConsts;

/**
 * Main class.
 * <p>
 * Creation Date: 2015-08-20
 * @author Milan Qiu
 */
public class Main {

    public static void main(String[] args) {
        IntInt ii = new IntInt();
        ii.setA(TestConsts.INT_0);
        System.out.println(ii.getA());
    }
}
