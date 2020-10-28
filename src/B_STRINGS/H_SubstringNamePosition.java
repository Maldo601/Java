package B_STRINGS;

public class H_SubstringNamePosition {
    public static void main (String[] args) {
        // 8. El siguiente programa le indicamos que nos tire por terminal y corriendo el carro junto a tabulaciones, nuestro nombre, apellido 1 y apellido 2
        //    Usamos variable.substring() con el valor de las posiciones de inicio a fin. 
        String nom = "Joan Marc Maldonado Negre"; // 25
        
        System.out.println("\n\tEl meu nom és " + nom.substring(0,9));
        System.out.println("\n\tEl meu primer cognom és " + nom.substring(10, 19));
        System.out.println("\n\tEl meu segon cognom és " + nom.substring(20, 25) + "\n");
    }
}
