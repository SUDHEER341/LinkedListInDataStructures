package com.linkedlist;
import java.util.LinkedList;
public class Linked_List_Main {
        public static void main(String[] args)

        {
            LinkedList<Integer> myList1=new LinkedList();
            myList1.add(56);
            System.out.println("before adding 30 and 70 : "+myList1);
            LinkedList<Integer> myList2=new LinkedList();
            myList2.add(30);
            myList2.add(70);

            myList1.addAll(myList2);
            System.out.println("after appending 30 and 70 to 56 : "+ myList1);



        }
    }


