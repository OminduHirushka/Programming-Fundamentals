package A4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);

        System.out.print("Input the radius of the circle: ");
        double radius1 = radius.nextDouble();

        double area = 3.14 * (radius1 * radius1);

        System.out.println("Area Of The Circle is "+ area);
    }
}

