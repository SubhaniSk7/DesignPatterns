package behavioral.memento;

// It is the Memento(Snapshot) of Originator(TextEditor).
// It has reference to Originator, and it reflects the fields of Originator.
// We should only be able to set fields using constructor, this helps in manipulating memento snapshot state.
// We can introduce Memento Interface and use interface in Originator(TextEditor) restore method parameter,
// instead of concrete memento.
public class TextEditorMemento {

    private final TextEditor editor;
    private final String text;
    private final String curX;
    private final String curY;

    public TextEditorMemento(TextEditor editor, String text, String curX, String curY) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
    }

    public TextEditor getEditor() {
        return editor;
    }

    public String getText() {
        return text;
    }

    public String getCurX() {
        return curX;
    }

    public String getCurY() {
        return curY;
    }
}
