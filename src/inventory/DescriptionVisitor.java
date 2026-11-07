package inventory;

public class DescriptionVisitor implements ItemVisitor {
    private final StringBuilder report = new StringBuilder();

    @Override
    public void visitWeapon(Weapon weapon) {
        report.append(String.format("Weapon: %s (damage %d)%n", weapon.getName(), weapon.getDamage()));
    }

    @Override
    public void visitArmor(Armor armor) {
        report.append(String.format("Armor:  %s (defense %d)%n", armor.getName(), armor.getDefense()));
    }

    @Override
    public void visitPotion(Potion potion) {
        report.append(String.format("Potion: %s x%d (heals %d)%n",
                potion.getName(), potion.getQuantity(), potion.getHealAmount()));
    }

    public String getReport() { return report.toString(); }
}