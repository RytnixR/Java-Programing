

// class Pen {
//     String color;
//     String type; //ballpen , gelpen

//     public void write(){
//         System.out.println("Writing Something");
//     }

//     public void printcolor(){
//         System.out.println(this.color);
//     }
// }

class Student {
    String name ;
    int age;

    //constructor non parameterized
    Student(){
        System.out.println("non parameterized Constructor called");
    }
    //parameterized constructor
    Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("parameterized Constructor called");
    }

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
        System.out.println("copy Constructor called");
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oopsBasic{
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "dott";

        // pen1.printcolor();
        // pen2.printcolor();

        Student s1 = new Student();
        s1.age = 16;
        s1.name = "Raka shrivastav";
        
        s1.printInfo();
        
        Student s2 = new Student("Rytnix",21);
        s2.printInfo();

        Student s3 = new Student(s1);
        s3.printInfo();

    }
}