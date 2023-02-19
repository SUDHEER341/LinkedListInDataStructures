package com.linkedlist;


import java.util.LinkedList;

public class Linked_List_Main {
        public static void main(String[] args)

        {
            LinkedList<Integer> myList=new LinkedList();
            myList.add(70);
            System.out.println("before adding 30 and 56  : " + myList);
            myList.addFirst(56);
            myList.add(1,30);

            System.out.println("After adding 30 and 56  : " + myList);



        }
    }


