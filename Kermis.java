import java.util.Scanner;

public class Kermis {
	
	public static void Draaien() {
		System.out.println("Attractie draait.");
	}
	
	public static void kiesRit() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Kies een rit nummer tussen 1 - 6\n");
	String input = sc.nextLine();
	int keuze = 0;

	
	switch(input) {
	case "1":
		System.out.println("De gekozen rit is : BotsAutos");
		Draaien();
		keuze++;
		
		break;
	case "2":
		System.out.println("De gekozen rit is : Spin");
		Draaien();
		keuze++;
		
		break;
	case "3":
		System.out.println("De gekozen rit is : SpiegelPaleis");
		Draaien();
		double omzetSpiegelPaleis = 2.75;
		System.out.println("SpiegelPaleis heeft "+omzetSpiegelPaleis+" opgebracht.");
		
		break;
	case "4":
		System.out.println("De gekozen rit is : Spookhuis");
		Draaien();
		double omzetSpookhuisNew = 0.0 + 3.20;
		System.out.println("SpiegelPaleis heeft "+omzetSpookhuisNew+" opgebracht.");
		break;
	case "5":
		System.out.println("De gekozen rit is : Hawaii");
		Draaien();
		break;
	case "6":
		System.out.println("De gekozen rit is : Ladderklimmen");
		Draaien();
		break;
		
	default:
		System.out.println("No usable choice has been given.");
		
	}
	Scanner sc2 = new Scanner(System.in);
	System.out.println("\n Om de omzet van de kermis in te zien toets 'o' \n"
			+ "Als je de kaartverkoopt wilt inzien toets 'k");
	String inputLetter = sc2.nextLine();
	
	switch(inputLetter) {
	
	case "o":
		System.out.println("De omzet is:");
	}
	
		
}
	
	public static void main(String[] args) {
		
		kiesRit();
		Attractie b = new Attractie();
		b.Omzet(3);
		b.kaartjesVerkocht(3);
		
		
	}

}

