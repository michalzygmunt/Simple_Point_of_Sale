package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {
    private Item item;
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private Customer customer;
    LCDDisplay lcdDisplay;
    BarCodeScanner barCodeScanner;

    public Transaction(){
        id = count.getAndIncrement();
        barCodeScanner = new BarCodeScanner();
        lcdDisplay = new LCDDisplay();
    }

    public int getId() {
        return id;
    }


}
