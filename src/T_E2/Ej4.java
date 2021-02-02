package T_E2;
public class Ej4 {
    public static void main (String[] args){
        
            int counter =0;
            for (int a=1; a<=5; a++){           // Paciente A
                for (int b=1; b<=5; b++){       // Paciente B
                    if(a!=b)                    // Descarta igualtats entre A i B 
                    for(int c=1; c<=5; c++){    // Paciente C   
                        if (c!=a && c!=b){      // Descarta igualtats entre C i A i C i B
                            
                                    counter++;
                                    System.out.println("Pfzier X paciente " + a +
                                           "\tPfzier Y paciente " + b +
                                           "\tModerna  paciente " + c);
                        }              
                    }
                }
            }
            System.out.println("Hi han " + counter + " combinacions possibles. ");
        }
    }
// M A L D O // 