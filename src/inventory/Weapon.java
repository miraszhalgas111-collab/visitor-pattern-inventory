package inventory;

public class Weapon implements Item {
    private final String name;
    private final int damage;
    private final double weightKg;
    private final int priceGold;

    public Weapon(String name, int damage, double weightKg, int priceGold) {
        this.name = name;
        this.damage = damage;
        this.weightKg = weightKg;
        this.priceGold = priceGold;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visitWeapon(this); // double dispatch
    }

    public String getName() { return name; }
    public int getDamage() { return damage; }
    public double getWeightKg() { return weightKg; }
    public int getPriceGold() { return priceGold; }
}