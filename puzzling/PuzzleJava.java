import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();

    public int[] getTenRolls() {
        int[] tenRolls = new int[10];
        for(int i = 0; i < 10; i++) {
            int rand = randMachine.nextInt(20) + 1;
            tenRolls[i] = rand;
        }
        return tenRolls;
    }

    public char getRandomLetter() {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k','l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int randLetter = randMachine.nextInt(26);
        return letters[randLetter];
    }

    public String generatePassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int numberOfPasswords) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < numberOfPasswords; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

    public ArrayList<Object> shuffleArray(ArrayList<Object> notShufflePassword) {
        for(int i = 0; i < notShufflePassword.size(); i++) {
            int randomIndex = randMachine.nextInt(notShufflePassword.size());
            Object tempt = notShufflePassword.get(i);
            notShufflePassword.set(i, notShufflePassword.get(randomIndex));
            notShufflePassword.set(randomIndex, tempt);
        }
        return notShufflePassword;
    }
}