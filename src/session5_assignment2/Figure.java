package session5_assignment2; //package declaration
/*
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user. 
 * Another way, it shows only important things to the user and hides the internal details for example 
 * sending sms, you just type the text and send the message. You don't know the internal processing about the message delivery.
 * Abstraction lets you focus on what the object does instead of how it does it.
 * 
 * 
 * Abstract class:
 * A class that is declared as abstract is known as abstract class. 
 * It needs to be extended and its method implemented. It cannot be instantiated.
 * 
 */



public abstract class Figure {
    public abstract double area();
    public abstract double perimeter();
}
