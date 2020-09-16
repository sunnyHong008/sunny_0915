package com.sunny.list;

/**
 * 双向链表实体类
 */
public class Node {

    public Node previous;//前一个节点
    public int item;//所存数据
    public Node next;//下一个节点

    public Node(Node previous,int item,Node next){

        this.previous = previous;
        this.item = item;
        this.next = next;

    }


}
