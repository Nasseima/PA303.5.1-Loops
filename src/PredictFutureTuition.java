public class PredictFutureTuition {
    public static void main (String [] args) {

        int tuition = 10000;

        for (int i = 0; i > 0; i++) {

            for (int j = 0; j <= i; j++) {
                tuition *= 1.07;

                System.out.println("The year is " + i + "The tuition is " + j);
            }
        }
    }
}
