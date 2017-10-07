/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromos;

/**
 *
 * @author LuisGuillermo
 */
public class Stack<T> {
    private Node<T> top;
    private int size;
    
    Stack(){
        this.top = null;
        this.size = 0;
    }
    
    Stack(T d){
        Node<T> node = new Node<T>(d);
        this.top = node;
        this.size = 1;
    }
    
    public int getSize(){
        return size;
    }
    
    public void push(T d){
        Node<T> node = new Node<T>(d);
        node.next = top;
        top = node;
        size++;
    }
    
    public T pop(){
        T d;
        if(!isEmpty()){
            d = top.data;
            top = top.next;
            size--;
        }else{
            d = null;
        }
        return d;
    }
    
    public T getTop(){
        if(!isEmpty()){
            return top.data;
        }else{
            return null;
        }
    }
    
    public void showStack(){
        Node<T> t = top;
        while (t != null){
            System.out.println(t);
            t = t.next;
        }
    }
    
    public boolean isEmpty(){
        return size == 0;
    }

}
