package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
  public void testAppendNode(){
        //Given
        Object element="test";
        SinglyLinkedList objList=new SinglyLinkedList();
        //When
        objList.appendNode(objList,element);
        String actual=objList.print(objList);
        //Then
        Assert.assertEquals("test ",actual);
    }
    @Test
    public void testRemoveNode(){
      //Given
      Object element="test";
      SinglyLinkedList objList=new SinglyLinkedList();
      objList.appendNode(objList,element);
      //When
      objList.removeNode(objList,element);
      String actual=objList.print(objList);
      //Then
      Assert.assertEquals("",actual);

    }
  @Test
  public void testRemoveNode2(){
    //Given
    Object element="test";
    Object element2="test2";
    Object element3="test3";
    Object element4="test4";
    SinglyLinkedList objList=new SinglyLinkedList();
    objList.appendNode(objList,element);
    objList.appendNode(objList,element2);
    objList.appendNode(objList,element3);
    objList.appendNode(objList,element4);
    //When
    objList.removeNode(objList,element3);
    //Then
    String actual=objList.print(objList);
    //Then
    Assert.assertEquals("test test2 test4 ",actual);
  }
  @Test
  public void testRemoveNode3(){
    //Given
    Object element="test";
    Object element2="test2";
    Object element3="test3";
    Object element4="test4";
    SinglyLinkedList objList=new SinglyLinkedList();
    objList.appendNode(objList,element);
    objList.appendNode(objList,element2);
    objList.appendNode(objList,element3);
    objList.appendNode(objList,element4);
    //When
    objList.removeNode(objList,element4);
    //Then
    String actual=objList.print(objList);
    //Then
    Assert.assertEquals("test test2 test3 ",actual);
  }
    @Test
    public void testContains(){
        //Given
      Object element="test";
      Object element2="test2";
      Object element3="test3";
      Object element4="test4";
      SinglyLinkedList objList=new SinglyLinkedList();
      objList.appendNode(objList,element);
      objList.appendNode(objList,element2);
      objList.appendNode(objList,element3);
      objList.appendNode(objList,element4);
      boolean expected=true;
        //When
      boolean actual=objList.containsNode(objList,"test3");
        //Then
      Assert.assertEquals(expected,actual);
    }
  @Test
  public void testContains2(){
    //Given
    Object element="test";
    Object element2="test2";
    SinglyLinkedList objList=new SinglyLinkedList();
    objList.appendNode(objList,element);
    objList.appendNode(objList,element2);
    boolean expected=false;
    //When
    boolean actual=objList.containsNode(objList,"test3");
    //Then
    Assert.assertEquals(expected,actual);
  }
    @Test
    public void testFindNodeIndex(){
      //Given
      Object element="test";
      Object element2="test2";
      Object element3="test3";
      Object element4="test4";
      SinglyLinkedList objList=new SinglyLinkedList();
      objList.appendNode(objList,element);
      objList.appendNode(objList,element2);
      objList.appendNode(objList,element3);
      objList.appendNode(objList,element4);
      int expected=1;
        //When
      int actual=objList.findNodeIndex(objList,"test2");
        //Then
      Assert.assertEquals(expected,actual);
    }
  @Test
  public void testFindNodeIndex2(){
    //Given
    Object element="test";
    Object element2="test2";
    SinglyLinkedList objList=new SinglyLinkedList();
    objList.appendNode(objList,element);
    objList.appendNode(objList,element2);
    int expected=-1;
    //When
    int actual=objList.findNodeIndex(objList,"test3");
    //Then
    Assert.assertEquals(expected,actual);
  }
    @Test
    public void testSize(){
      //Given
      Object element="test";
      Object element2="test2";
      Object element3="test3";
      Object element4="test4";
      SinglyLinkedList objList=new SinglyLinkedList();
      objList.appendNode(objList,element);
      objList.appendNode(objList,element2);
      objList.appendNode(objList,element3);
      objList.appendNode(objList,element4);
      int expected=4;
        //When
      int actual= objList.sizeList(objList);
        //Then
      Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetNode(){
      //Given
      Object element="test";
      Object element2="test2";
      Object element3="test3";
      Object element4="test4";
      SinglyLinkedList objList=new SinglyLinkedList();
      objList.appendNode(objList,element);
      objList.appendNode(objList,element2);
      objList.appendNode(objList,element3);
      objList.appendNode(objList,element4);
        //When
      Object actual=objList.getNode(objList,2);
        //Then
      Assert.assertEquals(actual,"test3");
    }
    @Test
    public void testCopy(){
      //Given
      Object element="test";
      Object element2="test2";
      Object element3="test3";
      Object element4="test4";
      SinglyLinkedList objList=new SinglyLinkedList();
      objList.appendNode(objList,element);
      objList.appendNode(objList,element2);
      objList.appendNode(objList,element3);
      objList.appendNode(objList,element4);
      SinglyLinkedList objDestinationList=new SinglyLinkedList();
        //When
      objList.copyList(objList);
      String actual=objList.print(objDestinationList);
      //Then
      Assert.assertEquals("test test2 test3 test4 ",actual);

    }
    @Test
    public void testSort(){
      //Given
      Object element=1;
      Object element2=6;
      Object element3=2;
      Object element4=5;
      SinglyLinkedList objList=new SinglyLinkedList();
      objList.appendNode(objList,element);
      objList.appendNode(objList,element2);
      objList.appendNode(objList,element3);
      objList.appendNode(objList,element4);
      //When
       objList.sortList(objList);
      String actual=objList.print(objList);
        //Then
      Assert.assertEquals("1 2 5 6 ",actual);

    }

}
