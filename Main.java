
public class Main {
  
   static void method(){
    System.out.println("This is method 1");
  }
  void method2(){
    System.out.println("This is method 2");
  }
  //return Type
  int sub(int a ,int b){
    return a-b;
  }
  
    public static void main(String[] args) {
    method();
    Main obj = new Main();
    obj.method2();
    System.out.println("Subtraction is :"+obj.sub(10,20));
  }
}