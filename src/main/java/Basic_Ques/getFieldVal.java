package Basic_Ques;

import java.lang.reflect.Field;

public class getFieldVal {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p1 = new Person();
        Class <?> cls = p1.getClass();

        // Access private field
        Field field = cls.getDeclaredField("name");

        // Allow access to private field
        field.setAccessible(true);

        // Get field value
        System.out.println("Old Value: " + field.get(p1));
        // Modify field value
        field.set(p1, "Tony Stark");
        // Get modified value
        System.out.println("New Value: " + field.get(p1));

    }
}
class Person{
    private String name = "John Wick";
    private int age = 40;
//    Person(){
//
//    }
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}
