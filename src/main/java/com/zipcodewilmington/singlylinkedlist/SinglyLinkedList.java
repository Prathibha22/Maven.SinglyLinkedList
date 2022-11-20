package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node _head;
    public static class Node{
        private Node next;
        private Object _data;
        public Node(Object data){
            this._data=data;
             next=null;
        }
    }
    public SinglyLinkedList appendNode(SinglyLinkedList list,Object data){
        Node newNode=new Node(data);
        if(list._head==null) list._head=new Node(data);
        else{
            Node lastNode=_head;
            while (lastNode.next!=null) lastNode=lastNode.next;
            lastNode.next=newNode;
        }
      return list;
    }
    public SinglyLinkedList removeNode(SinglyLinkedList list,Object data){
        Node currentNode=_head;
        Node previousNode=null;
        if(currentNode!=null && currentNode._data.equals(data)){
            list._head=currentNode.next;
            return list;
        }
        while (currentNode!=null && !currentNode._data.equals(data)){
           previousNode=currentNode;
           currentNode=currentNode.next;
        }
        if(currentNode!=null && currentNode._data.equals(data))
            previousNode.next=currentNode.next;

        return list;
    }
    public boolean containsNode(SinglyLinkedList list,Object data){
        Node currentNode=_head;
        while(currentNode!=null){
            if(currentNode._data.equals(data)) return true;
            currentNode=currentNode.next;
        }
        return false;
    }
    public int sizeList(SinglyLinkedList list){
        Node currentNode=_head;
        int count=0;
        while (currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }
        return count;
    }
    public int findNodeIndex(SinglyLinkedList list,Object data){
        int index=-1;
        Node currentNode=_head;
        while(currentNode!=null){
            if(currentNode._data.equals(data)){
                index++;
                return index;
            }
            index++;
            currentNode=currentNode.next;
        }
        return -1;
    }
    public Object getNode(SinglyLinkedList lst,int index){
        Node currentNode=_head;
        int counter=0;
        while (currentNode!=null){
            if(counter==index) return currentNode._data;
            currentNode=currentNode.next;
            counter++;
        }
        return null;
    }
    public SinglyLinkedList copyList(SinglyLinkedList lstSource){
        SinglyLinkedList lstDestination=new SinglyLinkedList();
        Node temp=lstSource._head;
        while (temp.next!=null){
        lstDestination.appendNode(lstDestination,temp._data);
        temp=temp.next;
        }
        return lstDestination;
    }
    public SinglyLinkedList sortList(SinglyLinkedList lst){
        int size= lst.sizeList(lst);
        Node current=lst._head;
        Node index=null;
        while (current!=null){
            index=current.next;
            while (index!=null) {
                if ((Integer) current._data > (Integer) index._data) {
                    Object temp = current._data;
                    current._data = index._data;
                    index._data = temp;
                }
                index = index.next;
            }
            current=current.next;
        }

        return lst;
    }

        public String print(SinglyLinkedList list){
        StringBuilder sb=new StringBuilder();
        Node currentNode=_head;
        while(currentNode!=null){
            sb.append(currentNode._data+" ");
            currentNode=currentNode.next;
        }
       return sb.toString();
    }
}
