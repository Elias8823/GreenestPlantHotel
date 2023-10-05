package Sprint1.Inlämningsuppgift1;

import javax.swing.*;
import java.util.ArrayList;

class Main {

    Main() {
        // Skapar ArrayList av typen Växter och lägger till objekt av subklasser
        ArrayList<Växter> plants = new ArrayList<>();
        plants.add(new Kaktus("Igge", 0.2));
        plants.add(new KöttätandeVäxt("Meatloaf", 0.7));
        plants.add(new Palm("Laura", 5));
        plants.add(new Palm("Olof", 1));

        boolean wrongInput;


        do {
            wrongInput = false;
            boolean foundPlant = false;

            try {

                String userInput = JOptionPane.showInputDialog("Vilken växt ska få vatten?");

                for (Växter plant : plants) {
                    if (userInput.equalsIgnoreCase(plant.getName())) {
                        // Metodanrop av samma typ får olika värden genom polymorfism
                        JOptionPane.showMessageDialog(null, plant.getName() + " behöver " + plant.getLiquidAmount() + " l " + plant.getLiquidType());
                        foundPlant = true;
                        break;
                    }
                }
                if (!foundPlant) {
                    JOptionPane.showMessageDialog(null, "Växtnamnet existerar inte. Försök igen");
                    wrongInput = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Programmet avslutades");
                break;
            }
        } while (wrongInput);
    }

    public static void main(String[] args) {

        Main m = new Main();
    }
}


