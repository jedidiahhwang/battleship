public class main {

    public static void main(String[] args) {
        /*
        TEST DRIVEN DEVELOPMENT
            Why do we want to start with TDD?
                - Allows for focused coding.
                - Plan for the now, not the future.
                - Easier to set guidelines for implementing your methods.
                - You'll never test otherwise.
        */

        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }
}
