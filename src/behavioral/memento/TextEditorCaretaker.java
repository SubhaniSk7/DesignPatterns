package behavioral.memento;

import java.util.Stack;

// Caretaker. It can be implemented as Command pattern.
public class TextEditorCaretaker {

    // We can implement it as command pattern like adding TextEditor(receiver) and remove parameters in save() and undo().
    // TextEditor editor;

    public Stack<TextEditorMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.createMemento());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}
