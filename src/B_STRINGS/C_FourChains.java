package B_STRINGS;

public class C_FourChains {
    public static void main (String[] args){
        //3. En aquest exercici agrupem les cadenes proposades per snº amb una sola string que les concatena i mostra en un println.
        //   Acte seguit provarem de comparar cadenes amb un mètode erroni amb == i amb un mètode especial de java. 
        //   Farem un copy paste de la cadena de l'exercici anterior per poderles comparar. 
        String cad = "\tHola" + "\nAvui fa un bon dia" +"\n\t\tDema segurament també farà un bon dia";

        System.out.println(cad);

        String s1 = "\tHola\n" ;
        String s2 = "Avui fa un bon dia\n";
        String s3 = "\t\tDema segurament també farà un bon dia";
        String s = s1 + s2 + s3;

        // System.out.println(s);
        // System.out.println(s == cad); // ERROR, retorna false 
           System.out.println(s.equals(cad)); // Retorna true, esta es la manera correcta. 
    }    
}
