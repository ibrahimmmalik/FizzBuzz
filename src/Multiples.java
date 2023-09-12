public class Multiples {
    public static void main(String[] args) {

        //Create running tallies of multiples of 3 and 5
        int threes = 0;
        int fives = 0;

        //Run through every number below 1000
        for (int i = 1; i < 1000; i++){

            //Check to see if numbers are multiples of 3 or 5
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            //Check to see if number is multiple of 3 or 5
            if (divBy3){
                threes++;
            }
            if (divBy5){
                fives++;
            }
        }

        //Print how many mutliples there are
        System.out.println("There are " + threes + " multiples of 3 and " + fives + " multiples of 5 below 1000.");
    }
}
