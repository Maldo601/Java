package H_Bucles;
public class N_Bunga {
    public static void main (String[] args){
        int counter =0;
        for (int a=1; a<=4; a++){           // Familia A
            for (int b=1; b<=4; b++){       // Familia B
                if(a!=b)                    // Descarta igualtats entre A i B 
                for(int c=1; c<=4; c++){    // Familia C   
                    if (c!=a && c!=b){      // Descarta igualtats entre C i A i C i B
                    counter++;
                    System.out.println("A-" + a + "    " +
                                       "B-" + b + "    " +
                                       "C-" + c           );
                    }              
                }
            }
        }
        System.out.println("Hi han " + counter + " combinacions possibles. ");
    }
}
// M A L D O // 
