package Products;

import java.util.Objects;

import static Products.ProductsList.addProductToList;

public class Products {
    private String name;
    private double price;
    private int count;


    public Products(String name, double price, int count) {
        if (name == null && name.isBlank() && name.isEmpty() && price < 0 && count < 0) {
            throw new RuntimeException("Заполните карточку товара " + name + " корректно");
        } else {
            this.name = name;
            this.price = price;
            this.count = count;
            addProductToList(this);

        }
    }


    @Override
    public String toString() {
        return "Продукт" + name + " " +
                "стоит -" + price +
                " рублей";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products)) return false;
        Products products = (Products) o;
        return Double.compare(products.price, price) == 0 && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
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
