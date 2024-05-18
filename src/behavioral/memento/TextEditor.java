package behavioral.memento;

// Originator. We can create interface for Originator, so that in Memento,
// we can use interface instead of this concrete class.
public class TextEditor {
    private String text, curX, curY;

    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(String curX, String curY) {
        this.curX = curX;
        this.curY = curY;
    }

    public TextEditorMemento createMemento() {
        return new TextEditorMemento(this, text, curX, curY);
    }

    public void restore(TextEditorMemento memento) {
        text = memento.getText();
        curX = memento.getCurX();
        curY = memento.getCurY();
    }

    public void display() {
        System.out.println("Text editor:" + text + " , curX:" + curX + " curY:" + curY);
    }
}
