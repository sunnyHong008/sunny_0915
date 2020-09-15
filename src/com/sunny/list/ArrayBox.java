package com.sunny.list;

import com.sunny.exception.BoxIndexOutOfBoundsException;

import javax.sound.midi.Soundbank;

/**
 *
 */
public class ArrayBox {


    private int[] elementData = new int[10];//初始长度
    private int size = 0;//有效元素个数

    public ArrayBox(){

        elementData = new int[10];
    }

    public ArrayBox(int capacity){

        elementData = new int[capacity];
    }

    //
    private void ensureCapacityInternal(int minCapacity){

        if(minCapacity - elementData.length > 0){ //需要扩容
            this.grow(minCapacity);
        }
    }

    //扩容操作
    private void grow(int minCapacity){

        int oldCapacity = elementData.length;
        //扩容至1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        //
        if(newCapacity - minCapacity < 0){
            newCapacity = minCapacity;
        }
        System.out.println("进行了扩容操作，新的容量为：" + newCapacity);
        elementData = this.copy(elementData, newCapacity);
    }

    private int[] copy(int[] oldArray,int newCapacity){
        int[] newArray = new int[newCapacity];
        //将旧数组元素存进新数组
        for (int i = 0;i < oldArray.length;i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    private void rangeCheck(int index){

        if(0 > index || index >= size){
            throw new BoxIndexOutOfBoundsException("index不合法");
        }
    }

    /**
     * 添加元素
     * @param element
     * @return
     */
    public boolean add(int element){

        this.ensureCapacityInternal(size + 1);
        elementData[size++] = element;
        return true;
    }

    /**
     * 根据索引获取元素
     * @param index
     * @return
     */
    public int get(int index){
        //检测index范围是否合法
        this.rangeCheck(index);

        return elementData[index];

    }

    /**
     * 删除元素
     */
    public int remove(int index){
        //校验index合法性
        this.rangeCheck(index);

        int oldValue = elementData[index];

        for (int i = index;i < size-1;i++) {
            elementData[i] = elementData[i+1];
        }

        elementData[size] = 0;
        size--;
        return oldValue;
    }

    /**
     * 修改元素
     * @param index
     * @return
     */
    public boolean update(int index,int element){
        //校验index合法性
        this.rangeCheck(index);

        elementData[index] = element;

        return true;
    }




}
