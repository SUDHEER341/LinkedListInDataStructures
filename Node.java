package com.linkedlist;


public class Node <G> {
    private G data;

    public Node(G data)
    {
        this.data = data;
    }

    private Node<G> next;

    public G getData()
    {
        return data;
    }

    public void setData(G data)
    {
        this.data = data;
    }

    public Node<G> getNext()
    {
        return next;
    }

    public void setNext(Node<G> next)
    {
        this.next = next;
    }
}
