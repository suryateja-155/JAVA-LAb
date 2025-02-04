class Parent{ //super or class Parent
Parent(){
    System.out.println("Parent class Constructor");
  }
  void parent1(){ //parent class method
   System.out.println("Parent class method");
    
  }
}
class Child extends Parent{//sub or child class
  Child(){//child class constructor
  super();
    System.out.println("Child class Constructor");
  }
   void child1(){ //child class method
  super.parent1();
   System.out.println("Child class method");
   }
}
public class Main{
  //int a = 100;
    public static void main(String[] args) {
     //Main obj = new Main();//method constructor
      //System.out.println("a value :"+a);
    Child obj = new Child();
    obj.Parent1();
    obj.child1();
  }
}