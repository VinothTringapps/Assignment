package org.example;

public class SchoolGpaTest {
    private String name;
    private int age;
    private double gpa;


    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Double getGpa(){
        return this.gpa;
    }
    public void setDetails(String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;

    }
}
