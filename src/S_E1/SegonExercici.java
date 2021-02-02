package S_E1;
public class SegonExercici {
    public static void main (String[] args){
        int rand = (int) (Math.random() * (25 - 5+1)) + 5;
        System.out.println("\nEls premis que tinc son: 5 mascarilles, 10 mes mascarilles, 25 pote hidroalcholic");
        System.out.println("\nEl numero que t'ha tocat es el " +rand);

        if ( rand == 5)
        System.out.println("Bingo, t'ha tocat un paquet de 5 mascarilles FFP2");
        else if ( rand == 10)
        System.out.println("Bingo t'ha tocat un paquet de 10 mascarilles higeniques");
        else if ( rand == 25)
        System.out.println("Bingo t'ha tocat un pot de 200ml de gel hidroalcolig");
        else 
        System.out.println("No t'ha tocat res.");


    }
}
