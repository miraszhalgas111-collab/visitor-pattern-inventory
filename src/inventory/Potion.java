package inventory;

public class Potion implements Item {
    private final String name;
    private final int healAmount;
    private final int quantity;
    private final double unitWeightKg;
    private final int unitPriceGold;

    public Potion(String name, int healAmount, int quantity, double unitWeightKg, int unitPriceGold) {
        this.name = name;
        this.healAmount = healAmount;
        this.quantity = quantity;
        this.unitWeightKg = unitWeightKg;
        this.unitPriceGold = unitPriceGold;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visitPotion(this); // double dispatch
    }

    public String getName() { return name; }
    public int getHealAmount() { return healAmount; }
    public int getQuantity() { return quantity; }
    public double getUnitWeightKg() { return unitWeightKg; }
    public int getUnitPriceGold() { return unitPriceGold; }
}