package H_Bucles;

public class N_Bunga {
    public static void main (String[] args){
        int counter =0;
        for (int a=1; a<=9; a++){
            for (int b=1; b<=9; b++){
                if(a!=b)
                for(int c=1; c<=9; c++){
                    if (c!=a && c!=b){
                    counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}

// M A L D O // 
