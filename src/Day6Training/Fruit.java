package Day6Training;

public enum Fruit {
    APPLES("SHIMLA"),
    MANGOES("RATANAGIRI"),
    BANANAS("KERALA"),
    KIWI ("NEW ZELAND"),
    ORANGE("NANITAL");


    private String fruitOrigin;

    Fruit(String fruitOrigin) {
        this.fruitOrigin = fruitOrigin;
    }

    public String getFruitOrigin() {
        return fruitOrigin;
    }
}
