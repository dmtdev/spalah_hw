package ua.spalah.basics.oop_hw;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by dmitry.dev on 16.12.2016.
 */
public class TestClass {
    public static void main(String[] args) {
        Object[] object = new Object[10];
        object[0] = new String("string");
        object[1] = new Date();
        object[2] = new GregorianCalendar();
        object[3] = new int[]{1,2,3};
        object[4] = new Object[]{"S","S","S","S","S","S","S","S","S","S","S"};



    }
}
