package module3.randomtest;

public class Yahtzee
{
    private static int dice1, dice2, dice3, dice4, dice5, count;

    /**
     * Number of sides each die has.
     * @param sides of each die.
     * @return sides.
     */
    public static int diceType(int sides) {
        return sides;
    }

    /**
     * Rolling a six sided die.
     * @return int value in a range from (1 - 6)
     */
    public static int rollDice() {
        return ((int) ((Math.random() * diceType(6))+1));
    }

    /**
     * Check how many times we need to roll the 5 dice to get a match.
     * @return count of the no. of times the 5 dice have rolled.
     */
    public static int keepRolling() {
        dice1 = rollDice();
        dice2 = rollDice();
        dice3 = rollDice();
        dice4 = rollDice();
        dice5 = rollDice();
        while(!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            // if true then roll again.
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("The five dices have been rolled " + keepRolling() + " times to get a match!");
    }
}