package inventory;

public interface Item {
    void accept(ItemVisitor visitor);
}