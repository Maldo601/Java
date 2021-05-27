package X_LecturaFitxers;

public class H_SumaArgs {
    public static void main(String[] args) {
        int total = 0;      // Acumular la suma de argumentos
        int x;              // Valor tratado de args
        boolean primer = true;  // Indica que no ha salido todavía un valor válido
        String result = ""; // Resultado
        if (args.length < 2){
            System.out.println("Pasa como mínimo dos valores para sumar");
        }
        else{
            System.out.println("Pasados los parámetros:  " + java.util.Arrays.toString(args));
            for (int n=0; n<args.length; n++){
                try {
                    x = Integer.parseInt(args[n]);
                    if (x < -100 || x > 100)
                        throw new Exception("");
                    if (primer){
                        result += args[n];
                        primer = false;
                    }
                    else{
                        if (x < 0)
                            result += " - " + -x;
                        else
                            result += " + " + x;
                    }
                    total +=x;
                }
                catch (Exception e){
                    System.out.println("El parametro Nº " + (n+1) + " :  " + args[n] + " es incorrecto");
                    System.out.println("Los parametros han de ser números entre -100 y 100");
                }
            }
            System.out.println(result + " =  " + total);
        }
    }
}
