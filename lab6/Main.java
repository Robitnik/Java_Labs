public class Main {
    public static void main(String[] args) {
        int a = 15, b = 10;
        if (a <= b) {
            System.out.println("a is greater than b");
        }
        char sym1 = 'A', sym2 = 'a';
        if (sym1 == sym2) {
            System.out.println("sym1 is equal to sym2");
        }
        boolean isHasCar = false;
        if (isHasCar) {
            System.out.println("You have a car");
        } else {
            System.out.println("У вас немає машини");
        }
        if (a == 10 || isHasCar || sym1 == 'A') {
            System.out.println("a дорівнює 10");
        }
    }
}
