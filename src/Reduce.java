public class Reduce {
    public static void main(String[] args) {

        //Number n
        int i = 100;

        //number of steps
        int steps = 0;

        //While loop to make sure current number is above 0
        while (i > 0){

            steps++;

            //Calculations
            boolean evenOdd = i % 2 == 0;

            //If statement to check even or odd
            if (evenOdd){
                i = i / 2;
            }
            else {
                i -= 1;
            }
        }

        System.out.println("With the current algorithm, it takes " + steps + " steps to reach 0.");
    }
}
