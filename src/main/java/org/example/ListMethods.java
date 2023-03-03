package org.example;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListMethods {
    ArrayList<String> list=new ArrayList<>();
    Logger l=Logger.getLogger("List");
    protected void listAdd(String a){
        list.add(a);
    }
    protected void listRemove(int a){
        list.remove(a);
    }
    protected void listClear(){
        list.clear();
    }
    protected void display() {
        l.log(Level.INFO, () -> "" + list);
    }
    protected void size(){
        l.log(Level.INFO,()->""+list.size());
    }

}
