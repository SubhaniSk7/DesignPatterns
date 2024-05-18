package behavioral.iterator;

// Concrete collection.
public class GitRepositoryCollection implements CollectionInterface {

    // It can have reference to Iterator. and can be set while initialization.
    // IteratorInterface iterator;

    String[] repos = {"MLProject", "DLProject", "RLProject"};

    @Override
    public IteratorInterface getIterator() {
        return new RepoIterator(repos);
    }
}
