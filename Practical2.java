public class Practical2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //arithmetic operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        //bitwise operations
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT of a: " + (~a));
        System.out.println("Bitwise NOT of b: " + (~b));
        //relational operations
        System.out.println("a is equal to b: " + (a == b));
        System.out.println("a is not equal to b: " + (a != b));
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is less than b: " + (a < b));
        System.out.println("a is greater than or equal to b: " + (a >= b));
        System.out.println("a is less than or equal to b: " + (a <= b));
        //logical operations
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT of x: " + (!x));
        System.out.println("Logical NOT of y: " + (!y));
        //assignment operations
        int c = 30; 
        System.out.println("Assignment: " + c);
        System.out.println("Addition Assignment: " + (c += 10));
        System.out.println("Subtraction Assignment: " + (c -= 5));
        System.out.println("Multiplication Assignment: " + (c *= 2));
        System.out.println("Division Assignment: " + (c /= 2));
          System.out.println("Modulus Assignment: " + (c % 3));        
        //unary operations
        int d = 5;
        System.out.println("Unary Plus: " + (+d));
        System.out.println("Unary Minus: " + (-d));
        System.out.println("Increment: " + (++d));
        System.out.println("Decrement: " + (--d));
        //ternary operations
        int e = 15;
        System.out.println("Ternary: " + (e > 10 ? "e is greater than 10" : "e is not greater than 10"));
        //instanceof operator
        String str = "Hello";
        System.out.println("Instanceof: " + (str instanceof String));
        //type casting
        double f = 10.5;
        int g = (int) f;
        System.out.println("Type Casting: " + g);
        //operator precedence
        int h = 5 + 3 * 2;  
        System.out.println("Operator Precedence: " + h);
        //operator associativity
        int i = 10 - 5 - 2;
        System.out.println("Operator Associativity: " + i);
        
    }
}