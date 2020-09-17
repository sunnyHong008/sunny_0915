package com.sunny.list;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class ListLearn {

    public static void main(String[] args) {

        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        //有序可重复
        arrayList.add(true);
//        arrayList.add(3.14);
        arrayList.add(true);
        arrayList.add(false);
        arrayList.add(true);

//        arrayList.addAll(arrayList); //并集
//        arrayList.removeAll(arrayList);//差集
//        arrayList.containsAll(arrayList);//交集
//
//        arrayList.remove(true);


//        arrayList.clear();

        System.out.println("集合是否为空"+arrayList.isEmpty());

        //是否包含某元素
        System.out.println(arrayList.contains(false));

        //第一次出现的索引
        System.out.println(arrayList.indexOf(false));

        //根据起始索引截取一个新的List(返回父类List类型)
        System.out.println(arrayList.subList(0, 1));


        Boolean[] booleans = new Boolean[arrayList.size()];
        arrayList.toArray(booleans);

        System.out.println("booleans:" + booleans[0]);

        System.out.println(arrayList.size());
        System.out.println(arrayList);

        System.out.println(arrayList.iterator());

        //将集合长度设置为有效值长度
        arrayList.trimToSize();

//        arrayList.sort();

    }
}
