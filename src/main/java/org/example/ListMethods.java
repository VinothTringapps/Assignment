package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListMethods {
    ArrayList<String> list=new ArrayList<>();
    Logger l=Logger.getLogger("List");
    protected void ListAdd(String a){
        list.add(a);
    }
    protected void ListRemove(int a){
        list.remove(a);
    }
    protected void ListClear(){
        list.clear();
    }
    protected void Display() {
        l.log(Level.INFO, () -> "" + list);
    }
    protected void Size(){
        l.log(Level.INFO,()->""+list.size());
    }

}
