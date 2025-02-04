//Animals example:
class Animal{ //parent or super class
public static void barking(){
  System.out.println("Dog is barking");
  }
}
class behaviour extends Animal { //child or sub class
  public static void eating(){
    System.out.println("Dog is eating");
  }
}
public class Main {
    public static void main(String[] args) {
      behaviour obj1 = new behaviour();
      obj1.barking();
      obj1.eating();
    
  }
}