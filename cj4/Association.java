package cj4;
class Customer {
    String name;
    Customer(String name) {
        this.name = name;
    }
}

class Order {
    String id;
    Customer customer;

    Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    void print() {
        System.out.println("Order " + id + " for " + customer.name);
    }
}

public class Association{
    public static void main(String[] args) {
        Customer c = new Customer("Amena");
        Order o = new Order("ORD-101", c);
        o.print();
    }
}
