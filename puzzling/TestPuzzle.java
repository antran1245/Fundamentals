import java.util.Arrays;
import java.util.ArrayList;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        System.out.println("Ten Rolls");
        int[] tenRolls = puzzle.getTenRolls();
        System.out.println(Arrays.toString(tenRolls));

        System.out.println("Random letter");
        char letter = puzzle.getRandomLetter();
        System.out.println(letter);

        System.out.println("Password");
        String password = puzzle.generatePassword();
        System.out.println(password);

        System.out.println("Password Set");
        ArrayList<String> passwordSet = puzzle.getNewPasswordSet(3);
        System.out.println(passwordSet);

        System.out.println("Sensei Bonus");
        ArrayList<Object> notShufflePassword = new ArrayList<Object>();
        notShufflePassword.add(0);
        notShufflePassword.add(1);
        notShufflePassword.add(2);
        notShufflePassword.add(3);
        System.out.println("Current password: " + notShufflePassword);
        ArrayList<Object> shufflePassword = puzzle.shuffleArray(notShufflePassword);
        System.out.println("Shuffle password: " + shufflePassword);
    }
}