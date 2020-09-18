package com.sunny.list.vo;

public class Dog implements Comparable<Dog>{

    private String name;
    public int number;

    public Dog(String name,int number){

        this.name = name;
        this.number = number;
    }

//    public boolean equals(Object obj) {
//
//        return true;
//    }
//
    public int hashCode() {
        return number;
    }

    public String toString() {
        return "toString:"+number;
    }

    @Override
    public int compareTo(Dog o) {

        return number;
    }
}
