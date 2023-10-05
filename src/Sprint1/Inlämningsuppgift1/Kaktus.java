package Sprint1.Inlämningsuppgift1;

// Kaktus ärver Växter och blir en subklass till superklassen Växter
public class Kaktus extends Växter {

    String liquidType = "mineralvatten";

    public Kaktus(String name, double length) {
        this.setName(name);
        this.setLength(length);
    }


    @Override
    public String getLiquidType() {
        return liquidType;
    }

    @Override
    public double getLiquidAmount() {
        return 0.02;
    }
}