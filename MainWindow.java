import javax.swing.JFrame;

public class MainWindow extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MainWindow() {
        super("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
    }

    public void showTree(BinaryTree tree) {
        TreeOutputComponent component = new TreeOutputComponent();
        component.setTree(tree);
        add(component);
    }
}