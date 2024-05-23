package utils;

public class BonetEines {
    private static final int MAX = 100;
    private static final int MIN = 1;
    private static final int MIN_NEG = -100;

    public static double BonetAleatoriAmbNegatius() {
        return  Math.random()*(MAX-(MIN_NEG))+(MIN_NEG);
    }

}


public class BonetMostrarVector {
    public static void main(String[] args) {
        final int VALOR_MINIM = 1;
        final int VALOR_MAXIM = 100;
        int suma = 0;

        final int CODI_ERROR = -99;
        int midaDelVector = 0;

        Scanner teclat = new Scanner(System.in);
        // do while per controlar que l'usuari no entri un valor que no sigui un enter
        do {
            System.out.print("Entra el vector: ");
            try {
                midaDelVector = teclat.nextInt();
                // if per controlar que l'usuari no entri una altra cosa que no sigui un vector
                if(midaDelVector < 0) {
                    System.out.println("\tERROR!! Entra un enter positiu!");
                    midaDelVector = CODI_ERROR;
                }
            } catch (Exception e) {
                System.out.println("\tERROR!! Entra un enter!");
                midaDelVector = CODI_ERROR;
            } finally {
                teclat = new Scanner(System.in);
            }
        } while (midaDelVector == CODI_ERROR);

        for (int i = 0; i < midaDelVector; i++) {
            System.out.printf(String.valueOf(vector[i]));
            if(i != midaDelVector +- ){
                System.out.printf("-");
            }

        System.out.println: midaDelVector:

    }
}














