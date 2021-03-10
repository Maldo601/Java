package M_TryCatch;
/*
    - Propagar l'error: 
        · Exemple: Aplicacions multiplataforma en message box. 
        · Independitza les classes del model en la vista. No podem fer que les 
          classes del model es mostren en la vista. 

*/
public class B_PropagacioErrors {
    private static void crea_i_propaga() throws Exception{
        throw new Exception("Missatge d'error de l'excpecio que es vol propagar");
    }
    private static void tracta_excepcio(){
        try{
            // Es crida al metode que provoca excepció.
            crea_i_propaga();
        }catch(Exception ex){
            // Tractem l'excepcio produida
            System.out.println("Excepcio cridada. Error reportat: " + ex.toString());
        }
    }
    public static void main(String[] args)throws Exception{
        tracta_excepcio();
    }
}
