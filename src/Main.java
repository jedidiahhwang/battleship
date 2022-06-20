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

        int numOfGuesses = 0;

        // Create a new SimpleStartup object from the SimpleStartup class.
        SimpleStartup dot = new SimpleStartup();

        // Create an array for the battleship, and set the game's location to that array using
        // setter methods.
        int startLocation = (int) (4 * Math.random());
        int[] locations = {startLocation, startLocation + 1, startLocation + 2, startLocation + 3};
        dot.setLocationCells(locations);

        // Using IO, get user input and continue running the game.
        boolean isAlive = true;
        String result;
        while(isAlive) {
            numOfGuesses++;
            // User IO
            result = dot.checkYourself(userGuess);
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println(numOfGuesses);
            }
        }
    }
}
