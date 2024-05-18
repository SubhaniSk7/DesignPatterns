package behavioral.iterator;

public class ClientCodeIterator {
    
    public void execute() {
        GitRepositoryCollection gitRepositoryCollection = new GitRepositoryCollection();
        IteratorInterface iterator = gitRepositoryCollection.getIterator();

        while (iterator.hasNext()) {
            System.out.println("Repo project name: " + iterator.getNext());
        }
    }
}
