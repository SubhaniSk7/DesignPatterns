package behavioral.memento;

public class ClientCodeMementoPattern {

    public void execute() {
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        TextEditor editor = new TextEditor();
        editor.setText("hello world!");
        editor.setCursor("1", "10");

        caretaker.save(editor);
        editor.display();

        editor.setText("This is 2nd revision.");
        editor.setCursor("2", "50");

        caretaker.save(editor);
        editor.display();

        editor.setText("This is 3rd revision.");
        editor.setCursor("3", "70");

        caretaker.save(editor);
        editor.display();

        editor.setText("This is 4th revision.");
        editor.setCursor("4", "10");
        editor.display();

        caretaker.undo(editor);
        editor.display();

        caretaker.undo(editor);
        editor.display();
    }
}
