package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldLocation;
	private JTextField textFieldPhoneNumber;
	private JTextField textFieldProduct;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground frame = new CompanyBackground();
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
	public CompanyBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1297, 716);
		contentPane.add(panel);
		
		JLabel lblCompanyName = new JLabel("Company Name:");
		lblCompanyName.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblCompanyName.setBounds(185, 122, 342, 69);
		panel.add(lblCompanyName);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblLocation.setBounds(185, 235, 342, 69);
		panel.add(lblLocation);
		
		JLabel lblPhoneNo = new JLabel("Phone Number:");
		lblPhoneNo.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblPhoneNo.setBounds(185, 364, 342, 69);
		panel.add(lblPhoneNo);
		
		JLabel lblProduct = new JLabel("Product:");
		lblProduct.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblProduct.setBounds(185, 493, 342, 69);
		panel.add(lblProduct);
		
		JLabel lblCompanyBackground = new JLabel("Company Background");
		lblCompanyBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyBackground.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblCompanyBackground.setBounds(380, 31, 470, 69);
		panel.add(lblCompanyBackground);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//Action for button Exit
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Company Background", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					AdminMenu a = new AdminMenu();		//Button Exit connect to the Admin Menu
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(914, 592, 192, 61);
		panel.add(btnExit);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Rockwell", Font.PLAIN, 40));
		textFieldName.setBounds(626, 122, 342, 69);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldLocation = new JTextField();
		textFieldLocation.setFont(new Font("Rockwell", Font.PLAIN, 40));
		textFieldLocation.setColumns(10);
		textFieldLocation.setBounds(626, 235, 342, 69);
		panel.add(textFieldLocation);
		
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setFont(new Font("Rockwell", Font.PLAIN, 40));
		textFieldPhoneNumber.setColumns(10);
		textFieldPhoneNumber.setBounds(626, 364, 342, 69);
		panel.add(textFieldPhoneNumber);
		
		textFieldProduct = new JTextField();
		textFieldProduct.setFont(new Font("Rockwell", Font.PLAIN, 40));
		textFieldProduct.setColumns(10);
		textFieldProduct.setBounds(626, 493, 342, 69);
		panel.add(textFieldProduct);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {	//Action for button Save
			public void actionPerformed(ActionEvent e) {
				if(textFieldName.getText().isEmpty() || textFieldLocation.getText().isEmpty() || textFieldProduct.getText().isEmpty()) {	//Validate the input in text field Company Name, Location and Product
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Company Name, Location and Product text field!");		//Action if input input in text field Company Name, Location and Product is wrong
				}else {
					try {	//3.2 Exception Handling
						Integer.parseInt(textFieldPhoneNumber.getText());	//Validate the input in text field Phone Number
						textFieldName.setEditable(false);		//Action of Save button when all validation passed
						textFieldLocation.setEditable(false);
						textFieldPhoneNumber.setEditable(false);
						textFieldProduct.setEditable(false);
					}catch(Exception e1) {		//Action when the input in text field Phone Number is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the Phone Number text field!");
					}
				}
			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnSave.setBackground(Color.YELLOW);
		btnSave.setBounds(149, 592, 192, 61);
		panel.add(btnSave);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {	//Action for button Reset
			public void actionPerformed(ActionEvent e) {
				textFieldName.setEditable(true);
				textFieldLocation.setEditable(true);
				textFieldPhoneNumber.setEditable(true);
				textFieldProduct.setEditable(true);
				textFieldName.setText("");
				textFieldLocation.setText("");
				textFieldPhoneNumber.setText("");
				textFieldProduct.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(414, 592, 192, 61);
		panel.add(btnReset);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {	//Action for button Upload
			public void actionPerformed(ActionEvent e) {
				if(textFieldName.getText().isEmpty() || textFieldLocation.getText().isEmpty() || textFieldProduct.getText().isEmpty()) {	//Validate the input in text field Company Name, Location and Product
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Company Name, Location and Product text field!");	//Action when input in text field Company Name, Location and Product is wrong
				}else {
					try {
						Integer.parseInt(textFieldPhoneNumber.getText());	//Validate the input of text field Phone Number
						try {		//3.2 Exception Handling	//Action if all validation passed
							File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\CompanyBackgroundData.txt");
							if(!file.exists()) {
								file.createNewFile();
								}
							FileWriter fw = new FileWriter(file.getAbsoluteFile());
							BufferedWriter bw = new BufferedWriter(fw);
								bw.write("Company Name: " + textFieldName.getText());
								bw.write("\n \n");
								bw.write("Location: " + textFieldLocation.getText());
								bw.write("\n \n");
								bw.write("Phone Number: " + textFieldPhoneNumber.getText());
								bw.write("\n \n");
								bw.write("Product: " + textFieldProduct.getText());
								bw.write("\n \n");
								bw.close();
								fw.close();
								JOptionPane.showMessageDialog(null, "Data Exported");
							}
							catch(Exception ex) {
								ex.printStackTrace();
							}
					}catch(Exception e1) {		//Action when input of text field Phone Number is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the Phone Number text field!");
					}
				}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnUpload.setBackground(Color.YELLOW);
		btnUpload.setBounds(658, 592, 209, 61);
		panel.add(btnUpload);
	}
}
