import behavioral.BehavioralPatterns;
import creational.CreationalPatterns;
import structural.StructuralPatterns;

public class PatternsMain {

    public static void main(String[] subhani) {

        System.out.println("====================Creational Pattern====================");
        CreationalPatterns creationalPatterns = new CreationalPatterns();
        creationalPatterns.patterns();
        System.out.println();
        
        System.out.println("====================Structural Pattern====================");
        StructuralPatterns structuralPatterns = new StructuralPatterns();
        structuralPatterns.patterns();
        System.out.println();

        System.out.println("====================Behavioral Pattern====================");
        BehavioralPatterns behavioralPatterns = new BehavioralPatterns();
        behavioralPatterns.patterns();
    }
}
