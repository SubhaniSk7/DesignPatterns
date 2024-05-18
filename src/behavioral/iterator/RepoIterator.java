package behavioral.iterator;

// Concrete iterator. It can have reference to CollectionInterface, so we can work with interaces.
public class RepoIterator implements IteratorInterface {

    // this is reference to Concrete Collection. It can be concrete collection object.
    // CollectionInterface collection;

    private final String[] repos;
    private int currentPosition; // current position of concrete collection.

    public RepoIterator(String[] repos) {
        this.repos = repos;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < repos.length;
    }

    @Override
    public Object getNext() {
        if (this.hasNext()) {
            return repos[currentPosition++];
        }
        return null;
    }
}
