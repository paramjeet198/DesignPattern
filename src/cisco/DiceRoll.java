package cisco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceRoll {

    static int count = 0;
    private static void distinctOutcomes(int numDiceLeft, int currentValue) {
        if (numDiceLeft == 0) {
            System.out.print(count + ", ");
             count++;
             return;
        }

        for (int i = currentValue; i <= 6; i++) {
            distinctOutcomes(numDiceLeft - 1, i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Outcomes for 1 die:");
        distinctOutcomes(2,1);
        System.out.println("\nCount: "+count);
    }
}

