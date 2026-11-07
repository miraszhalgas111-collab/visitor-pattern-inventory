package inventory;

public class TotalWeightVisitor implements ItemVisitor {
    private double totalKg;

    @Override
    public void visitWeapon(Weapon weapon) {
        totalKg += weapon.getWeightKg();
    }

    @Override
    public void visitArmor(Armor armor) {
        totalKg += armor.getWeightKg();
    }

    @Override
    public void visitPotion(Potion potion) {
        totalKg += potion.getUnitWeightKg() * potion.getQuantity();
    }

    public double getTotalKg() { return totalKg; }
}