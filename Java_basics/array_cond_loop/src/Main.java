import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        String res;
        int value = Blackjack.parseCard("ace");
        System.out.println(value + " => 11");

        boolean result = Blackjack.isBlackjack("queen", "ace");
        System.out.println(result + " => true");

        boolean isBlackJack = true;
        int dealerScore = 7;
        res = Blackjack.largeHand(isBlackJack, dealerScore);
        System.out.println(res + " => W");

        int handScore = 15;
        dealerScore = 12;
        res = Blackjack.smallHand(handScore, dealerScore);
        System.out.println(res + " => H");
        */
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        int[] res = birdCount.getLastWeek();
        System.out.println(Arrays.toString(res) + " => [2, 5, 0, 7, 4, 1]");

        int value = birdCount.getToday();
        System.out.println(value + " => 1");

        birdCount.incrementTodaysCount();
        value = birdCount.getToday();
        System.out.println(value + " => 2");

        boolean result = birdCount.hasDayWithoutBirds();
        System.out.println(result + " => true");

        value = birdCount.getCountForFirstDays(4);
        System.out.println(value + " => 14");

        value = birdCount.getBusyDays();
        System.out.println(value + " => 2");
    }
}