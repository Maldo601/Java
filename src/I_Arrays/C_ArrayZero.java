package I_Arrays;

public class C_ArrayZero {
    public static void main (String[] args) {
        float v[]; v = new float[1000];
        // Descomentar la següent linea per testejar. 
        v[5] = 4.2F; 
        // Loop
        int counter = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0)
            counter++;
            else
            System.out.println("Trobat el primer valor nul a la posició " +
                               i + " de l'Array.\n" +
                               "Valor trobat: " + v[i]);
        }
        System.out.println("No s'ha trobat cap valor > 0.0 en " + counter + "/1000 resutats analitzats");
    }    
}
