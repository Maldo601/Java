package I_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Z_MovimentsBancaris {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        // Llibreta de moviments
        int v[] = {-50,-150,-60,800,-80,-300,-230,-90,850,-30,-600,-50,-150,-30,-40};
        // Password
        final String pwd = "Alumne";
        String lectPas;     String lectMov;
        int min = 0;        
        int saldo = 0;      
        int ing = 0;        int ret = 0;
        // Loop
        do{
            System.out.print("Introdueix la teva contraseña: ");
            lectPas = lect.nextLine();
            if (lectPas.equals(pwd)){
                System.out.println("Validat");
                for ( int x = 0; x<v.length; x++){
                    saldo += v[x];
                }
                System.out.println("Tens " + saldo + " €");
                System.out.print("Si vols ingresar diners introdueix \"I\", per retirar \"R\":  ");
                lectMov = lect.nextLine();
                // INGRESOS
                if (lectMov.equals("I")){
                    System.out.print("Introdueix quantitat a ingresar: ");
                    ing = lect.nextInt();
                    if ( (ing > 0) || (ing < 0) ){
                        saldo += ing;      
                        System.out.println("Tens " + saldo + " €");
                    }
                    else if ( ret == 0 ){
                    System.out.println("Operació cancelada");
                    System.exit(-2);
                    }
                    // ACTUALITZACIÓ DE MOVIMENTS
                    System.out.println(Arrays.toString(v));
                    System.out.println("Actualizando movimientos...");
                    for (int y = 0; y < v.length-1; y++){
                    v[y] = v[y+1];
                    }
                    v[14] = ing;
                    System.out.println(Arrays.toString(v));
                }
                // RETIRADES
                else if (lectMov.equals("R")){
                    System.out.print("Introdueix la quantía a retirar: ");  
                    ret = lect.nextInt();
                    if ( (ret > 0) || (ret < 0) ){
                        saldo -= ret;
                        System.out.println("Tens " + saldo + " €");
                    }
                    else if ( ret == 0 ){
                    System.out.println("Operació cancelada");
                    System.exit(-2);
                    }
                    // ACTUALITZACIÓ DE MOVIMENTS
                    System.out.println(Arrays.toString(v));
                    System.out.println("Actualizando movimientos...");
                    for (int y = 0; y < v.length-1; y++){
                    v[y] = v[y+1];
                    }
                    v[14] =- ret;
                    System.out.println(Arrays.toString(v));
                    System.exit(-2);
                }
            }
            else 
            min++;
        }while (min < 3);
            System.out.println("Acces denegat");
            System.exit(-1);
    }
}
