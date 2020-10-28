package B_STRINGS;

public class G_CharAtNombreApellidos {
    public static void main (String[] args) {
        // 7. Este ejercicio nos tira por separado en diferentes tabulaciones, las iniciales de nuestro nombre y apellidos.
        //    hay que fijarse en los valores dados a charAt para ver la posicion en la que cae.

        String nom = "Joan Marc Maldonado Negre";
        char m1, m2, m3, m4; 
        m1 = nom.charAt(0); m2 = nom.charAt(5); m3 = nom.charAt(10); m4 = nom.charAt(20);

        System.out.println("\n\t\t" + m1 + "\t" + m2 + "\t" + m3 + "\t" + m4 + "\n");
    }
}

