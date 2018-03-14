package lesson1;

import java.util.Date;

public class Z {

    static int s = 99;
    static int count = 0;

    static {
        System.out.println("Static init");
    }

    Date date = new Date();

    {
        System.out.println("Init");
    }

    Z() {
        count++;
        System.out.println(s);
        System.out.println("constuctor " + count);
    }
}
