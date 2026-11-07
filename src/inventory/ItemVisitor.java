package inventory;

public interface ItemVisitor {
    void visitWeapon(Weapon weapon);
    void visitArmor(Armor armor);
    void visitPotion(Potion potion);
}