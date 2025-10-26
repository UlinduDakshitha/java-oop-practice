
    public class NewCar extends NewVehicle {
        private String color;
        private int noOfGears;

        public void setColor(String color) {
            this.color = color;
        }

        public void setNoOfGears(int noOfGears) {
            this.noOfGears = noOfGears;
        }

        public String getColor() {
            return color;
        }

        public int getNoOfGears() {
            return noOfGears;
        }


        public void horn() {
            System.out.println("beep beep");
        }
    }


