package Basic_Ques;

import java.lang.reflect.Method;
class Calculator {
    private int add(int a, int b) {
        return a + b;
    }
}
public class invokeMethod {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        Class<?> cls = calc.getClass();


        // Access private method
        Method method = cls.getDeclaredMethod("add", int.class, int.class);
        method.setAccessible(true); // Allow access to private method


        // Invoke method dynamically
        int result = (int) method.invoke(calc, 5, 10);
        //or
        //Object result = method.invoke(calc, 5, 10);

        System.out.println("Addition Result: " + result);
    }
}
