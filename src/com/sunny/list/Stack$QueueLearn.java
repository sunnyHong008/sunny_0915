package com.sunny.list;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Stack$QueueLearn {

    public static void main(String[] args) {

        //继承自Vector,先进后出
        Stack<Integer> integerStack = new Stack<>();
        //队列实现自Queue接口，常用的还有ArrayDeque,先进先出
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        //添加元素
        integerStack.push(1);
        integerStack.push(1);
        integerLinkedList.offer(1);
        integerLinkedList.offer(2);

        System.out.println(integerStack.pop());//取得栈顶元素并删除
        integerStack.peek();
        integerLinkedList.peek();//取得先进的元素
//        integerLinkedList.poll();//删除
        System.out.println("integerLinkedList："+integerLinkedList);

        integerStack.push(2);
        System.out.println(integerStack.search(1));//查询位置

//        LinkedList
//        ArrayDeque
        System.out.println(integerStack);

        System.out.println("测试效率============================");

        ArrayList<String> strings = new ArrayList<>();
        long t1 = System.currentTimeMillis();
        for(int i = 1;i<=200000;i++){
            strings.add(0, "hello");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("ArrayList耗时："+(t2-t1));


        LinkedList<String> strings1 = new LinkedList<>();
        long t3 = System.currentTimeMillis();
        for(int i = 1;i<=200000;i++){
            strings1.add(i-1, "hello");
        }
        long t4 = System.currentTimeMillis();

        System.out.println("LinkedList耗时："+(t4-t3));



    }
}
