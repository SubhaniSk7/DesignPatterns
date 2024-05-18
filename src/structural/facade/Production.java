package structural.facade;

// Subsystem of AI system.
public class Production {

    public void takeLiveTraffic(MLModel model) {
        System.out.println("Model is giving predictions for live traffic.");
        storeLiveTrafficInDB();
    }

    public void studyTheResults() {
        System.out.println("study the results on live traffic.");
    }

    public void storeLiveTrafficInDB() {
        System.out.println("stored live traffic in db.");
    }

    public void end() {
        System.out.println("Stopped taking live traffic.");
    }
}
