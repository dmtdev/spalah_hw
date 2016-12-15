package ua.spalah.basics;

import java.text.DecimalFormat;

/**
 * Created by dmitry.dev on 15.12.2016.
 */
/**
 * test
 */
public class tests {
    public static void main(String[] args) {
        double r = 256.245/5.256487542;
        System.out.println(r);
        DecimalFormat df = new DecimalFormat();
        df.setDecimalSeparatorAlwaysShown(false);
        System.out.println(df.format(r));
        r = 2.3-2;
        System.out.println(df.format(r));
        r +=0.31030500200001;
        System.out.println(df.format(r));


    }
}
