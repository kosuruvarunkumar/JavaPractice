package stmtsmethods;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (365 * 24 * 60);
            long remainingDays = (minutes % (365 * 24 * 60)) / (24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
