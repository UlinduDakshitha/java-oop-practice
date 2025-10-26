
import java.util.Scanner;
public class AllVehicle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

       NewVehicle[] vehicles=new NewVehicle[10];

            for (int i = 0; i < vehicles.length; i++) {
                System.out.print("Enter vehicle type (Car/Van/Bus): ");
                String type = sc.next();

                switch (type) {
                    case "car":
                        vehicles[i] = createCar();
                        break;
                    case "van":
                        vehicles[i] = createVan();
                        break;
                    case "bus":
                        vehicles[i] = createBus();
                        break;
                    default:
                        System.out.println("no vehicle");
                }
            }
            for(NewVehicle vh: vehicles){
                vh.horn();
            }

        }

        public static NewCar createCar() {
            NewCar car = new NewCar();
            System.out.print("Enter Brand: ");
            car.setBrand(sc.next());
            System.out.print("Enter Model: ");
            car.setModel(sc.next());
            System.out.print("Enter Color: ");
            car.setColor(sc.next());
            System.out.print("Enter No. of Gears: ");
            car.setNoOfGears(sc.nextInt());
            return car;
        }
        public static Van createVan() {
            Van van = new Van();
            System.out.print("Enter Brand: ");
            van.setBrand(sc.next());
            System.out.print("Enter Model: ");
            van.setModel(sc.next());
            System.out.print("Has Power Mirror): ");
            van.setHavePowerMirror(sc.nextBoolean());
            System.out.print("Enter Price: ");
            van.setPrice(sc.nextDouble());
            return van;
        }
            public static Bus createBus() {
                Bus bus = new Bus();
                System.out.print("Enter Brand: ");
                bus.setBrand(sc.next());
                System.out.print("Enter Model: ");
                bus.setModel(sc.next());
                System.out.print("Has Sensor): ");
                bus.setSensor(sc.nextBoolean());
                System.out.print("Enter No. of Seats: ");
                bus.setNoOfSeats(sc.nextInt());
                return bus;
            }
    }

