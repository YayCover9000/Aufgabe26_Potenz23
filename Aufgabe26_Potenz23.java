import java.math.BigDecimal;
import java.util.Scanner;
public class Aufgabe26_Potenz23 {
	public static void main(String [] args) {
					/*
					• Gegeben sei ein sehr einfacher Taschenrechner, der nur die beiden
					Grundrechenoperationen (+, -) beherrscht.
					• Geben Sie für diesen Taschenrechner zwei Algorithmen zur Berechnung der Potenz an:
					zahl1zahl2.
					• Implementieren Sie den iterativen und rekursiven Algorithmus zum Potenzieren!
					• Bemühen Sie sich um eine elegante Lösung. Verwenden Sie für diese Lösung
					möglichst wenige Befehle. Auch das Abfragen von Sonderfällen bzw. Fehlern
					sollten Sie auf ein Minimum reduzieren. (Sie werden sehen, dass die Mühe sich
					lohnt. Die Struktur des Programms wird damit viel klarer. Damit reduziert sich auch
					die Fehleranfälligkeit.)
					• Versuchen Sie Ihren rekursiven Algorithmus mit Hilfe des Debuggers
					nachzuvollziehen. (Sie werden sehen, dass Sie so die Rekursion besser verstehen
					können.)
					• Suchen Sie in der Java-API in der Klasse Math, ob es eine Methode zum Potenzieren
					gibt. Falls ja, setzen Sie diese Methode ein, um zu überprüfen, ob Ihr Algorithmus
					richtig rechnet.
					*/
		
		//Mit addition multiplikation bauen -> dann methode multiplikation sooft aufrufen wie potenz steht
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tippe Basis bestätige mit Enter dann tippe exponent bestätige mit Enter");
		int zahl1 = sc.nextInt();
		int zahl2 = sc.nextInt();
		
//		if(zahl1<0||zahl2<0) {
//			System.out.println("Eingabe darf nicht kleiner 0 sein"); //TODO aender weil negative exponenten auch zugelassen sind
//		}else {
			iterativ(zahl1,zahl2);
			rekursiv(zahl1,zahl2);
//		}
	
		
		
	}
	private static void iterativ(int basis, int exponent) {
		boolean exp = true;
		int zwischen = 0;
		double zwischenD = 0.0;
		
		if(exponent >= 0) {
			if(exponent == 0) {
				exp = false;
			}else {
				zwischen = basis;
				for(int i = 1; i < exponent; i++) {
					zwischen *= basis;
				}
			}
				if (exp == false) {
					System.out.println(1);
				} else {
				System.out.println(zwischen);
				}
		}
//			if(exponent < 0) {
//				zwischenD = 1.0/basis;
//				exponent *= -1;
//				for(int i = 1; i < exponent; i++) {
//					zwischenD *= 1.0/basis;
//				}
//				System.out.printf("%.2f%n", zwischenD);
//				System.out.println(zwischenD);
//			}
			if (exponent < 0) {
	            BigDecimal result = BigDecimal.ONE.divide(BigDecimal.valueOf(basis).pow(-exponent));
	            System.out.println(result);
	        }

	}
	private static void rekursiv(int zahl1, int zahl2) {
	
		
	}
	
}

