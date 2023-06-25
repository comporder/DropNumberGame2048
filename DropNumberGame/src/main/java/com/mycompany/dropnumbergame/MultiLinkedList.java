package com.mycompany.dropnumbergame;

/**
 *
 * @author Zeynep Nursena
 */
public class MultiLinkedList<E extends Node, N extends Number> {

    int size;
    E start;

   

    public void add( int value, int column) {

        Node newNode = new Node(value, column);

        if (start != null) {
            start.AddNode(newNode);
        } else {
            start = (E) newNode;
        }
    }
}
