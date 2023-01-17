public class BirdWatcher {
    private final int[]  birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDay = false;
        for (int day : this.birdsPerDay) {
            if (day == 0) {
                hasDay = true;
                break;
            }
        }
        return hasDay;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < this.birdsPerDay.length && i < numberOfDays; i++) {
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int j : this.birdsPerDay) {
            if (j > 4)
                busyDays++;
        }
        return busyDays;
    }
}