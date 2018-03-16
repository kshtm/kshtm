package lesson2;

public class A {

    static final int MAX = 10;
    static final String SECRET_WORD = "Hello";
    static int instanceCouter = 0;

    static {

    }

    public static int compare( A first, A second) {
        return first.x - second.y;
    }

    int x = 0;
    int y = 0;

    {
        instanceCouter++;
    }
     public A() {
        x = 10;
        y = 10;
     }

     public void move(int shiftX, int shiftY) {
        x += shiftX;
        y += shiftY;
     }

     public int compare(A other) {
        return compare(this, other);
     }

}
