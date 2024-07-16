package inheritance;

       public abstract class Animal {
           String animalName;
           int animalAge;

           public String makesound() {
               return "Animal is making sound";
           }

           Animal() {
               System.out.println("animal is barking");
           }

           void eats() {
               System.out.println("Animal is eating");

           }
       }
