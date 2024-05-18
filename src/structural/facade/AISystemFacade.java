package structural.facade;

// Facade class for AI system.
// We can create additional facade classes. These can interact with each other.
// In AI system, we can create facade at each layer,
// so that each subsystem can communicate with other subsystems using the facade classes.
public class AISystemFacade {
    private final PreProcessor preProcessor;
    private final MLModel mlModel;
    private final Production production;

    public AISystemFacade() {
        this.preProcessor = new PreProcessor();
        this.mlModel = new MLModel();
        this.production = new Production();
    }

    public AISystemFacade(PreProcessor preProcessor, MLModel mlModel, Production production) {
        this.preProcessor = preProcessor;
        this.mlModel = mlModel;
        this.production = production;
    }

    public void startProject() {
        preProcessor.cleanIrrelevantDataset();
        preProcessor.extractFeatures();

        MLModel bestModel = mlModel.giveBestModel();

        production.takeLiveTraffic(bestModel);
    }

    public void endProject() {
        preProcessor.cleanMemory();
        mlModel.clean();
        production.storeLiveTrafficInDB();
        production.end();
    }
}
