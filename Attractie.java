
public class Attractie {
	public void Draaien() {}
	public void Omzet(double prijs) {}
	public void kaartjesVerkocht(int kaartje) {}
	

	public class BotsAutos extends Attractie{
		
		String naam = "BotsAutos";
		double prijs = 2.50;
		public void kaartjesVerkocht (int kaartje) {
			if(kaartje > 1) {
			System.out.println(naam + " heeft "+kaartje+ " kaartjes verkocht.");
			}
		}
		public void Omzet() {
			double omzet;
			kaartjesVerkocht(3);
			System.out.println("De omzet is: ");
			
		}
	}
	public class Spin extends Attractie{
		
		String naam = "Spin";
		double prijs = 2.25;
		public void Omzet(double prijs) {}
		public void kaartjesVerkocht(int kaartje) {}
		
	public class SpiegelPaleis extends Attractie{

		String naam = "SpiegelPaleis";
		double prijs = 2.75;
		public void Omzet(double prijs) {}
		public void kaartjesVerkocht(int kaartje) {}
	}
	public class Spookhuis extends Attractie{

		String naam = "Spookhuis";
		double prijs = 3.20;
		public void Omzet(double prijs) {}
		public void kaartjesVerkocht(int kaartje) {}
	}
	public class Hawaii extends Attractie{

		String naam = "Hawaii";
		double prijs = 2.90;
		public void Omzet(double prijs) {}
		public void kaartjesVerkocht(int kaartje) {}
	}
	public class Ladderklimmen extends Attractie{

		String naam = "Ladderklimmen";
		double prijs = 5.0;
		public void Omzet(double prijs) {}
		public void kaartjesVerkocht(int kaartje) {}
	}
	
}
}

