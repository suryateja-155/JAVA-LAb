//Inheritance in java
//super class or parent class
class Parent{
  public static void parent1(){
     System.out.println("Parent class method class");
  }
}
//sub class or child class
class Child extends Parent{
  public static void child1(){
  System.out.println("Chlid class method");
}
public class Main {
    public static void main(String[] args) {
    Child obj = new Child();
    obj.child1();
    obj.parent1();
  }
}