
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
		
		int zahl1 = 0; //5
		int zahl2 = 0; //5
		int result = 0; //
		
		if(zahl1<0||zahl2<0) {
			System.out.println("Eingabe darf nicht kleiner 0 sein");
		}else {
			iterativ(5,5,0);
			rekursiv(0,0,0);
		}
	
		
		
	}
	private static int iterativ(int basis, int exponent, int res) {
		if(exponent == 0) {
			return 1;
		}
		
		
		return res;
	}
	private static int rekursiv(int zahl1, int zahl2, int res) {
	
		return res;
	}
}

