public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public String checkYourself(int guess) {
        // Instantiate appropriate string.
        String result = "miss";

        // GET the user's guess.
        int userGuess = guess;

        // REPEAT with each cell in the int array.
        for(int cell: locationCells) {
            if(cell == guess) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        // CHECK to see if the numOfHits equals cells length for a win.
        if(numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }
}
