package X_LecturaFitxers;
import java.io.*;
import java.util.*;
// import java.util.Arrays;
// https://stackoverflow.com/questions/696626/java-filereader-encoding-issue
public class C_MesNota {
    static Scanner lect;
    static boolean file = true;
    static boolean score = true;
    static Double sc;
    static Double v[];
    static String lec[];
    static int counter = 0;
    static void validFormat(String[] args){
        if (args.length != 2){
            System.out.println("Programa per llegir notes d'Alumnes. " + 
                               "Siusplau, passa una nota com argument. ");
        }
        try (FileReader fr = new FileReader(args[0])){  }
        catch (Exception e) {
            System.out.println("Fitxer Desconegut.");
            file = false;
        }
        try{
            if (Double.parseDouble(args[1]) > 10 || Double.parseDouble(args[1]) <  0)
                throw new Exception("");
        }
        catch(Exception e){
            System.out.println("Nota invàlida. Escriu una nota entre 0 i 10.");
            score = false;
        }
    }
    static void extracter(String[] args){
        String c;
        String note = "";
        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){
                    counter++;
                }
        }catch (Exception e) {
            System.out.println("Error per definir 1.");
        }
        v = new Double[counter];
        lec = new String[counter];
        int cnt = 0;
        int cnt2 = 0;
        try(InputStreamReader fr = new InputStreamReader(new FileInputStream(args[0]), "UTF-8")){
            BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){
                    note = c.substring(c.length()-4, c.length());
                    note = note.replace(",", ".");
                    note = note.replace(" ", "");
                    note = note.replaceAll("[^0-9+.]", "0");
                    v[cnt++] = Double.parseDouble(note);
                    lec[cnt2++] = c.substring(0, c.length()-4);
                }
        }catch(Exception e){
            System.out.println("Error per definir 2.");
        }
        // System.out.println(Arrays.toString(v));
        // System.out.println(Arrays.toString(lec));
    }
    static void printer (Double v[], String lec[], String[] args){
        // En teoria aqui arriba tot sense errors ja. 
        System.out.printf("%-40s%-2s%-10s\n","Alumne","","Nota");
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i = 0; i < v.length; i++){
            if(Double.parseDouble(args[1]) <= v[i])
                System.out.printf("%-46s%-1.2f\n",lec[i].trim(), v[i]);
        }
    }
    // Testing d'impresió ( Feature )
    static void logs (String[] args, Double v[], String lec[]){
        try {
            PrintWriter writer = new PrintWriter("logs.txt", "UTF-8");
            writer.printf("%-35s%-10s%-40s\n","Alumne","","Nota");
            writer.println("---------------------------------------------------------------");
            for(int i = 0; i < v.length; i++){
                if(Double.parseDouble(args[1]) <= v[i])
                    writer.printf("%-45s%-1.2f\n",lec[i].trim(), v[i]);
        }
        writer.println("---------------------------------------------------------------");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        String opt;
        validFormat(args);
        if (file && score == true){
            extracter(args);
            printer(v, lec, args);
            System.out.print("\nDesitjes imprimir els resultats a un .txt? [yes][no]: ");
            opt = lect.nextLine();
            if(opt.equals("yes")){
                logs(args, v, lec);
            }else{
                System.exit(0);
            }
        }
    }
}
    

