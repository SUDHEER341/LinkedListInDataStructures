package com.linkedlist;


    public class Node <G>{
        private G data;
        private Node <G> next;

        public void setData(G data)
        {
            this.data = data;
        }

        public G getData()
        {
            return data;
        }

        public void setNext(Node<G> next)
        {
            this.next = next;
        }

        public Node<G> getNext()
        {
            return next;
        }


    }

