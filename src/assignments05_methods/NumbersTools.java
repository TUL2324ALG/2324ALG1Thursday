package assignments05_methods;

import java.util.concurrent.ThreadLocalRandom;

public class NumbersTools {
     /**
     * Generate a number between min and max both inclusive. The method works well
     * when max > min
     * @param min lower band
     * @param max upperband
     * @return random number
     */
    public static int generateRandom(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }
}
