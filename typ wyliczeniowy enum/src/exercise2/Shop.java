package exercise2;

public class Shop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Order[] orders = new Order[10];
        orders[0]=new Order("Apple",3999.99,Status.PAID);
        orders[1]=new Order("Asus",499.99,Status.PAID);
        orders[2]=new Order("Intel",699.99,Status.NEW);
        orders[3]=new Order("Mause",199.99,Status.SHIPPED);
        orders[4]=new Order("Keyboard",99.99,Status.SHIPPED);
        orders[5]=new Order("PC",8999.99,Status.DELIVERED);
        orders[6]=new Order("Samsung",799.99,Status.PAID);
        orders[7]=new Order("Pendrive",99.99,Status.SHIPPED);
        orders[8]=new Order("Disc CD",2.99,Status.SHIPPED);
        orders[9]=new Order("AMD",399.99,Status.PAID);

        shop.printStatus(orders,Status.SHIPPED);

    }

    public void printStatus(Order[] order, Status status){
        for (int i = 0; i <order.length ; i++) {
            if (order[i].getStatus().equals(status)){
                System.out.println(order[i].toString());
            }
        }
    }
}
