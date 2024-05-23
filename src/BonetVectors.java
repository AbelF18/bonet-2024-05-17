public class BonetVectors.java {
    public static void main(String[] args) {
        final int VALOR_MINIM = 1;
        final int VALOR_MAXIM = 100;
        int suma = 0;

        final int CODI_ERROR = -99;
        int midaDelVector = 0;

        Scanner teclat = new Scanner(System.in);
        // do while per controlar que l'usuari no entri un valor que no sigui un enter
        do {
            System.out.print("Entra la mida del vector a omplir: ");
            try {
                midaDelVector = teclat.nextInt();
                // if per controlar que l'usuari no entri un valor negatiu
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


        int[] vectorEnters = new int[midaDelVector];

        // for per recórrer i obtenir tots els elements del vector
        for (int i = 0; i < midaDelVector; i++)

