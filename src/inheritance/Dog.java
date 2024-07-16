package inheritance;
import inheritance.*;
/*
      public class Dog extends Animal  {
          String getBarks(){
              return "bow bow";
          }
        Dog(){
            System.out.println("dog is barking bow");
        }
        void display(){
              super.makesound();
        }
        void eats(){
              super.eats();
              System.out.println("dog is eating");
        }
        void run(){
             super.eats();
        }

          public static void main(String[] args) {
              Dog dog=new Dog();
              dog.makesound();
              dog.run();
              dog.eats();
          }
      }
 String name;
*/











//@Override
//                public String makesound() {
//                    return "Animal is making sound";
//                }
//                }}
//
//
//
//
//                    String getBarks() {
//                        return "bow bow";
//                    }




//                    public static void main(String[] args) {
//                        Dog d=new Dog();
//                        System.out.println(d.makesound());
//                        d.animalAge=9;
//                        d.animalName="tommy";
//                        System.out.println(d.getBarks());
//                            Mammal M=new Mammal();
//                            System.out.println(M.getBreastfeed()); //Dog property
//                            M.getBreastfeed();
//                        }
//                    }

                public class Dog extends Mammal {
                    String name = "tommy";

                    String getBarks() {
                        return "bow bow";
                    }

                    Dog() {
                        System.out.println("dog is barking bow");
                    }

                    void food() {
                        System.out.println("dog is givig food");
                    }

                    void eats() {
                        super.food();
                    }

                    public static void main(String[] args) {
                        Dog dog = new Dog();
                        dog.eats();
                    }
                }











