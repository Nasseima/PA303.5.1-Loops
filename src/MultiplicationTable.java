public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                int sum = i * j;
                System.out.println( i + " * " +  j + " = " + sum );

            }

        }
    }
}