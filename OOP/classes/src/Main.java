public class Main {
    public static void main(String[] args) {
        /*
        ElonsToyCar car = ElonsToyCar.buy();

        String str = car.distanceDisplay();
        System.out.println(str + " => Driven 0 meters");

        str = car.batteryDisplay();
        System.out.println(str + " => Battery at 100%");

        car.drive();
        car.drive();
        str = car.distanceDisplay();
        System.out.println(str + " => Driven 40 meters");

        car.drive();
        car.drive();
        str = car.batteryDisplay();
        System.out.println(str + " => Battery at 96%");

        for (int i = 0; i < 96; i++) {
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        */
        int speed = 5;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);

        int distance = 100;
        var race = new RaceTrack(distance);

        System.out.println(car.distanceDriven() + " => 0");
        System.out.println(race.tryFinishTrack(car) + " => true");
        System.out.println(car.distanceDriven() + " => 100");

    }
}
