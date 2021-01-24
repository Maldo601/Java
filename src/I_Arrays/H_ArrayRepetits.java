package I_Arrays;
import java.util.Arrays;
public class H_ArrayRepetits {
    public static void main (String[] args){
        int v[] = new int [100];
        int aux[] = new int [100];
        for ( int x = 0; x < v.length; x++){
            v[x] = (int) (Math.random() * 50);
        }
        Arrays.sort(v);
        for (int i= 0; i < v.length; i++){
            aux[v[i]] += 1;
        }
        // El mes repetit. 

        /* Comencem amb una variable anomenada index inicialitzada a 0. Partint d'aquí es recorre el bucle 100 vegades.
           Es reserva a la variable index, L'INDEX, que conté el valor mes alt trobat de quantitat repetida.
           L'index, es el número en questió que es repeteix. Si no troba cap index amb valor repetit mes alt que el 
           index amb valor repetit mes alt reservat, avança índexos fins trobar un índex ( número en questio ) més alt.
           De trobarse, s'actualitza l'index. Una vegada es toca tope, es reserva a una altra variable auxiliar, l'index amb
           valor repetit més petit, que resulta ser, el primer que s'ha trobat, permetent així que es mostre sempre el primer
           índex ( numero ) de valor repetit igual a la resta. 
        */
        int index = 0; 
        for (int j = 0; j < aux.length; j++){ 
            if (aux[j] > aux[index]){ 
                index = j;              
            }
        }
        int max = aux[index];
        System.out.println("El més repetit primer és el [" + index + "] la quantitat de:  " + max + " vegades.");
        }
    }
// M A L D O // 


