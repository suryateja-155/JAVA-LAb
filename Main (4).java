abstract class Vehicles{
  String Car_name = "Ferarri";
  String Car_price = "15cr";
  String Car_location = "USA";
  String Car_owner_details = "Surya"; 
  public abstract void car_details();
}
class Car extends Vehicles{
  public void car_details(){
  System.out.println("Car name :"+Car_name);
  }
}
public class Main {
    public static void main(String[] args) {
      Car obj = new Car();
      obj.car_details();
  }
}