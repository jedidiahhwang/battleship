public class Main {

    public static void main(String[] args) {
        /*
        TEST DRIVEN DEVELOPMENT
            Why do we want to start with TDD?
                - Allows for focused coding.
                - Plan for the now, not the future.
                - Easier to set guidelines for implementing your methods.
                - You'll never test otherwise.
        */

        // Create a new SimpleStartup object from the SimpleStartup class.
        SimpleStartup dot = new SimpleStartup();

        // Create an array for the battleship, and set the game's location to that array using
        // setter methods.
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        // Make a "fake" user guess.
        // Pass the guess into the checkYourself() method.
        int userGuess = 2;
        String result = dot.checkYourself(userGuess);

        // By default (and more likely), you're going to miss.
        // Set a default string to that value.
        String testResult = "failed";

        // Otherwise, if it's a hit, change the testResult string.
        if(result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
