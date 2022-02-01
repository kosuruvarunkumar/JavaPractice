package stmtsmethods;

public class Main {
    public static void main(String[] args) {
        speedConverterTest();
        megaBytesConverterTest();
        barkingDogTest();
        leapYearTest();
        decimalComparatorTest();
        equalSumCheckerTest();
        teenNumberCheckerTest();
        areaCalculatorTest();
        minutesToYearsDaysCalculatorTest();
        intEqualityPrinterTest();
        playingCatTest();
    }

    private static void playingCatTest() {
        System.out.println("==Playing Cat Test==");
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }

    private static void intEqualityPrinterTest() {
        System.out.println("==Equality Printer Test==");
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
    }

    private static void minutesToYearsDaysCalculatorTest() {
        System.out.println("==Minutes to Years Days Calculator Test==");
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }

    private static void areaCalculatorTest() {
        System.out.println("==Area Calculator Test==");
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));
    }

    private static void teenNumberCheckerTest() {
        System.out.println("==Teen Number Checker Test==");
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
    }

    private static void equalSumCheckerTest() {
        System.out.println("==Equal Sum Checker Test==");
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
    }

    private static void decimalComparatorTest() {
        System.out.println("==Decimal Comparator Test==");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    private static void leapYearTest() {
        System.out.println("==Leap Year Test==");
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(1924));
    }

    private static void barkingDogTest() {
        System.out.println("==Barking Dog Test==");
        System.out.println(BarkingDog.shouldWakeUp (true, 1));
        System.out.println(BarkingDog.shouldWakeUp (false, 2));
        System.out.println(BarkingDog.shouldWakeUp (true, 8));
        System.out.println(BarkingDog.shouldWakeUp (true, -1));
    }

    private static void speedConverterTest() {
        System.out.println("==Speed Converter Test==");
        System.out.println(SpeedConverter.toMilesPerHour(1.5));
        System.out.println(SpeedConverter.toMilesPerHour(10.25));
        System.out.println(SpeedConverter.toMilesPerHour(25.42));
        System.out.println(SpeedConverter.toMilesPerHour(75.114));

        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-10);
        SpeedConverter.printConversion(75.114);
    }

    private static void megaBytesConverterTest(){
        System.out.println("==MB Converter Test==");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2048);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
