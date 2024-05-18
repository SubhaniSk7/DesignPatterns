package structural.facade;

// Subsystem of AI system.
public class PreProcessor {
    public void cleanIrrelevantDataset() {
        System.out.println("Dataset is cleaned.");
    }

    public void augmentDataset() {
        System.out.println("Augmented the data.");
    }

    public void extractFeatures() {
        augmentDataset();
        System.out.println("Features are extracted from data.");
    }

    public void storeInMemory() {
        System.out.println("Store in memory.");
    }

    public void cleanMemory() {
        System.out.println("cleared the memory.");
    }
}
