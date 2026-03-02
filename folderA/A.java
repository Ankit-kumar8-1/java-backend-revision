package folderA;

import folderB.B;

public class A extends B {

    // we cannot access default keyowrd like age

    int x = s;

    // public static int test = 9;

    public static void main(String[] args) {
        A a = new A();
        String s = a.string;
        System.out.println(s);

        System.out.println(a.x);
        System.out.println(a.s);

        // System.out.println(test);

    }
}
