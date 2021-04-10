import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 *
 * @author Mio,
 * @version 1.0
 *
 * @see java.awt.event.ActionListener
 * @see java.awt.event.ActionEvent
 * @see java.awt
 * @see javax.swing
 *
 *
 */
public class GUI extends JFrame implements ActionListener {
    JPanel window; // main window
    // scroll view areas for method,construct,
    JSplitPane methodPane = new JSplitPane();
    JScrollPane methodView = new JScrollPane();
    JScrollPane constructView = new JScrollPane();
    // panels
    JPanel leftPanel = new JPanel();
    JPanel constructToolbar = new JPanel();
    JPanel rightPanel = new JPanel();
    JPanel methodToolbar = new JPanel();
    JToolBar header = new JToolBar(); // top toolbar showing current open class
    // layouts
    BorderLayout borderLayout1 = new BorderLayout();
    BorderLayout borderLayout2 = new BorderLayout();
    BorderLayout borderLayout3 = new BorderLayout();

    JList constructList = new JList();
    JList methodList = new JList();

    // Object Button
    JLabel construct = new JLabel();
    // Method run button
    JLabel mtdLabel = new JLabel();

    JLabel classLabel = new JLabel();
    //JTextField testClass = new JTextField();

    /**
     * Create GUI window and all components
     */
    public void createWindow() {
        // Begin main window //
        this.window = (JPanel)this.getContentPane();
        this.window.setLayout(this.borderLayout1);
        this.setSize(new Dimension(508, 513));
        this.setTitle("FUNCTIONAL TESTING TOOL");
        // Begin select class tool bar //
        this.header.add(this.classLabel, (Object)null);
        this.classLabel.setText(" File ");
        // Constructor left window view //
        this.leftPanel.setLayout(this.borderLayout3);
        this.leftPanel.setMinimumSize(new Dimension(220, 163));
        this.leftPanel.setPreferredSize(new Dimension(258, 163));
        this.leftPanel.add(this.constructView, "Center");
        this.leftPanel.add(this.constructToolbar, "North");

        this.constructToolbar.add(this.construct, (Object)null);
        this.constructView.getViewport().add(this.constructList, (Object)null);
        // Right view //
        this.methodView.setPreferredSize(new Dimension(258, 150));
        this.methodView.getViewport().add(this.methodList, (Object)null);
        this.rightPanel.setLayout(this.borderLayout2);
        this.rightPanel.add(this.methodView, "Center");
        this.rightPanel.add(this.methodToolbar, "North");
        // Method Button and label
        this.mtdLabel.setRequestFocusEnabled(true);
        this.mtdLabel.setText("Methods & Constructors");
        this.construct.setText("Found Classes");
        // run clicked call run method

        // add button and label to panel
        this.methodToolbar.add(this.mtdLabel, (Object)null);
        this.methodPane.add(this.leftPanel, "left");
        this.methodPane.add(this.rightPanel, "right");
        // add views to window //
        this.window.add(this.methodPane, "Center");
        this.window.add(this.header, "North");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /*
    The GUI contains a split pane, as shown below. The left hand side of the split pane displays all of the found classes.
    The right hand side shows the declared methods and constructors of a user selected class in the list.
    Feel free to take advantage of your previously developed javap-alike (skeleton) tool to facilitate this task.
     */


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
