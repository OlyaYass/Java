import javax.swing.*;
import java.awt.*;

class GUI extends JFrame {

    JMenuBar menuBar = new JMenuBar();
    JMenu menu_new = new JMenu("New");
    JMenu menu_open = new JMenu("Open");
    JMenu menu_save = new JMenu("Save");
    JMenu menu_exit = new JMenu("Exit");

    public GUI() {
        super("Menu");
        setSize(300,250);
        setLayout(new FlowLayout());
        setJMenuBar(menuBar);
        menuBar.add(menu_new);
        menuBar.add(menu_open);
        menuBar.add(menu_save);
        menuBar.add(menu_exit);

        ICreateDocument documentFactory = createDocumentBySpecialty("text");
        IDocument document1 = documentFactory.createNew();
        IDocument document2 = documentFactory.createOpen();

        menu_new.add(new JMenuItem(document1.newDocument()));
        menu_open.add(new JMenuItem(document2.openDocument()));


    }

    public static ICreateDocument createDocumentBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("text"))
            return new TextDocumentFactory();
        else if (specialty.equalsIgnoreCase("music"))
            return new MusicDocumentFactory();
        else return new ImageDocumentFactory();
    }

    public static void main(String[]args) {
        GUI task = new GUI();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}