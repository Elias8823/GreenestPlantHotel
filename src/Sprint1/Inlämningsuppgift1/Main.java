package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

class Main {

    Växter igge = new Kaktus("Igge", 0.2);
    Växter meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
    Växter laura = new Palm("Laura", 5);
    Växter olof = new Palm("Olof", 1);

    Main() {

        boolean wrongInput;

        do {
            wrongInput = false;
            try {

                String userInput = JOptionPane.showInputDialog("Vilken växt ska få vatten?");
                if (userInput.equalsIgnoreCase(igge.getName()))
                    JOptionPane.showMessageDialog(null, igge.getName() + " behöver " + igge.getWaterAmount() + " l " + igge.getLiquidType());

                else if (userInput.equalsIgnoreCase(meatloaf.getName()))
                    JOptionPane.showMessageDialog(null, meatloaf.getName() + " behöver " + meatloaf.getWaterAmount() + " l " + meatloaf.getLiquidType());

                else if (userInput.equalsIgnoreCase(laura.getName()))
                    JOptionPane.showMessageDialog(null, laura.getName() + " behöver " + laura.getWaterAmount() + " l " + laura.getLiquidType());

                else if (userInput.equalsIgnoreCase(olof.getName()))
                    JOptionPane.showMessageDialog(null, olof.getName() + " behöver " + olof.getWaterAmount() + " l " + olof.getLiquidType());
                else {
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
