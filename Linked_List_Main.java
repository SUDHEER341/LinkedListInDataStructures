package com.linkedlist;

public class Linked_List_Main {
    public static void main(String[] args) {
        Linked_List<Integer> myList1 = new Linked_List();
        myList1.push(70);
        myList1.push(30);
        myList1.push(56);
        myList1.displayElement();

        Linked_List<Integer> myList2 = new Linked_List<>();
        myList2.addElement(56);
        myList2.addElement(30);
        myList2.addElement(70);
        myList2.displayElement();

        Linked_List<Integer> myList3 = new Linked_List<>();
        myList3.addElement(56);
        myList3.addElement(70);
        myList3.insert(56, 30);
        myList3.displayElement();
        myList3.pop();
        myList3.displayElement();
    }
}





