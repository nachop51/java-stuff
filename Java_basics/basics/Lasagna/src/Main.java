public class Main {
    public static void main(String[] args) {
        int value;
        Lasagna lasagna = new Lasagna();
        value = lasagna.expectedMinutesInOven();
        System.out.println(value + " => 40");

        value = lasagna.remainingMinutesInOven(30);
        System.out.println(value + " => 10");

        value = lasagna.preparationTimeInMinutes(2);
        System.out.println(value + " => 4");

        value = lasagna.totalTimeInMinutes(3, 20);
        System.out.println(value + " => 26");
    }
}
