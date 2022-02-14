package LaunchGame;

import Games.MiniLotek;

public class Run {

    public static void main(String[] args) {
        MiniLotek runMiniLotek = new MiniLotek();
        runMiniLotek.checkIfYouWon(runMiniLotek.givenNumbers(), runMiniLotek.draw());
    }
}
