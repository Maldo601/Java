package H_Bucles;

public class M_PotValue {
    public static void main(String[] args) {
        int suma = 0;
        int suma2 = 0;
        // Bucles
        for (int n = 10; n <= 99; n++){
            for (int m = 10; m <= 99; m++){
                // Filtro per evitar inversións duplicades. (15x12 + 12x15)
                if ( m >= n){
                    suma += m*n;
                }
                // Filtro discriminador de productes iguals. (11x11, 10x10)
                if ( m > n){
                    suma2 += m*n;
                }
            }
        }
        System.out.println("\n\tSuma de productes de 2 xifres --> " + suma);
        System.out.println("\tSuma de productes sense 10x10, 11x11... --> " + suma2);
    }
}
// M A L D O // 
