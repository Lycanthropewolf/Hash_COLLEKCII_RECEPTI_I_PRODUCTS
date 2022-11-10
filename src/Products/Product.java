package Products;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int count;


    public Product(String name, double price, int count) {
        if (name == null && name.isBlank() && name.isEmpty() && price < 0 && count < 0) {
            throw new RuntimeException("Заполните карточку товара " + name + " корректно");
        } else {
            this.name = name;
            this.price = price;
            this.count = count;
        }
    }


    @Override
    public String toString() {
        return "Продукт - " + name + " " +
                "стоит - " + price +
                " рублей. ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product products = (Product) o;
        return Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getCount() {
        return count;
    }

}
