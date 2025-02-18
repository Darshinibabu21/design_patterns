package MEMENTO;

public class main {
    public static void main(String[] args) {
        texteditor editor=new texteditor();
        history h=new history();

        editor.setcontent("hello world!");
        h.savestate(editor.save());
        System.out.println("current content: " + editor.getcontent());

        editor.setcontent("hello everyone!");
        h.savestate(editor.save());
        System.out.println("current content: " + editor.getcontent());

        editor.restore(h.undo());
        System.out.println("after undo: " + editor.getcontent());

        editor.restore(h.undo());
        System.out.println("after undo: " + editor.getcontent());

    }
}
