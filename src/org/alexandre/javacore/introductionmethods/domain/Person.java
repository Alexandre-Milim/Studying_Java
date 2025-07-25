package org.alexandre.javacore.introductionmethods.domain;

public class Person {
    private String name;
    private int age;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name) {
        if ("admin".equalsIgnoreCase(name)) {
            System.out.println("The name \"" + name + "\" is not allowed.");
            return;
        }

        this.name = name;
    }


    public void setAge(int age){
        if (age < 0 ){
            System.out.println("Age Invalid");
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
