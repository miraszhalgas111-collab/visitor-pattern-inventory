# Visitor Pattern: Game Inventory

Java implementation of the Visitor behavioral design pattern.
Assignment #6, Software Design Patterns.

## Structure

| Role | Class |
| --- | --- |
| Element interface | `Item` |
| Concrete elements | `Weapon`, `Armor`, `Potion` |
| Visitor interface | `ItemVisitor` |
| Concrete visitors | `TotalValueVisitor`, `TotalWeightVisitor`, `DescriptionVisitor` |
| Object structure | `Inventory` |
| Client | `Main` |

## How double dispatch works

1. `inventory.accept(visitor)` iterates over the items and calls `item.accept(visitor)`.
2. The first dispatch picks the concrete element's `accept()`.
3. Inside it, `visitor.visitWeapon(this)` (or `visitArmor`, `visitPotion`) is called.
4. The second dispatch picks the concrete visitor's method for that element type.

## Clean Code principles

1. **Meaningful names:** `Item` is the element, `ItemVisitor` is the visitor, and `visitWeapon`, `visitArmor`, `visitPotion` name the exact element type.
2. **No instanceof or type-checking chains:** double dispatch picks the correct method.
3. **Single Responsibility:** each visitor does exactly one operation (total value, total weight, description).
4. **Minimal encapsulation trade-off:** visitors need element data, so elements expose read-only getters. All fields are `private final`, there are no setters, and state cannot be changed from outside.
5. **Open/Closed, demonstrated extensibility:** `DescriptionVisitor` was added in a separate commit without changing `Weapon`, `Armor`, `Potion`, `Item` or `Inventory`.

## Run

Run `inventory.Main`. Expected output:

    Total value: 440 gold
    Total weight: 11.5 kg
    Weapon: Iron Sword (damage 25)
    Armor:  Steel Shield (defense 18)
    Potion: Healing Potion x4 (heals 50)