public class CarsAssemble {

    public static double productionRatePerHour(int speed) {
        double successRate;
        if (speed >= 1 && speed < 5)
            successRate = 1;
        else if (speed > 4 && speed < 9)
            successRate = 0.9;
        else if (speed == 9)
            successRate = 0.8;
        else
            successRate = 0.77;

        return (double)speed * successRate * (double) 221;
    }

    public static int workingItemsPerMinute(int speed) {
        return (int)CarsAssemble.productionRatePerHour(speed) / 60;
    }
}
