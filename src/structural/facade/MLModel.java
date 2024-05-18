package structural.facade;

// Subsystem of AI system.
public class MLModel {

    public void applyModel() {
        System.out.println("Applied the model.");
    }

    public void validateModelResult() {
        System.out.println("Validated the model on training set and test set.");
    }

    public MLModel giveBestModel() {
        applyModel();
        System.out.println("Selected the best model.");
        return new MLModel();
    }

    public void clean() {
        System.out.println("cleared the intermediate models.");
    }
}
