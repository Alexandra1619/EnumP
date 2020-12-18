package EnumPackage;

public enum Producti {
    canned_food(50),
    meat(120),
    tomato(70),
    noodles(40);
    private int price;
    Producti(int p)
    {
        this.price=p;
    }

    public int getPrice() {
        return price;
    }
}
