import static utils.BonetEines.BonetAleatoriAmbNegatius;

public class BonetVectors.java {
    public static void main(String[] args) {
        final int VALOR_MINIM = 1;
        final int VALOR_MAXIM = 100;
        int suma = 0;

        final int CODI_ERROR = -99;
        int midaDelVector = 0;

        Scanner teclat = new Scanner(System.in);

        do {
            System.out.print("Entra la mida del vector a omplir: ");
            try {
                midaDelVector = teclat.nextInt();

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
            if(i != midaDelVector -1 ){
                System.out.printf("-");
            }
        }

        aleatoriAmbNegatius();
        int[] vectorEnters = new int[midaDelVector];

        System.out.format("S'ha rebut : [midaDelVector1]%d\n", (int) );

        System.out.format("S'ha rebut : [midaDelVector2] %d\n", (int) );

