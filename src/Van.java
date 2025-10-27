public class Van extends NewCar {

   private    boolean isHavePowerMirror;
    private double price;


    public boolean isHavePowerMirror() {
        return isHavePowerMirror;
    }

    public void setHavePowerMirror(boolean havePowerMirror) {
       this.isHavePowerMirror  = havePowerMirror;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void horn() {
        System.out.println("peep peep");
    }
}
