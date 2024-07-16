package inheritance;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        System.out.println("Dog:");
        System.out.println("tommy");

        System.out.println("\nCat:");
        System.out.println("Name: " + myCat.name);
        System.out.println(myCat.getmakesound());
       // System.out.println(myDog.getBreastfeed());
        myDog.makesound();
        System.out.println(myDog.makesound());

        
    }
}
