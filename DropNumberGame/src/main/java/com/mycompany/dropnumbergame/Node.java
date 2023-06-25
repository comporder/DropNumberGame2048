package com.mycompany.dropnumbergame;

/**
 *
 * @author Zeynep Nursena
 */
public class Node<E extends Number> {

    private E value;                 
    private int column;             
    
    private Node<E> right;        
    private Node<E> down;          
    private Node<E> up;             

    public Node(E e, int column) {  
        value = e;              
        this.column = column;       
    }

    public int getCol() {           
        return column;
    }

    public void setCol(int col) {   
        this.column = col;
    }

    public E getValue() {            
        return value;
    }

    public void setValue(E value) {  
        this.value = value;
    }

    public Node<E> getDown() { 
        return down;
    }

    private void setDown(Node<E> down) { 
        this.down = down;
    }

    public Node<E> getRight() {        
        return right;
    }

    private void setRight(Node<E> right) {  
        this.right = right;
    }

    public Node<E> getUp() {       
        return up;
    }

    public void setUp(Node<E> up) {          

        this.up = up;
        up.down = this;
        Node temp = up;

        while (temp.down != null && (int) (Integer) temp.value == (int) (Integer) temp.down.value) {
            temp.down.value = temp.down.value.intValue() * 2;
            temp = temp.down;
            temp.up = null;
        }

    }

    public void SameColumnAddNewNode(Node node) {
        Node temp = this;

        while (temp.up != null) {
            temp = temp.up;
        }
        temp.setUp(node);
    }

    public void AddNode(Node node) {
        int col = node.getCol();

        if (col == this.getCol()) {
            this.SameColumnAddNewNode(node);
        } else if (col > this.getCol()) {
            this.RightColumnAddNewNode(node);
        }
    }

    public void RightColumnAddNewNode(Node node) {

        if (this.right == null) {
            setRight(node);
        } else if (this.right.column == node.column) {
            this.right.SameColumnAddNewNode(node);
        } else if (this.right.column > node.column) {
            node.setRight(this.right);
            this.setRight(node);
        } else {
            this.right.RightColumnAddNewNode(node);
        }
    }
}
