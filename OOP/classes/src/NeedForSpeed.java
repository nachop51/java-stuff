public class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class

    public int speed;
    public int batteryDrain;
    public int distance = 0;
    public int battery = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery == 0;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        this.distance += this.speed;
        this.battery -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
