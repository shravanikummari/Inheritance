package inheritance;

    public class Car extends vehicle1
    {
        String getBreed(){
            return "Indie";
        }

        public static void main(String[] args) {
            Car C=new Car();
            System.out.println(C.displayinfo());
            C.vehiclebrand="Tata";
            C.vehiclespeed=80;
            System.out.println(C.startengine());

        }
    }


