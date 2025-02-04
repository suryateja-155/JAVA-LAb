class Parent{ //super class
  public static void parent1(){
    System.out.println("Parent Method");

}
class Child extends Parent{ //sub class
  public static void child1(){
    System.out.println("Child Method");

public class Main {
    public static void main(String[] args) {
  Child obj = new Child();
  obj.parent1();
  obj.child1();
  }
}