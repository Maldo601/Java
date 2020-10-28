package B_STRINGS;

public class D_StrDirectory {
    public static void main (String[] args){ 
        // 4. En aquest exercici ens mostra com podem usar els caracters especials d'escapada, per per exemple si volem 
        //    crear una cadena amb un text que contingui una ruta d'algun directori. El caracter d'escapada per poder incloure contrabarres
        //    es el \. La segona contrabarra que posessem ja li indiquem que volem posar una contrabarra. \\ 
        // 
        String str = "\n\t\tC:\\repas java\\tots els programes\\nous\\basics\n";
        System.out.println(str);
    }
}
