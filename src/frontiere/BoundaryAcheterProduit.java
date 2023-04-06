package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		boolean acheteurReconnu = controlAcheterProduit.isHabitant(nomAcheteur);
		if (!acheteurReconnu) System.out.println("Je suis désolé " + nomAcheteur + " mais il faut être un habitant de notre village pour acheter un produit.\n");
		else {
			System.out.println("Quel produit voulez-vous acheter ?\n");
			String produit = scan.next();
			
		}
	}
}
