package com.sunny.list;

import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class VectorLearn {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();

        vector.add(1);
        vector.add(5);
        vector.add(1);

        vector.addAll(vector);
        System.out.println(vector);
        System.out.println(vector.size());//有效元素个数
        System.out.println(vector.capacity());//总长度




    }
}
