package com.assignment10;


public class SListIterator<T> {

    SList head;
    SList tail;
    int length = 0;
    public SListIterator(SList head){
        this.head = head;
        tail = head;
    }
    public void add(T value) {

        SList newNode = new SList<>();
        newNode.data = value;
        if(head==null){
            head = newNode;
            tail = head;
            length++;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }
    public void remove(){
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else if(head.next == null){
            head = null;
            tail = null;
            length--;
        }
        else {
            SList temp = head;
            while (temp.next!=tail)
            {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            length--;
        }
    }
    public String toString(){
        SList temp = head;
        String string = "";
        if(temp!=null) {
            while (temp.next!= null) {
                string += temp.toString()+",";
                temp= temp.next;
            }
            string += temp.toString();
            return "[ "+string+" ]";
        }
        return temp.toString();
    }

}
