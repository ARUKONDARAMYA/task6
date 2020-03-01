package com.epam.collections;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<>();
 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(38);
        list.add(32);
        list.add(332);
        list.add(322);
        list.add(36);
        System.out.println(list);
         
        //Remove elements from index
        list.remove(2);
        System.out.println(list);
         
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.size());
}
}
