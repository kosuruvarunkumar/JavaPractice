package stmtsmethods;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int tempUpperRange = (summer)?45:35;
        if(temperature >= 25 && temperature <= tempUpperRange) {
            return true;
        } else {
            return false;
        }
    }
}
