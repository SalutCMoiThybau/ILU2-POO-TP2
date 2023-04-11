package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...\n");
		village = new Village("le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}
	
	@Test
	void testControlEmmenager() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		assertNotNull(controlEmmenager, "Constructeur ne renvoie pas null\n");
	}
	
	@Test
	void testIsHabitant() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonemine", 10);
		assertTrue(controlEmmenager.isHabitant("Bonemine"));
		assertFalse(controlEmmenager.isHabitant("Non"));
		controlEmmenager.ajouterDuide("Panoramix", 10, 1, 5);
		assertTrue(controlEmmenager.isHabitant("Panoramix"));
	}
	
	@Test
	void testAjouterDuide() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		int force = 10; int effetPotionMin = 1; int effetPotionMax = 5;
		controlEmmenager.ajouterDuide("Panoramix", force, effetPotionMin, effetPotionMax);
		assertTrue(controlEmmenager.isHabitant("Panoramix"));
//		assertTrue(village.trouverHabitant("Panoramix").getForce()==force);
	}
	
	@Test
	void testAjouterGaulois() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		int force = 10;
		controlEmmenager.ajouterGaulois("Bonemine", force);
		assertTrue(controlEmmenager.isHabitant("Bonemine"));
//		assertTrue(village.trouverHabitant("Bonemine").getForce()==force);
	}

}
