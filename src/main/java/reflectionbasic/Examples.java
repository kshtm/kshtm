package reflectionbasic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Examples {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c = A.class;

        for (Method m : c.getMethods()) {
            System.out.println(m);

        }

        A a = new A();
        Method m = c.getMethod("m", null);
        m.invoke(a, null);
    }
}
