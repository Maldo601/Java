package B_STRINGS;

public class B_StringTabulator {
    public static void main (String[] args) {
        //2. Aqui hem vist les diferencies principals en escriure-ho a un print o a un println.
        //   Es necessari el println ja que si no, la linea de terminal on escribim es solapa amb la ultima frase del text que hem 
        //   escrit. Podem provar-ho modificant el println del final per la prova esmentada.  
        String cad = "\tHola" + "\nAvui fa un bon dia" +"\n\t\tDema segurament també farà un bon dia";

        System.out.println(cad);
    }
}