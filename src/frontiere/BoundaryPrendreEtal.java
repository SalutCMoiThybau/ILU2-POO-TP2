package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		Boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!nomVendeurConnu) System.out.println("Je suis d�sol� " + nomVendeur + " mais il faut �tre un habitant de notre village pour commencer ici.\n");
		else {
			System.out.println("Bonjour " + nomVendeur + ", je vais regarder si je peux vous trouver un �tal.\n");
			
			Boolean etalDisponible = controlPrendreEtal.resteEtals();
			if (!etalDisponible)System.out.println("D�sol� " + nomVendeur + ", je n'ai plus d'�tal qui ne soit pas d�j� occup�.\n");
			else {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		StringBuilder chaine =new StringBuilder();
		chaine.append("C'est parfait, il me reste un �tal pour vous !\n");
		chaine.append("Il me faudrait quelques renseignements :\n");
		//TODO
	}
}
