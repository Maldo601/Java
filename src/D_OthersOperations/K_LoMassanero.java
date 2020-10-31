package D_OthersOperations;

public class K_LoMassanero {
    public static void main (String[] args ) {
        
        // Aquest programa es invariable. 
        final int mass = 178;
        final int ppl = 15;
        int n = mass/ppl;
        System.out.println("\n\tVolem repartir " + mass + " entre " + ppl + " persones.");
        System.out.println("\tDonarem " + n +" maçanes per persona.");
        System.out.println("\tSobren " + Math.floorMod(mass, ppl) + " massanes.\n");
    }    
}
/*_Maldo_ */