package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/*publisher - subscriber*/
public class Amazon {

    static List<Subscriber> ops = new ArrayList<>();
//    OrderPlaced() {
//        invoiceGeneration();
//        inventoryUpdate();
//        emailNotificatio();
//        logisticupdate();
//    }

    public static void registerSubscriber(Subscriber s) {
        ops.add(s);
    }

    public static void unregisterSubscriber(Subscriber s) {
        ops.remove(s);
    }

    public void orderPlaced() {
        for(Subscriber s: ops) {
            s.onOrderPlaced();
        }
    }
}
