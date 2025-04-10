import java.util.*;

public class Practicalno9 {
    private int[][] box;
    private static final int SIZE = 3;

    // Constructor
    public Practicalno9() {
        box = new int[SIZE][SIZE];
        fillBox();
    }

    // Method to fill a 3x3 box with random non-repeating numbers from 1 to 9
    private void fillBox() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        int index = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                box[i][j] = numbers.get(index++);
            }
        }
    }

    // Method to display the box with the top horizontal line
    public void printBox() {
        System.out.println("|____|____|____|");  // Top line

        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf(" %2d |", box[i][j]);
            }
            System.out.println();
            System.out.println("|____|____|____|");
        }
    }

    public static void main(String[] args) {
        Practicalno9 game = new Practicalno9();
        game.printBox();
    }
}
