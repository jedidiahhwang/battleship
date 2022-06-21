import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    private String name;
    private int numOfHits = 0;

    public String checkYourself(String guess) {
        // Instantiate appropriate string.
        String result = "miss";

        // GET the user's guess.
        String userGuess = guess;

        // Using ArrayList API, remove a cell if it's been hit to avoid the bug.
        int index = locationCells.indexOf(userGuess);

        if(index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }

    public void setName(String n) {
        name = n;
    }
}
