public class PredictFutureTuition {
    public static void main(String[] args) {

        int year, tuition, finalTuition;
        year = 0;
        tuition = 10000;
        finalTuition = tuition * 2;

        while (tuition < finalTuition) {
            tuition *= 1.07;
            year++;

            System.out.println("The year is " + year + " and the tuition is " + tuition);
        }
    }

}
