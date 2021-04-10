import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class GUI extends JFrame implements ActionListener {
    JPanel mainWindow = new JPanel();

    JSplitPane leftPane = new JSplitPane();
    JScrollPane classesPane = new JScrollPane();
    JSplitPane rightPane = new JSplitPane();
    JScrollPane constructPane = new JScrollPane();
    JSplitPane centerPane = new JSplitPane();
    JSplitPane countPane = new JSplitPane();

    JList constructList;
    JList methodList;

    JPanel constructToolbar;

    JToolBar header;

    BorderLayout bl1;
    BorderLayout bl2;
    BorderLayout bl3;
    BorderLayout bl4;

    /*
    The GUI contains a split pane, as shown below. The left hand side of the split pane displays all of the found classes.
    The right hand side shows the declared methods and constructors of a user selected class in the list.
    Feel free to take advantage of your previously developed javap-alike (skeleton) tool to facilitate this task.
     */

    public void createWindow() {
        // create window
        this.mainWindow = (JPanel)this.getContentPane();
        this.mainWindow.setLayout(this.bl1);
        this.setSize(new Dimension(508, 513));
        this.setTitle("Test Tool");
        // create toolbar
        // file, help
        // create second toolbar
        // left scroll panel
        this.leftPane.setLayout(bl2);
        this.rightPane.setLayout(bl3);
        this.mainWindow.add(this.leftPane, "left");
        this.mainWindow.add(this.rightPane, "right");
        this.mainWindow.add(this.centerPane, "center");

        // middle scroll panel
        // right scroll panel

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
