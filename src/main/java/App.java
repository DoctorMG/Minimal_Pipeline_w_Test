
public class App {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int sum = add(a, b);

        System.out.println("Mini-Rechner: a = " + a + " + b = " + b + " ergibt die Summe " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
