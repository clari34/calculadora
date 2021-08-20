import java.util.Scanner;

public class somap {
    public static void main(String[] args) {
        double a, b, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os números");
        a = s.nextDouble();
        b = s.nextDouble();
        c = a + b;
        System.out.println("A soma é:" + c);
    }
}
