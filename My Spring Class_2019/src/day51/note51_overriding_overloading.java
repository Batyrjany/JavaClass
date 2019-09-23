package day51;

public class note51_overriding_overloading{
/*
 * 
 * Overloading 
2 methods with same name different parameter list does return type, access modifier matter???----------------------Big NOOOOO-----------!!!!!
Does it matter it's static or instance 
----- it does not matter
It can be in same class or it can be in
Inherited classes.
Overriding
---- inheritance relationship Must Exists 
We can override super classes instance method
In sub class to provide sub class version of action
Name--->> has to be the same
Parameter List---->> has to be the same
(method signature hast to be the same)
Return type--->> same at this moment
Visibility---->>> has to be same or more
Method overriding is a concept exclusive to
Instance method 
CAN NOT OVERRIDE STATIC METHOD!!!!!!!!

 * 
 * 
 * Summarize;
Static member in inheritance
Is static method and fields are inherited?
YES! They are inherited

Public Person{
Public static String race = "Human"
}
Public Student extends Person{
Main{
Person.race
Race
Student.race
}
}

STATIC METHODS CAN NOT BE OVERRIDEN it can only be hidden by declaring sam method in sub class if you put @Override on top it will not compile

Method overriding;
You can define same method with same signature same return in sub class with different content in the method body to override the functionality inherited from super class

Rule:
It should have same method signature
Same return type --- at this moment
It can not have less visibility

WE CAN NOT OVERRIDE A PRIVATE METHOD
WE CAN NOT  OVERRIDE SOMETHING WE DON'T INHERIT
Overriding VS overloading
Super----> super classes instance fields and methods

WHEN  DO WE USE IT MOSTLY:
In overridden method in sub class
If we want to reuse the functionality of super class version
Of the method and build on top of it, we can use
Super.methodname to access super class version

METHOD OVERRIDIN IS A CONCEPT EXCLUSIVELY FOR 
----->>>>> INSTANCE METHODS IN INHERITANCE RELATINSHIP

 * 
 * 
 * */
}
 