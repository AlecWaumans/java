package Model;

import Model.items.Items;

public class Square {
    private Items items;

    public Square(Items items) {
        this.items = items;
    }
    /**
     * accessor that will allow us to retrieve the private items attribute.
     *
     * @return the value of the row attribute.
     */

    public Items getItems() {
        return this.items;
    }
    public void setItems(Items items){
        this.items = items;
    }

    @Override
    public String toString() {
        return "Square{" +
                "items = " + this.items +
                '}';
    }
}
