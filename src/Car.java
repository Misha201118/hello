
public class Car{

  int vmax;
  int timestamp;
  String name;

  public void print(){
    System.out.printf("max velocity: %d\ntimestamp: %d\nname: %s\n", this.vmax, this.timestamp, this.name);
  }

}