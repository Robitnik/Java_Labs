package lab3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.err.println("Variables and types in Java");

        int age;
        age = 56;
        System.out.println("Age: " + age);
        age = 5;
        System.out.println("Age: " + age);
        int age2 = -25; // 4 bytes, range: -2,147,483,648 to 2,147,483,647
        System.out.println("Age2: " + age2);
        byte num1 = 127; // 1 byte, range: -128 to 127
        System.out.println("Num1: " + num1);
        short num2 = 32767; // 2 bytes, range: -32768 to 32767
        System.out.println("Num2: " + num2);
        long num3 = 9223372036854775807L; // 8 bytes range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Num3: " + num3);
        float num4 = 3.14f; // 4 bytes, single precision
        System.out.println("Num4: " + num4);
        double num5 = 3.141592653589793; // 8 bytes, double precision
        System.out.println("Num5: " + num5);
        char letter = 'A'; // 2 bytes, Unicode character
        System.out.println("Letter: " + letter);
        String name = "John Doe"; // Reference type, not a primitive type
        System.out.println("Name: " + name);
        boolean isTrue = true; // 1 bit, true or false
        System.out.println("Is True: " + isTrue);
        List<String> names = List.of("Alice", "Bob", "Charlie");
        System.out.println("Name: " + names.get(0));
    }
}
