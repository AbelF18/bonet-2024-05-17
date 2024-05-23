package utils;

public class BonetEines {
    private static final int MAX = 100;
    private static final int MIN = 1;
    private static final int MIN_NEG = -100;

    public static double BonetAleatoriAmbNegatius() {
        return  Math.random()*(MAX-(MIN_NEG))+(MIN_NEG);
    }

}