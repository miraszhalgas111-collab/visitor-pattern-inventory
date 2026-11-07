package inventory;

public class TotalValueVisitor implements ItemVisitor {
    private int totalGold;

    @Override
    public void visitWeapon(Weapon weapon) {
        totalGold += weapon.getPriceGold();
    }

    @Override
    public void visitArmor(Armor armor) {
        totalGold += armor.getPriceGold();
    }

    @Override
    public void visitPotion(Potion potion) {
        totalGold += potion.getUnitPriceGold() * potion.getQuantity();
    }

    public int getTotalGold() { return totalGold; }
}