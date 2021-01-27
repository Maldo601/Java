package I_Arrays;

public class N_BuscarSopaVocals {
    public static void main(String[] args) {
        // Programa que contará el número de veces que aparece cada vocal en la sopa
        // de letras indicada
        int [] v = {0,0,0,0,0};     // int [] v = new int[5];
        char [] voc = {'a','e','i','o','u'};
        final char soup[][] = { 
            {'p','a','t','a','t','a','i','u','o','b'},
            {'i','n','t','a','t','b','n','i','o','l'},
            {'z','c','o','m','i','v','t','a','a','u'},
            {'z','l','a','p','i','z','e','f','w','s'},
            {'a','a','l','o','l','a','r','t','t','p'},
            {'a','l','t','a','v','o','n','w','f','l'},
            {'i','t','a','a','h','u','e','v','o','u'},
            {'r','a','n','v','e','n','t','a','a','s'},
            {'e','v','e','n','t','a','n','a','a','a'},
            {'c','o','m','i','c','s','u','p','e','r'}, 
        };
        // El NetBeans nos informa que podemos usar otro tipo de bucle para recorrer la matriz
        for (int n=0; n<soup.length; n++)
            for (int m=0; m<soup[0].length; m++){
                for (int p=0; p<voc.length; p++)
                    if (soup[n][m] == voc[p])
                        v[p]++;
            }
        for (int n=0; n<v.length; n++)
            System.out.println("La vocal " + voc[n] + " aparece " +
                    v[n] + " veces en la matriz soup");
        
    }
}
