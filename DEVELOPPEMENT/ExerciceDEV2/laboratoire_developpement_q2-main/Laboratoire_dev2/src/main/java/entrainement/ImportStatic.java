package entrainement;

import static java.lang.Math.PI;

import static entrainement.Foo.YAPI;

/**
 *
 * @author alecw
 */
public class ImportStatic {

    public static void main(String[] args) {
        Foo.bar();

        System.out.println("Yet another PI: " + Foo.YAPI);
        System.out.println("Yet another PI: " + YAPI);

        System.out.println("Yet another PI: " + Math.PI);
        System.out.println("Yet another PI: " + PI);

    }
}
