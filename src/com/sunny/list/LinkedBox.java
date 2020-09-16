package com.sunny.list;

import com.sunny.exception.BoxIndexOutOfBoundsException;

public class LinkedBox {

    private Node first; //记录首节点
    private Node last; //记录尾结点
    private int size; //有效元素个数

    /**
     * 添加元素
     * @param element
     * @return
     */
    public boolean add(int element) {

        this.linkLast(element);
        return true;
    }

    //负责将新元素添加在新的node里，挂在尾端
    private void linkLast(int element){

        //获取链表的尾结点
        Node l = last;
        //创建一个新对象，将数据包装起来
        Node newNode = new Node(l, element, null);
        //将新节点对象设置为尾结点
        last = newNode;
        //首次
        if(l==null){
            first = newNode;
        }else {
            l.next = newNode;
        }
        size++;
    }

    /**
     * 获取指定元素
     * @param index
     * @return
     */
    public int get(int index){

        this.checkIndex(index);
     return this.node(index).item;
    }

    private Node node(int index){
        Node targetNode;
        if(index < (size>>1)){//说明在前半部分，从头遍历效率高
            targetNode = first;
            for(int i = 0;i<index;i++){
                targetNode = targetNode.next;
            }
        }else {//反之从尾遍历
            targetNode = last;
            for(int i = index-1;i>index;i--){
                targetNode = targetNode.previous;
            }
        }
        return targetNode;
    }

    //检测index合法性
    private void checkIndex(int index){

        if(index > size||index < 0){
            throw new BoxIndexOutOfBoundsException("index不合法");
        }
    }

    /**
     * 删除指定元素
     * @param index
     * @return
     */
    public int remove(int index) {
        this.checkIndex(index);
        Node targetNode = this.node(index);
        this.unlink(targetNode);
        int oldValue = targetNode.item;

        return oldValue;
    }

    //
    private int unlink(Node targetNode){

        int oldValue = targetNode.item;

        return oldValue;
    }

    public int size() {
        return 0;
    }
}
