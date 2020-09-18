package com.sunny.list;

import com.sunny.list.vo.Dog;

import javax.xml.transform.Source;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetLearn {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
//
        set.add("a");
        set.add("b");
        set.add("a");
        set.add("D");
        set.add("A");

//        set.addAll(set);//不重复

//        System.out.println(set.remove("159357"));//返回是否删除成功

//        由于没有顺序，没有修改方法

//        也没有get方法，jdk1.5以后可以用增强for循环遍历，

        Iterator<String> it = set.iterator();
//        do {
//            System.out.println(it.next());
//        } while (it.hasNext());

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(set);

        HashSet<Dog> dogs = new HashSet<>();

        dogs.add(new Dog("a",10));
        dogs.add(new Dog("a",5));
        dogs.add(new Dog("a",100));
        dogs.add(new Dog("a",-2));

        System.out.println(dogs);


        TreeSet<Dog> stringTreeSet = new TreeSet<>();

        stringTreeSet.add(new Dog("a",10));
        stringTreeSet.add(new Dog("a",5));
        stringTreeSet.add(new Dog("a",100));
        stringTreeSet.add(new Dog("a",-2));

        System.out.println(stringTreeSet);
        //java.lang.ClassCastException: com.sunny.list.vo.Dog cannot be cast to java.lang.Comparable




    }
}
