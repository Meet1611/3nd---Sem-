import java.util.*;

public class TempConvertion {

    static double celToFahren(int C) {
        return (C * 9 / 5) + 32;
    }

    static double fahrenToCel(int F) {
        return (F - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Celcius : ");
        int C = sc.nextInt();
        System.out.print("Temperature in Fahrenheit : " + celToFahren(C));

        System.out.print("Enter Temperature in Fahrenheit : ");
        int F = sc.nextInt();
        System.out.print("Temperature in Celcius : " + fahrenToCel(F));
    }
}
