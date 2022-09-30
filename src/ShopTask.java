import java.beans.PropertyDescriptor;
import java.util.ArrayList;

public class ShopTask {
    static class Expert {
        private ArrayList<Buyer> blackList;

        private String name;
        private ArrayList<Order> sales;
        public Expert(String name) {
            this.name = name;
        }

        public void addToSales(Order order){
            sales.add(order);
        }

        public void changeProduct(Product product, String name, int price){
            product.setName(name);
            product.setPrice(price);
        }
        public void addToBlackList(Buyer buyer){
            blackList.add(buyer);
        }
    }

    static class Order{
        private boolean isPaid;
        private ArrayList<Product> productList;

        public Order() {
            this.isPaid = false;
        }

        public void addProduct(Product product){
            this.productList.add(product);
        }
        public void pay(){
            this.isPaid = true;
        }

    }

    static class Product {
        private String name;
        private int price;
        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
    static class Buyer{
        private String name;
        private ArrayList<Order> purchases;
        public Buyer(String name){
            this.name = name;
        }

        public void payForOrder(Order order){
            order.pay();
        }

        public void addToPurchases(Order order){
            this.purchases.add(order);
        }
        public void addToOrder(Product product, Order order){
            order.addProduct(product);
        }

    }
    public static void checkOrder(Order order, Buyer buyer, Expert expert){
        if(order.isPaid){
            buyer.addToPurchases(order);
            expert.addToSales(order);
        } else {
            expert.addToBlackList(buyer);
        }
    }


    public void Main(){

        Buyer David = new Buyer("David");
        Expert DeadidaExpert = new Expert("Deadida");

        Product Bread = new Product();
        Product Vodka = new Product();
        Product Matryoshka = new Product();
        Product Balalayka = new Product();

        DeadidaExpert.changeProduct(Bread, "Хлеб", 100);
        DeadidaExpert.changeProduct(Balalayka, "Балалайка", 2000);
        DeadidaExpert.changeProduct(Vodka, "Хлеб", 250);
        DeadidaExpert.changeProduct(Matryoshka, "Матрёшка", 250);

        Order DavidOrder = new Order();
        David.addToOrder(Vodka, DavidOrder);
        David.payForOrder(DavidOrder);
        checkOrder(DavidOrder, David, DeadidaExpert);

    }
}
