package I_Arrays;
public class F_RandRepVect {
    public static void main (String[] args){
        // Variables
    int v[] = new int [1000];
    int counter = 0;
    for (int i = 0; i < v.length; i++){
        v[i] = (int) (Math.random() * (1500-1000)+1000);
        if (v[i] == 1250){
            counter++;
        }
    }
    System.out.println("S'ha trobat el 1250 " + counter + " vegades.");
    }  
}   
// M A L D O // 





