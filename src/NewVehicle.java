
public class NewVehicle {
  private   String brand;
   private String model;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void horn()  {
        System.out.println(" horn sound");
    }
}
