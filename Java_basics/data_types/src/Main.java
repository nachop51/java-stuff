public class Main {
    public static void main(String[] args) {
        /*
        String message;
        message = LogLevels.message("[ERROR]: Invalid operation");
        System.out.println(message);
        System.out.println("Invalid operation");

        message = LogLevels.message("[WARNING]:  Disk almost full\r\n");
        System.out.println(message);
        System.out.println("Disk almost full");

        message = LogLevels.logLevel("[ERROR]: Invalid operation");
        System.out.println(message);
        System.out.println("error");

        message = LogLevels.reformat("[INFO]: Operation completed");
        System.out.println(message);
        System.out.println("Operation completed (info)");
         */
        /*
        double value = CarsAssemble.productionRatePerHour(6);
        System.out.println(value + " => 1193.4");
        int value2 = CarsAssemble.workingItemsPerMinute(6);
        System.out.println(value2 + " => 19");
         */
        boolean result;
        boolean knightIsAwake;
        boolean archerIsAwake;
        boolean prisonerIsAwake;
        boolean petDogIsPresent;

        knightIsAwake = true;
        result = AnnalynsInfiltration.canFastAttack(knightIsAwake);
        System.out.println(result + " => false");

        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        result = AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        System.out.println(result + " => true");

        archerIsAwake = false;
        prisonerIsAwake = true;
        result = AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        System.out.println(result + " => true");

        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        petDogIsPresent = false;
        result = AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        System.out.println(result + " => false");
    }
}
