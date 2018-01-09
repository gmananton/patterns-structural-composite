package items;

/**
 * Created by Anton Mikhaylov on 09.01.2018.
 */
public abstract class BaseItem implements Item {

    protected int price;

    public BaseItem() {
    }

    public BaseItem(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
