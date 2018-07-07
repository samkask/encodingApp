package encode64npn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIapp extends JFrame {

	private JPanel contentPane;
	private JToggleButton tglbtnSubmit;
	private JLabel lblInputString;
	private JTextField inputString;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblDecodedString;
	
	public String input;
	public String encodedOutput;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GUIapp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblInputString = new JLabel("Input String:");
		GridBagConstraints gbc_lblInputString = new GridBagConstraints();
		gbc_lblInputString.anchor = GridBagConstraints.EAST;
		gbc_lblInputString.insets = new Insets(0, 0, 5, 5);
		gbc_lblInputString.gridx = 1;
		gbc_lblInputString.gridy = 1;
		contentPane.add(lblInputString, gbc_lblInputString);
		
		inputString = new JTextField();
		inputString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				input = inputString.getText();
			}
		});
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		contentPane.add(inputString, gbc_textField);
		inputString.setColumns(10);
		
		tglbtnSubmit = new JToggleButton("SUBMIT");
		tglbtnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				encodedOutput = ENCODER.encode(inputString.getText());
				System.out.println(encodedOutput);
				textField_1.setText(encodedOutput);
				
			}
		});
		GridBagConstraints gbc_tglbtnSubmit = new GridBagConstraints();
		gbc_tglbtnSubmit.insets = new Insets(0, 0, 5, 0);
		gbc_tglbtnSubmit.gridx = 5;
		gbc_tglbtnSubmit.gridy = 2;
		contentPane.add(tglbtnSubmit, gbc_tglbtnSubmit);
		
		textField_1 = new JTextField();
		textField_1.setText(encodedOutput);
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridheight = 3;
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 4;
		contentPane.add(textField_1, gbc_textField_1);
		
		lblNewLabel = new JLabel("Encoded String: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 5;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		lblDecodedString = new JLabel("Decoded String: ");
		GridBagConstraints gbc_lblDecodedString = new GridBagConstraints();
		gbc_lblDecodedString.insets = new Insets(0, 0, 5, 5);
		gbc_lblDecodedString.gridx = 1;
		gbc_lblDecodedString.gridy = 7;
		contentPane.add(lblDecodedString, gbc_lblDecodedString);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 7;
		contentPane.add(textField_2, gbc_textField_2);
	}

}
