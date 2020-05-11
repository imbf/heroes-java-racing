package util;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

public class RandomNumberGenerator {

    private static final Random RANDOM = new Random();

    public static List<Integer> createRandomNumbers(int length, int limit) {
        List<Integer> randomIntegers = new ArrayList<>();
        for (int count = 0; count < length; count++) {
            randomIntegers.add(RANDOM.nextInt(limit));
        }
        return randomIntegers;
    }
}
