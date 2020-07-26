package com.application;

import java.util.List;

import com.collections.CustomCollection;

public class app{
	 public static void main(String[] args) {
	        try {
	            String s[] = {
	                    "This ",
	                    "is",
	                    "custom",
	                    "Collection",
	                    "Implementation"
	            };
	            Object o;
	            int i = 0;
	            List<String> lst =  CustomCollection.asList(s);
	            System.out.println("The list is: " + lst);
	            o = lst.get(1);
	            System.out.println("The retrieved element is: " + o);
	            String s1 = "Collection";
	            o = lst.set(2, s1);
	            System.out
	                    .println("The set element in place of Implementation is: "
	                            +
	                            s1);
	            System.out.println("Now the new list is: " + lst);
	            i = lst.size();
	            System.out.println("The size of the array list is: " + i);
	        } catch (Exception e) {
	        }
	    }
}