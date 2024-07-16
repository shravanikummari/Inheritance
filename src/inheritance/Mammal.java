package inheritance;

public  class Mammal extends Animal {

    String getBreastfeed(){
        return "Animal is feeding to kids";
    }
    Mammal(){
        System.out.println("mammal animal");
    }
    void food(){
        System.out.println("mammal is giving food to kids");
    }

}

