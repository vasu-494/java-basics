package telusko;

abstract class Abst // is a class about which I don't have all the ideas to define  ---- may/not have abstract methods
{
    public abstract void show(); // is a method for which I don't know what to implement ---- must be declared in an abstract class only

    
} 

class Concrete extends Abst // concerete class:  a class that extends an abstract class, and defines the implementation of its abstract methods
{
    public void show()
    {
        System.out.println("Implementing abst show() from 'Concrete' class");
    }
}

public class AbstractClass 
{
    public static void main(String[] args) 
    {
        // Abst obj = new Abst(); --- abstract class cannot have an onject, but can have a reference variable
        Abst obj = new Concrete(); // for an abstract class reference, we can create a an object of concrete child class

        obj.show();
    }
}
