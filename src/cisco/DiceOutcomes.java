package cisco;

import java.util.*;

public class DiceOutcomes {

    public static int countUniqueOutcomes(int numDice) {
        Map<String, Integer> memo = new HashMap<>();
        return backtrack(new ArrayList<>(), memo, numDice);
    }

    private static int backtrack(List<Integer> currOutcome, Map<String, Integer> memo, int numDice) {
        if (currOutcome.size() == numDice) {
            Collections.sort(currOutcome);
            String outcomeStr = currOutcome.toString();
            if (!memo.containsKey(outcomeStr)) {
                memo.put(outcomeStr, 1);
                return 1;
            } else {
                return 0;
            }
        }
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            currOutcome.add(i);
            count += backtrack(currOutcome, memo, numDice);
            currOutcome.remove(currOutcome.size() - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int numDice = 2;
        int uniqueCount = countUniqueOutcomes(numDice);
        System.out.println("Number of unique outcomes: " + uniqueCount);
    }
}