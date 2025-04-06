package Basic_Ques;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class getClassInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the class name : ");
        String className = sc.next();

        Class cls = Class.forName("Basic_Ques."+className);

        System.out.println("\nClass: " + cls.getName());

        System.out.println("\nFields:");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f);
        }
        System.out.println(Arrays.toString(cls.getDeclaredFields()));

        System.out.println("\nConstructors:");
        for (Constructor c : cls.getDeclaredConstructors()) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(cls.getDeclaredConstructors()));

        System.out.println("\nMethods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m);
        }

        sc.close();
    }
}

class Animal {
    public void display() {
        System.out.println("I am Animal");
    }
}

class Dog extends Animal {
    String name = "Tommy";
    int age = 2;

//    public Dog() {
//    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void display() {
        super.display();
    }

    void makeSound() {
        System.out.println("Bark bark");
    }
}
