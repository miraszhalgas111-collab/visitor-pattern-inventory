package inventory;

public class Armor implements Item {
    private final String name;
    private final int defense;
    private final double weightKg;
    private final int priceGold;

    public Armor(String name, int defense, double weightKg, int priceGold) {
        this.name = name;
        this.defense = defense;
        this.weightKg = weightKg;
        this.priceGold = priceGold;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visitArmor(this); // double dispatch
    }

    public String getName() { return name; }
    public int getDefense() { return defense; }
    public double getWeightKg() { return weightKg; }
    public int getPriceGold() { return priceGold; }
}