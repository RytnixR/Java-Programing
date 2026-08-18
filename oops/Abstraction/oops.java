// abstraction using abstract keyword

// abstract class Animal {
//     abstract void walk();
//     public void eats(){
//         System.out.println("Animal eats");
//     }
// }

// class Horse extends Animal{
//     public void walk(){
//         System.out.println("Walk on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Walk on 2 legs");
//     }
// }


// abstraction using interface

interface Animal {
    static int eyes = 2;
    void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore{  // multiple inheritance
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}


public class oops{
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();
        System.out.println(horse1.eyes);
    }
}