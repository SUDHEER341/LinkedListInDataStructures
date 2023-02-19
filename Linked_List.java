package com.linkedlist;

   public class Linked_List<G> {
    public Node<G> head;
    public Node<G> tail;
    public void push(G data) {
        Node<G> node = new Node<>();
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }
}

