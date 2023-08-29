package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars; 

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood,
            double price) {
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = new ArrayList<>();

        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = i.next();
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder()))) 
                continue; 
            
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) 
                continue;
            
            String type = searchGuitar.getType();
            if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType()))) 
                continue;
            
            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood()))) 
                continue;
            
            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood()))) 
                continue;

            matchingGuitars.add(guitar);
        }
        
        return matchingGuitars;
    }
}
