package uebung_3_2;

public class uebung_3_2 {

	public static void main(String[] args) {
		double bestellwert = 5001;
		double bisherigesKundenbestellvolumen = 100;
		boolean istPremimunKunde;
		double mengenrabatt = 0;
		if (bestellwert < 100) {
			System.out.println("x1 = 0 % ");

		} else {
			if (bestellwert < 500) {
				 mengenrabatt = 0.01 ;
				System.out.println("Prozentsatz = 1 % ");
				
			} else {
				if (bestellwert < 2000) {
					 mengenrabatt = 0.02;
					System.out.println("Prozentsatz = 2 % ");

				} else {
					if (bestellwert < 5000) {
						mengenrabatt = 0.03;
						System.out.println("Prozentsatz = 3 % ");
		
					} else {
						if (bestellwert >= 5000) {
							mengenrabatt = 0.05;
							System.out.println("Prozentsatz = 5 % ");
				
						}
					}
				}
			}
		}
		System.out.println(bestellwert);
		System.out.println(bestellwert - bestellwert * mengenrabatt);
	}
}
