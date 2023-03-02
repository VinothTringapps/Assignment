package org.example;

import java.util.*;
import java.util.logging.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger l = Logger.getLogger("Exception");
        AssMethods access = new AssMethods();
        int option;
        try {
            do {
                l.info("\t1.Bank\t2.Basic Shape\t3.SchoolTest\t4.Connection Pool\t5.Basic Point\t" );
                l.info("6.Basic Credit Card\t7.ArrayList\t8.LinkedList\t9.TicTacToe\t10.Hash Map\t");
                l.info("11.Hash Set\t12.Tree Set\t13.Calculator\t14.SchoolGpa With List\t15.Frequency\t");
                l.info("16.Contact using Linked List");
                l.info("Enter the option You want :");
                option = sc.nextInt();
                switch (option) {
                    case 1 -> access.bank();
                    case 2 -> access.shape();
                    case 3 -> access.school();
                    case 4 -> access.connectionPool();
                    case 5 -> access.basicPoint();
                    case 6 -> access.basicCreditCard();
                    case 7 -> access.arrayList();
                    case 8 -> access.linkedList();
                    case 9 -> access.ticTacToe();
                    case 10 -> access.hash();
                    case 11 -> access.hashSet();
                    case 12 -> access.treeSet();
                    case 13->access.calculator();
                    case 14->access.schoolGpaTest();
                    case 15->access.frequency();
                    case 16->access.contact();

                    default -> l.info("Wrong Choice !");
                }
            } while (option < 17);
        } catch (InputMismatchException e) {
            l.info("InputMismatched !");
        } catch (NullPointerException e) {
            l.info("Input Can not Be Null");
        }
    }
}
