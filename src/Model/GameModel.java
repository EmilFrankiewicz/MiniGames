package Model;

public interface GameModel {
    public int[] givenNumbers();

    public int[] draw();

    public void checkIfYouWon(int[] selectedNumbers, int[] drawnNumbers);
}
