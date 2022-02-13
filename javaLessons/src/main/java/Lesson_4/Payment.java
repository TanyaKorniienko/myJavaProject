package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("product1", 1.2);
        payment.addProduct("product2", 1.2);
        payment.addProduct("product3", 4);
        payment.showProducts();
    }

    List<Payment.Product> productList = new ArrayList<>();

    public Payment(){}

    public void showProducts(){
        productList.forEach(System.out::println);
    }


    public List<Payment.Product> getProductList() {
        return productList;
    }

    public void addProduct(String name, double price) {
        productList.add(new Payment.Product(name, price));
    }

    private class Product{
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
        }
    }

}
