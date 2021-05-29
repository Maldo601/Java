package Z_Examen;

public class Escribe {
    public static void main(String[] args){
        String str = "";
        int num = 0;
        try{
            
            if (Integer.parseInt(args[0]) < 0){
                throw new Exception("");
            }
            else if (args.length == 2){
                num = Integer.parseInt(args[0]);
                str = args[1];
                for (int i = 0; i < num; i ++){
                    System.out.println(str);
                }
            }
        }catch(Exception e){
            System.out.println("El primer parametro ha de ser un numero entero positivo.");
        }
    }
}
