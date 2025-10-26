 public class Test {

     public static void main(String[] args) {
         Car car=new Car();

         //dynamic dispatch

         Vehicle vehicle=new Car();
         vehicle.startEngine();
     }
}
