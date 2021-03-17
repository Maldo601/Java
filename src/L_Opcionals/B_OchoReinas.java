package L_Opcionals;

import java.util. *;

public class B_OchoReinas {
    public static List<Integer> t = Arrays.asList(1,2,3,4,5,6,7,8);
    int numReines = 0;
    public static void main(String[] args){
        while(!correcte(t))
            t = shuffle(t);
        System.out.print(correcte(t));
    }
    /*
    @int[] t => vector  
    desordena el vector
     */
    public static List<Integer> shuffle(List<Integer> t) {
        Collections.shuffle(t);
        return t;
    }
    public static boolean correcte (List <Integer> t) { 
        for (int i = 0; i < t.size(); i++)
            for (int j = 0 ; j < t.size(); j++){
                if ( (t.get(i)+j  == t.get(i+j)) || (t.get(i)-j  == t.get(i+j))){
                    System.out.println(t);
                   return false;
                   
                }
        }
        Collections.shuffle(t);
        System.out.println(t);
        return false;
    }
}




/*
int index;
        Random random = new Random();
        for (int i = t.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            if (index != i)
            {
                t[index] ^= t[i];
                t[i] ^= t[index];
                t[index] ^= t[i];
            }
        }


*/