package structural.facade;

public class FacadeClientCode {
    public void execute() {
//        PreProcessor preProcessor = new PreProcessor();
//        MLModel mlModel = new MLModel();
//        Production production = new Production();
//        AISystemFacade aiSystemFacade = new AISystemFacade(preProcessor, mlModel, production);
//        aiSystemFacade.startProject();
//        aiSystemFacade.endProject();

        AISystemFacade aiSystemFacade1 = new AISystemFacade();
        aiSystemFacade1.startProject();
        aiSystemFacade1.endProject();
    }
}
