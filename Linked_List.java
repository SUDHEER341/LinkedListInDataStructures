package com.linkedlist;


       public class Linked_List<G> {
           public Node<G> head;
           public Node<G> tail;

           public void push(G data) {
               Node<G> node = new Node<>(data);
               if (head == null) {
                   head = node;
                   tail = node;
               } else {
                   node.setNext(head);
                   head = node;
               }
           }
           public boolean insert(G searchData, G insertData) {
               Node<G> newNode = new Node(insertData);
               Node<G> searchedNode = search(searchData);
               if (searchedNode == null)
                   return false;
               else {
                   newNode.setNext(searchedNode.getNext());
                   searchedNode.setNext(newNode);
                   return true;
               }

           }

           public void displayElement(){
               if (head==null){
                   System.out.println("List is Empty");
               }else {
                   Node<G> temp = head;
                   while (temp != null) {
                       System.out.print(temp.getData()+" ");
                       temp = (Node<G>) temp.getNext();
                   }
                   System.out.println();
               }
           }
           public void addElement(G data){
               Node<G> newnode=new Node<>(data);
               if (head==null) {
                   head = newnode;
                   tail = newnode;
               }else {
                   tail.setNext(newnode);
                   tail=newnode;
               }
           }
           public G pop(){
               if (head==null) {
                   return null;
               }else {
                   G data=head.getData();
                   head=(Node<G>) head.getNext();
                   return data;
               }
           }

           public void popFirstElement() {
               if (head == null) {
                   System.out.println("Linked List is Empty");
               } else {
                   G data = head.getData();
                   head = (Node<G>) head.getNext();
                   System.out.println(data);
               }
           }
           public void popLastElement() {
               if (head == null) {
                   System.out.println("Linked List is Empty");
               } else {
                   Node<G> temp = head;
                   while (temp.getNext() != tail) {
                       temp = (Node<G>) temp.getNext();
                   }
                   G data = tail.getData();
                   temp.setNext(null);
                   tail = temp;
                   System.out.println(data);
               }
           }
           public Node<G> search(G searchData) {
               Node<G> temp = head;
               while (temp != null) {
                   if (temp.getData().equals(searchData))
                       return temp;
                   temp = (Node<G>) temp.getNext();
               }
               return null;
           }
           public boolean isEmpty()
           {
               return head==null ? true:false;
           }

           @Override
           public String toString()
           {
               return "LinkedList{" + "head=" + head + '}';
           }
       }




