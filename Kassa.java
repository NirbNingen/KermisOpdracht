

public class Kassa {

	Kassa kassa = new Kassa();
	
	
	public void berekenOmzet(double prijs,int totaleRitten) {
		double omzetAttractie = prijs * totaleRitten;
		System.out.println("Totale omzet is: ");
		
		int attractie = 1;
		switch(attractie) {
		
		case '1':
			System.out.println("");
		
		}
	}
	
	public void omzetInfo() {
	
	int kaartjes;
	double prijs;
	char keuze = 'o';
	
	switch(keuze) {
	
	
		case 'o':
		System.out.println("De totale omzet van de Kermis is: ");
		break;
	
		case 'k':
		System.out.println("Aantal kaartjes verkocht: ");
		break;
		}
	
	}
}
