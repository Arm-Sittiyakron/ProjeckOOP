import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.ScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import java.awt.TextField;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;
import java.awt.Button;
import javax.swing.JMenuBar;
import java.awt.TextArea;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import java.awt.List;
import java.awt.Label;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setSize(1350, 750);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(316, 540, 500, 124);
		contentPane.add(textArea);
		
		Panel panel_9 = new Panel();
		panel_9.setBounds(860, 550, 30, 30);
		contentPane.add(panel_9);
		panel_9.setBackground(new Color(0, 255, 0));
		panel_9.setLayout(new CardLayout(0, 0));
		
		Label label = new Label("More Gas");
		label.setBackground(SystemColor.inactiveCaption);
		label.setBounds(900, 550, 65, 30);
		contentPane.add(label);
		
		Panel panel_10 = new Panel();
		panel_10.setBounds(860, 620, 30, 30);
		contentPane.add(panel_10);
		panel_10.setBackground(new Color(255, 255, 0));
		
		Label label_1 = new Label("Gas Medium");
		label_1.setBackground(SystemColor.inactiveCaption);
		label_1.setBounds(900, 620, 90, 21);
		contentPane.add(label_1);
		
		Panel panel_11 = new Panel();
		panel_11.setBounds(1020, 550, 30, 30);
		contentPane.add(panel_11);
		panel_11.setBackground(new Color(255, 0, 0));
		
		Label label_2 = new Label("No Gas");
		label_2.setBackground(SystemColor.inactiveCaption);
		label_2.setBounds(1060, 555, 59, 21);
		contentPane.add(label_2);
		
		Panel panel_12 = new Panel();
		panel_12.setBounds(1020, 620, 30, 30);
		contentPane.add(panel_12);
		panel_12.setBackground(new Color(255, 140, 0));
		
		Label label_3 = new Label("Gas Quite a Few");
		label_3.setBackground(SystemColor.inactiveCaption);
		label_3.setBounds(1060, 625, 90, 21);
		contentPane.add(label_3);
		
		Panel panel_8 = new Panel();
		panel_8.setBackground(SystemColor.inactiveCaption);
		panel_8.setBounds(850, 540, 420, 124);
		contentPane.add(panel_8);
		
		Panel panel = new Panel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 13, 300, 650);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setForeground(new Color(64, 64, 64));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(9, 10, 281, 79);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(72, 5, 199, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("File :");
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewJgoodiesLabel.setBounds(29, 8, 33, 13);
		panel_1.add(lblNewJgoodiesLabel);
		
		JButton btnNewButton = new JButton("Open File");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(72, 34, 75, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(186, 34, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaption);
		panel_3.setBounds(9, 96, 281, 165);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 40, 199, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(10, 69, 85, 21);
		panel_3.add(btnNewButton_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClear.setBounds(124, 69, 85, 21);
		panel_3.add(btnClear);
		
		Label label_4 = new Label("Input The depth of the abyss");
		label_4.setBounds(10, 13, 180, 21);
		panel_3.add(label_4);
		
		Label label_5 = new Label("m.");
		label_5.setBounds(212, 38, 59, 21);
		panel_3.add(label_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaption);
		panel_4.setBounds(9, 268, 280, 138);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		Label label_8 = new Label("Total :");
		label_8.setBounds(10, 10, 59, 21);
		panel_4.add(label_8);
		
		Label label_9 = new Label("Average :");
		label_9.setBounds(10, 40, 59, 21);
		panel_4.add(label_9);
		
		Label label_10 = new Label("Maximum :");
		label_10.setBounds(10, 67, 84, 21);
		panel_4.add(label_10);
		
		Label label_11 = new Label("Minimum :");
		label_11.setBounds(10, 94, 84, 21);
		panel_4.add(label_11);
		
		Label label_12 = new Label("0.00");
		label_12.setBounds(211, 10, 59, 21);
		panel_4.add(label_12);
		
		Label label_13 = new Label("0.00");
		label_13.setBounds(211, 40, 59, 21);
		panel_4.add(label_13);
		
		Label label_14 = new Label("0.00");
		label_14.setBounds(211, 67, 59, 21);
		panel_4.add(label_14);
		
		Label label_15 = new Label("0.00");
		label_15.setBounds(211, 94, 59, 21);
		panel_4.add(label_15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.inactiveCaption);
		panel_5.setBounds(9, 412, 280, 228);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(51, 204, 255));
		panel_6.setBounds(10, 5, 260, 100);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		Label label_6 = new Label("Gas AREA 0 m.");
		label_6.setBounds(92, 45, 111, 21);
		panel_6.add(label_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 153, 0));
		panel_7.setBounds(10, 120, 260, 100);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		Label label_7 = new Label("DISTANCE 0 m.");
		label_7.setBounds(88, 45, 111, 21);
		panel_7.add(label_7);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(SystemColor.windowBorder);
		panel_2.setBounds(316, 13, 954, 500);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMass = DefaultComponentFactory.getInstance().createLabel("Massage");
		lblMass.setBounds(316, 518, 90, 16);
		contentPane.add(lblMass);
		lblMass.setFont(new Font("Tahoma", Font.PLAIN, 13));
	}
}
