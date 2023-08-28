package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpec;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatAmishaLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, 6, Wood.ALDER,
				Wood.ALDER);

		List<Guitar> matchingGuitars = inventory.search(whatAmishaLikes);

		if (!matchingGuitars.isEmpty()) {
			System.out.println("Amisha, you might like these guitars: ");
			for (Guitar guitar : matchingGuitars) {
				GuitarSpec spec = guitar.getSpec();

				System.out.println(" We have a " + spec.getBuilder() + " " + spec.getModel() + " "
						+ spec.getNumStrings() + "" + "-string " + spec.getType() + " " + "guitar:\n"
						+ spec.getBackWood() + " back and sides,\n " + spec.getTopWood()
						+ " top.\nYou can have it for only $" + guitar.getPrice() + "!\n ---------");
			}
		} else {
			System.out.println("Sorry, Amisha, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		GuitarSpec spec1 = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
		GuitarSpec spec2 = new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE);
		GuitarSpec spec3 = new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD,
				Wood.COCOBOLO);
		GuitarSpec spec4 = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);

		inventory.addGuitar(new Guitar("111", 999, spec1));
		inventory.addGuitar(new Guitar("222", 1499, spec2));
		inventory.addGuitar(new Guitar("333", 1999, spec3));
		inventory.addGuitar(new Guitar("444", 111, spec4));
	}
}
