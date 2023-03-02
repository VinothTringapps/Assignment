package org.example;

import java.util.logging.Logger;

public class LinkedListOneData {
        Logger log= Logger.getLogger("Contact");

        NodeOneData head;
        int size;

        LinkedListOneData() {
            this.head = null;
            this.size = 0;
        }

        void insertFirst(String name) {
            NodeOneData n = new NodeOneData(name);
            if(this.head != null) {
                n.next = this.head;
            }
            this.head = n;
        }
        void insertLast(String name){
            NodeOneData n=new NodeOneData(name);
            NodeOneData temp;
            if (this.head == null) {
                this.head = n;
            }
            else
            {
                temp=this.head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=n;
                this.size++;
            }
        }
        void insertAt(String name,int index){
            NodeOneData n=new NodeOneData(name);
            NodeOneData temp=this.head;
            for (int i=1;i<index;i++){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
        void removeFirst(){
            NodeOneData temp=this.head;
            this.head=temp.next;
        }
        void removeLast(){
            NodeOneData temp=this.head;
            NodeOneData prev=temp;
            while (temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
        }
        void removeAt(int index){
            NodeOneData temp=this.head;
            NodeOneData prev=temp;
            for (int i=0;i<index;i++){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
        }
        int search(String name)
        {
            int cnt=1;
            NodeOneData temp =this.head;
            while(temp!=null){
                if(temp.name.equals(name))
                {
                    return cnt;
                }
                temp=temp.next;
                cnt++;
            }
            return -1;
        }
        void display(){
            NodeOneData temp =this.head;
            while(temp!=null){
                String s="Name--"+temp.name;
                log.info(s);
                temp=temp.next;
            }
        }


}
