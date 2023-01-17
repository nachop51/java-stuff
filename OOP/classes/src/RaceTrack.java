public class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    public int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distance < this.distance) {
            car.drive();
        }
        return car.distance > this.distance;
    }
}
