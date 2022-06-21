import java.util.ArrayList;

public class StartupBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses = 0;

    void setUpGame() {
        Startup startup1 = new Startup();
        startup1.setName("Headbook");

        Startup startup2 = new Startup();
        startup2.setName("Birder");

        Startup startup3 = new Startup();
        startup3.setName("Slowgram");

        startups.add(startup1);
        startups.add(startup2);
        startups.add(startup3);

        for(Startup startup: startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    void startPlaying() {
        while(!startups.isEmpty()) {
            String response = helper.getUserInput("Input a guess");
            checkUserGuess(response);
        }
        finishGame();
    }

    void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for(Startup startupToTest: startups) {
            result = startupToTest.checkYourself(userGuess);
            if(result.equals("hit")) {
                break;
            } else if(result.equals("kill")) {
                // Using ArrayLists, we can dynamically change the length and entries
                // in our ArrayLists using methods.
                startups.remove(startupToTest);
            }
        }

        System.out.println(result);
    }

    void finishGame() {
        System.out.println(String.format("It took you %d tries", numOfGuesses));
    }
}
