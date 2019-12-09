package data.dtos;

public class ItemDTO {
    private String name;
    private int price;

    public ItemDTO(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}