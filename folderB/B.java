package folderB;

public class B extends C {

    static int test = 9000;
    int ager = 18;
    private int z = 9;
    public int s = 900;

    protected String string = "Amit";

    public static void main(String[] args) {
        B b = new B();
        b.z = 90;
        System.out.println(b.z);
        b.show();

    }
}

class C {

    private int x = 10;

    void show() {
        System.out.println(x);
    }
}