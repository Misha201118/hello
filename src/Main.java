
public class Main{

  public static void main(String[] args){
    Car car1 = new Car();
    Car car2 = new Car();

    car1.vmax=100;
    car1.name="Dan";
    car1.timestamp=10000;

    car2.vmax=60;
    car2.name="Nelson";
    car2.timestamp=102300;

    car1.print();
    System.out.println("================");
    car2.print();

  }


}