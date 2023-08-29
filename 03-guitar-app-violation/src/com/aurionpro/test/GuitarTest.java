package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Guitar;
import com.aurionpro.model.Inventory;

public class GuitarTest {
	public static void main(String[] args) {
		
		Guitar guitar = new Guitar("111", "Fender", "Stratocaster", "Electric", "Maple", "Alder", 100) ;
		System.out.println(guitar);
			
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar whatAmishaLikes = new Guitar("111", "Fender", "Stratocaster", "Electric", "Maple", "Alder", 100);

		List<Guitar> matchingGuitars = inventory.search(whatAmishaLikes);

		if (!matchingGuitars.isEmpty()) {
			for (Guitar guitar2 : matchingGuitars) {
				System.out.println("Amisha, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " "
						+ guitar.getType() + "  guitar:\n " + guitar.getBackWood() + " back and sides,\n "
						+ guitar.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!");
			}
		} else {
			System.out.println("Sorry, Amisha, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("123", "Fender", "Stratocaster", "Electric", "Maple", "Alder", 999);
		inventory.addGuitar("456", "Gibson", "Les Paul", "Electric", "Mahogany", "Maple", 1499);
		inventory.addGuitar("789", "Martin", "D-28", "Acoustic", "Rosewood", "Spruce", 1999);
	}
}
