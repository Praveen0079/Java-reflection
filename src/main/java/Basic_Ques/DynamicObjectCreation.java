package Basic_Ques;


import java.lang.reflect.Constructor;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", age: " +age);
    }
}

public class DynamicObjectCreation  {
    public static void main(String[] args) throws Exception {
       Class<?> cs=Class.forName("Basic_Ques.Student");
        Constructor<?> ct=cs.getConstructor(String.class,int.class);
        Object student1=ct.newInstance("piyush",18);
        //cs.getMethod("displayInfo").invoke(student1);
Student student=(Student) student1;
student.displayInfo();

    }
}
