package com.sda.oop;

import com.sda.example.Newest;

public class OOPintro {

    // A class is a blueprint for describing an object
    // Car -> Attributes: color, model, numOfTires, numOfSeats. Behaviour: startEngine, stopEngine, turnRight, turnLeft.
    // Attributes are fields.
    // Another name for fields is global variable.

    //Encapsulation
    // concept of hiding data and methods from the outside world
    // Allows us to control what data is given out or received

    // fields -> used to define attributes in a Class
    public static void main(String[] args) {
        //            Car benz = new Car();
        //            benz.startEngine(false);
        //            benz.stopEngine();
        //            System.out.println();
        //
        //            //different instance of the same class
        //            Car bmw = new Car();
        //            bmw.startEngine(true);
        //            bmw.stopEngine();
        //        }
        //    }


        // Task: Animal / Bird
        Bird bird = new Bird("grey", true);
        bird.doesItFly();
        bird.sing();
        bird.setType("sparrow");
        System.out.println("Bird is: " + bird.getType());

        Animal animal = new Animal();
        animal.walk();
        animal.sounds();

        // Task: Company, Employee
        Employee e1 = new Employee("Employee1", 19, "Alpha", "X-01");
        Employee e2 = new Employee("Employee2", 39, "Alpha", "X-02");
        Employee e3 = new Employee("Employee3", 42, "Alpha", "X-03");
        Employee e4 = new Employee("Employee4", 27, "Alpha", "X-04");
        Employee e5 = new Employee("Employee5", 57, "Alpha", "X-05");
        Employee[] employee = {
                e1,
                e2,
                e3,
                e4,
                e5};
        Company company = new Company("Alpha", employee);
        System.out.println("The average age of company Alpha workers is " + company.calculateAverageEmployeeAge() + " years");
        //company.check();

    }



       /* Person george = new Person("George", 20);
        Person victoria = new Person("Victoria", 29);
        System.out.println(victoria.getAge());
        victoria.changeAge();
        System.out.println(victoria.getAge());*/

        //        Person george = new Person();
        //        george.setName("George");
        //
        //        Person victoria = new Person(); // example of a constructor
        //        victoria.setName("Victoria");
        //
        //        System.out.println(george.getName());
        //        System.out.println(victoria.getName());

        //        Calculator_updated calc = new Calculator_updated();
        //        System.out.println(Calculator_updated.add(2, 4));
        //        System.out.println(Calculator_updated.divide(3, 8));

        // Inheritance allows to share behaviour between classes
        // A class that inherits from another class is called the child or sub class
        // inherited from: parent class

/*        Ferrari ferrari = new Ferrari(4, "red", "Turbo 3000");

        public void setFerrari (Ferrari ferrari){
            ferrari.openWindowDoors();
        }

        public Ferrari getFerrari () {
            ferrari.startEngine(true);
        }*/

        // Polymorphism - ability of an object to return different responses
        // to the same method call
    }




