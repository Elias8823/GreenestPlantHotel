package Sprint1.Inlämningsuppgift1;

public class KöttätandeVäxt extends Växter {

    String liquidType = "proteindryck";

    public KöttätandeVäxt(String name, double length) {
        this.setName(name);
        this.setLength(length);
    }


    @Override
    public String getLiquidType() {
        return liquidType;
    }

    @Override
    public double getLiquidAmount() {
        return 0.1 + (0.2 * getLength());
    }
}
