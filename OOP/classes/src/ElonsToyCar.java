public class ElonsToyCar {

    public int meters = 0;
    public int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.meters + " meters";
    }

    public String batteryDisplay() {
        if (this.battery == 0)
            return "Battery empty";

        return "Battery at " + this.battery + "%";
    }

    public void drive() {
        this.meters += 20;
        this.battery -= 1;
    }
}
