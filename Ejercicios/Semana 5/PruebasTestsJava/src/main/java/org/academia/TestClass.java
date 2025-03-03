package org.academia;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class TestClass{
    public static void main(String args [])
    {
        String s = "MINIMUM";
        System.out.println(s.substring(4, 7));
        System.out.println(s.substring(5));
        System.out.println(s.substring(s.indexOf('I', 3)));
        
    } }