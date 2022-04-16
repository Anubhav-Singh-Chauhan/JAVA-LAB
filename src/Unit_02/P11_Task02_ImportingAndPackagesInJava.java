package Unit_02;
//Inside this Package we can create many classes.
/*
->A java package is a group of similar types of classes, interfaces and sub-packages.
->Package in java can be categorized in two form:
  1. Built-in Package{lang,awt,javax,net,swing,net,util,sql}
  2. User-Defined Package

->Package also helps to avoid class name collision
->Package also helps us to maintain access protection in Java
->Packages are named in reverse order of domain names
  unit01.java_project.com -> "com.java_project.unit01"

->import java.util.vector; //import the vector class from util package
->import java.util.*; //import all the classes from util package

Static Import:
->Static import is a feature introduced in Java programming language(ver. 5 and above)
that allows members (fields and methods) defined in a class as public static, to be used
in Java code without specifying the class in which the field is defined
 */

import static java.lang.System.*;
import static java.lang.Math.*;
import Unit_01.SampleClass;

public class P11_Task02_ImportingAndPackagesInJava {
    public static void main(String[] args) {
        out.println("Welcome to Packages");
        out.println(sqrt(4));
        out.println(pow(2,5));
        out.println(abs(5.5));

        SampleClass obj = new SampleClass();
//        out.println(obj.a);
        System.out.println(obj.DisplayFunc(10));
    }
}







