// Mert Uzeken
// Matrikel-Nr: 1142543

package meilenstein1;
import java.util.Scanner;

public class Meilenstein1 {

	public static void main(String[] args) {
		int cm = 0;
		String[] sizes= {"XS","S","M"};
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Bitte geben Sie die K�rpergr��e des Kindes (in cm) ein: \n");
		cm = keyboard.nextInt();
		double zoll = convertUnits(cm);
		System.out.printf("K�rpergr��e in Zoll: %1.2f \n", zoll);
		
		

		if (cm > 129 && cm <=140) {
			System.out.printf("US-Kleidergr��e: %s", sizes[0]);
		}
		else if (cm > 140 && cm <= 152) {
			System.out.printf("US-Kleidergr��e: %s", sizes[1]);
		}
		else if (cm > 152 && cm <= 164) {
			System.out.printf("US-Kleidergr��e: %s", sizes[2]);
		}
		else{
			System.out.printf("Fehlerhafte eingabe");
		}
	}

	public static double convertUnits(int cm) {
		return (cm/2.54);
	}
}
