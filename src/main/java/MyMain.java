import java.util.Scanner;

public class MyMain {

    public static int median(int a, int b, int c) {
        // if a is bigger than b x should b positive
        int x = a - b;
        int y = b - c; //same thing 4 y
        int z = a - c; // ^^^^

        if (x * y > 0) { //is b mid? if xy is pos
            return b;
        }
        else if (z * x > 0) { // is c mid? if xz is pos
            return c;
        }
        return a;
    }


    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        }
        else
            return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt((a*a)+(b*b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what u want");
        String method = scan.next();
        while (!method.contains("median") && !method.contains("magnitude") && !method.contains("pythagoras")) {
            System.out.println("try again options are median magnitude pythagoras");
            method = scan.next();
        }
        if (method.contains("median")) {
            System.out.println("input three numbers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println(median(a, b, c));
        }
        if (method.contains("magnitude")) {
            System.out.println("input three numbers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(magnitude(a, b));
        }
        if (method.contains("pythagoras")) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(pythagoras(a, b));
        }
    }
}
