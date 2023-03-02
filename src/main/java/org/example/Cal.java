package org.example;

abstract class Cal {


        private int a;
        private int b;

        public int getA(){
            return a;
        }
        public int getB(){
            return b;
        }
        public void setA(int a){
            this.a=a;
        }
        public void setB(int b){
            this.b=b;
        }
        abstract int setCal(int a,int b);




}
