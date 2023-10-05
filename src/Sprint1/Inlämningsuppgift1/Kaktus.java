package Sprint1.Inlämningsuppgift1;

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
    public double getWaterAmount() {
        return 0.02;
    }
}