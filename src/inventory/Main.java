package inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem(new Weapon("Iron Sword", 25, 3.5, 120));
        inventory.addItem(new Armor("Steel Shield", 18, 6.0, 200));
        inventory.addItem(new Potion("Healing Potion", 50, 4, 0.5, 30));

        TotalValueVisitor valueVisitor = new TotalValueVisitor();
        inventory.accept(valueVisitor);
        System.out.println("Total value: " + valueVisitor.getTotalGold() + " gold");

        TotalWeightVisitor weightVisitor = new TotalWeightVisitor();
        inventory.accept(weightVisitor);
        System.out.println("Total weight: " + weightVisitor.getTotalKg() + " kg");

        DescriptionVisitor descriptionVisitor = new DescriptionVisitor();
        inventory.accept(descriptionVisitor);
        System.out.print(descriptionVisitor.getReport());
    }
}