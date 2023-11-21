import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe26_Potenz23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Tippe Basis, bestätige mit Enter, dann tippe Exponent, bestätige mit Enter:");
            int basis = sc.nextInt();
            int exponent = sc.nextInt();

            iterativ(basis, exponent);

            try {
                BigDecimal result = rekursiv(basis, exponent);
                System.out.println(result.stripTrailingZeros());
            } catch (ArithmeticException e) {
                System.out.println("Ungültige Eingabe: " + e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Ungültige Eingabe: Bitte gib ganze Zahlen ein.");
        } finally {
            sc.close();
        }
    }

    private static void iterativ(int basis, int exponent) {
        boolean exp = true;
        int zwischen = 0;

        if (exponent >= 0) {
            if (exponent == 0) {
                exp = false;
            } else {
                zwischen = basis;
                for (int i = 1; i < exponent; i++) {
                    zwischen *= basis;
                }
            }
            if (exp == false) {
                System.out.println(1);
            } else {
                System.out.println(zwischen);
            }
        } else {
            try {
                BigDecimal result = BigDecimal.ONE.divide(BigDecimal.valueOf(basis).pow(-exponent));
                System.out.println(result.stripTrailingZeros());
            } catch (ArithmeticException e) {
                System.out.println("Ungültige Eingabe: " + e.getMessage());
            }
        }
    }

    private static BigDecimal rekursiv(int basis, int exponent) {
        if (exponent == 0) {
            return BigDecimal.ONE;
        } else if (exponent > 0) {
            BigDecimal zwischen = rekursiv(basis, exponent - 1);
            return BigDecimal.valueOf(basis).multiply(zwischen);
        } else {
            if (basis == 1) {
                return BigDecimal.ONE; // Wenn Basis gleich 1 ist, direkt 1 zurückgeben
            }

            try {
                BigDecimal zwischen = rekursiv(basis, exponent + 1);
                BigDecimal einsUeberPotenz = BigDecimal.ONE.divide(BigDecimal.valueOf(basis), 20, RoundingMode.HALF_UP);
                return einsUeberPotenz.multiply(zwischen);
            } catch (ArithmeticException e) {
                System.out.println("Ungültige Eingabe: " + e.getMessage());
                return BigDecimal.ZERO;
            }
        }
    }
}
