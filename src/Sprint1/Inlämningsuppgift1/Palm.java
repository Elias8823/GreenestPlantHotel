package Sprint1.Inlämningsuppgift1;

public class Palm extends Växter {

    String liquidType = "kranvatten";

    public Palm(String name, double length) {
        this.setName(name);
        this.setLength(length);
    }


    @Override
    public String getLiquidType() {
        return liquidType;
    }

    @Override
    public double getLiquidAmount() {
        return (0.5 * getLength());
    }
}