package jstore;
import java.io.*;
import java.lang.*;

public class ItemAlreadyExistsException extends Exception{
    private Item item_error;

    public ItemAlreadyExistsException (Item item_input){
        super("Item ID: ");
        item_error = item_input;

    }

    public String getExMessage(){
        return super.getMessage()+ item_error.getName() + " ,Category: " + item_error.getCategory() + " ,Status: " + item_error.getStatus() + " from: " + item_error.getSupplier().getName() + " already exists.";
    }
}
