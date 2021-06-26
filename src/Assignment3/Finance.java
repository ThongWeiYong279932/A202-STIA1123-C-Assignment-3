package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldRevenue;
	private JTextField textFieldCostGood;
	private JTextField textFieldOperateExpense;
	private JTextField textFieldTaxes;
	private JTextField textFieldYear;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
	}
	
	Finance(double totalMarketingCost, double totalSalary){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1306, 729);
		contentPane.add(panel);
		
		JLabel lblFinance = new JLabel("Finance");
		lblFinance.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinance.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblFinance.setBounds(553, 46, 205, 39);
		panel.add(lblFinance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(82, 121, 461, 401);
		panel.add(panel_1);
		
		JLabel lblRevenue = new JLabel("Revenue");
		lblRevenue.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblRevenue.setBounds(35, 149, 124, 24);
		panel_1.add(lblRevenue);
		
		JLabel lblCostGoods = new JLabel("Cost Of Goods");
		lblCostGoods.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblCostGoods.setBounds(35, 210, 157, 24);
		panel_1.add(lblCostGoods);
		
		JLabel lblOperatingExpense = new JLabel("Operating Expense");
		lblOperatingExpense.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblOperatingExpense.setBounds(35, 274, 188, 24);
		panel_1.add(lblOperatingExpense);
		
		JLabel lblTax = new JLabel("Taxes");
		lblTax.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblTax.setBounds(35, 333, 124, 24);
		panel_1.add(lblTax);
		
		textFieldRevenue = new JTextField();
		textFieldRevenue.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldRevenue.setColumns(10);
		textFieldRevenue.setBounds(237, 149, 187, 24);
		panel_1.add(textFieldRevenue);
		
		textFieldCostGood = new JTextField();
		textFieldCostGood.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldCostGood.setColumns(10);
		textFieldCostGood.setBounds(237, 210, 187, 24);
		panel_1.add(textFieldCostGood);
		
		textFieldOperateExpense = new JTextField();
		textFieldOperateExpense.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldOperateExpense.setColumns(10);
		textFieldOperateExpense.setBounds(237, 274, 187, 24);
		panel_1.add(textFieldOperateExpense);
		double operatingExpense = totalMarketingCost + totalSalary;
		textFieldOperateExpense.setText(Double.toString(operatingExpense));
		
		textFieldTaxes = new JTextField();
		textFieldTaxes.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldTaxes.setColumns(10);
		textFieldTaxes.setBounds(237, 333, 187, 24);
		panel_1.add(textFieldTaxes);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblYear.setBounds(35, 30, 124, 24);
		panel_1.add(lblYear);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblMonth.setBounds(35, 92, 124, 24);
		panel_1.add(lblMonth);
		
		textFieldYear = new JTextField();
		textFieldYear.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(237, 36, 187, 24);
		panel_1.add(textFieldYear);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"Select the month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBoxMonth.setFont(new Font("Rockwell", Font.PLAIN, 20));
		comboBoxMonth.setBounds(237, 94, 187, 26);
		panel_1.add(comboBoxMonth);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_1_1.setBackground(new Color(255, 165, 0));
		panel_1_1.setBounds(553, 121, 691, 401);
		panel.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 671, 381);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {		//Action when the table is clicked
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					textFieldYear.setText(model.getValueAt(i,0).toString());		//Data in selected row is transfered to input
					comboBoxMonth.setSelectedItem(model.getValueAt(i,1).toString());
					textFieldRevenue.setText(model.getValueAt(i,2).toString());
					textFieldCostGood.setText(model.getValueAt(i,3).toString());
					textFieldOperateExpense.setText(model.getValueAt(i,5).toString());
					textFieldTaxes.setText(model.getValueAt(i,7).toString());
					JOptionPane.showMessageDialog(null, "Update Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Year", "Month", "Revenue", "Cost of Goods", "Gross Profit", "Operating Expense", "Operating Income", "Taxes", "Net Income"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_1_1_1.setBackground(new Color(255, 165, 0));
		panel_1_1_1.setBounds(82, 559, 1162, 124);
		panel.add(panel_1_1_1);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Add
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(comboBoxMonth.getSelectedItem().toString().equals("Select the month")) {		//Validate whether the month in combo box is selected or not
					JOptionPane.showMessageDialog(null, "Wrong Input! Please choose a month!");	//Action if month is not selected
				}
				else {
					try {	//3.2 Exception Handling
						Integer.parseInt(textFieldYear.getText());		//Validate the input of text field Year, Revenue, Cost of Goods, Operate Expense, and Taxes
						Double.parseDouble(textFieldRevenue.getText());
						Double.parseDouble(textFieldCostGood.getText());
						Double.parseDouble(textFieldOperateExpense.getText());
						Double.parseDouble(textFieldTaxes.getText());
						model.addRow(new Object[]{		//Action for button Add if all validation passed
								textFieldYear.getText(),
								comboBoxMonth.getSelectedItem(),
								textFieldRevenue.getText(),
								textFieldCostGood.getText(),
								Double.parseDouble(textFieldRevenue.getText()) - Double.parseDouble(textFieldCostGood.getText()),
								textFieldOperateExpense.getText(),
								Double.parseDouble(textFieldRevenue.getText()) - Double.parseDouble(textFieldCostGood.getText()) - Double.parseDouble(textFieldOperateExpense.getText()),
								textFieldTaxes.getText(),
								Double.parseDouble(textFieldRevenue.getText()) - Double.parseDouble(textFieldCostGood.getText()) - Double.parseDouble(textFieldOperateExpense.getText()) - Double.parseDouble(textFieldTaxes.getText()),
						});
						
						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Finance Update confirmed", "Finance Management System",
										JOptionPane.OK_OPTION);
							}
						}
						textFieldYear.setText("");
						comboBoxMonth.setSelectedItem("Select the month");
						textFieldRevenue.setText("");
						textFieldCostGood.setText("");
						textFieldTaxes.setText("");
					}catch(Exception e1) {		//Action when input of text field Year, Revenue, Cost of Goods, Operate Expense, and Taxes is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the text field Year and only real number in text field Revenue, Cost of Goods, Operating Expense and Taxes!");
					}
				}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdd.setBackground(Color.YELLOW);
		btnAdd.setBounds(21, 36, 115, 43);
		panel_1_1_1.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {		//Action for button Reset
			public void actionPerformed(ActionEvent e) {
				textFieldYear.setText("");
				comboBoxMonth.setSelectedItem("Select the month");
				textFieldRevenue.setText("");
				textFieldCostGood.setText("");
				textFieldOperateExpense.setText("");
				textFieldTaxes.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(169, 36, 115, 43);
		panel_1_1_1.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {		//Action for button Delete
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setBounds(452, 36, 115, 43);
		panel_1_1_1.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {		//Action for button Print
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPrint.setBackground(Color.YELLOW);
		btnPrint.setBounds(732, 36, 115, 43);
		panel_1_1_1.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {		//Action for button Exit
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					AdminMenu a = new AdminMenu();
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(1018, 36, 115, 43);
		panel_1_1_1.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {		//Action for button Update
			public void actionPerformed(ActionEvent e) {
				double grossProfit = 0;
				double operatingIncome = 0;
				double netIncome = 0;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(comboBoxMonth.getSelectedItem().toString().equals("Select the month")) {		//Validate whether month in the combo box is selected or not
					JOptionPane.showMessageDialog(null, "Wrong Input! Please choose a month!");	//Action if month is not selected
				}
				else {
					try {	//3.2 Exception Handling
						Integer.parseInt(textFieldYear.getText());		//Validate the input of text field Year, Revenue, Cost of Goods, Operate Expense, and Taxes
						Double.parseDouble(textFieldRevenue.getText());
						Double.parseDouble(textFieldCostGood.getText());
						Double.parseDouble(textFieldOperateExpense.getText());
						Double.parseDouble(textFieldTaxes.getText());
						int i = table.getSelectedRow();		//Action for button Update if all validation passed
					    if(i>=0) //if single row is selected than update
					    {
					    	model.setValueAt(textFieldYear.getText(),i,0);
					    	model.setValueAt(comboBoxMonth.getSelectedItem(),i,1);
					    	model.setValueAt(textFieldRevenue.getText(),i,2);
					    	model.setValueAt(textFieldCostGood.getText(), i, 3);
					    	grossProfit = Double.parseDouble(textFieldRevenue.getText()) - Double.parseDouble(textFieldCostGood.getText());
					    	model.setValueAt(Double.toString(grossProfit), i, 4);
					    	model.setValueAt(textFieldOperateExpense.getText(), i, 5);
					    	operatingIncome = grossProfit - Double.parseDouble(textFieldOperateExpense.getText());
					    	model.setValueAt(Double.toString(operatingIncome), i, 6);
					    	model.setValueAt(textFieldTaxes.getText(), i, 7);
					    	netIncome = operatingIncome - Double.parseDouble(textFieldTaxes.getText());
					    	model.setValueAt(Double.toString(netIncome), i, 8);
							JOptionPane.showMessageDialog(null, "Update Successfully");
					    }
					    else 
					    {
					    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
					    }
					}catch(Exception e1) {		//Action when input of text field Year, Revenue, Cost of Goods, Operate Expense, and Taxes is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the text field Year and only real number in text field Revenue, Cost of Goods, Operating Expense and Taxes!");
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setBounds(315, 36, 115, 43);
		panel_1_1_1.add(btnUpdate);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {	//Action for button Upload
			@Override
			public void actionPerformed(ActionEvent e) {
				try {		//3.2 Exception Handling
				File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\FinanceData.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				
				for (int i=0; i<table.getRowCount(); i++) {
					bw.write("Year: " + table.getModel().getValueAt(i, 0) + "\n");
					bw.write("Month: " + table.getModel().getValueAt(i, 1) + "\n");
					bw.write("Revenue: RM" + table.getModel().getValueAt(i, 2) + "\n");
					bw.write("Cost of Goods Sold: RM" + table.getModel().getValueAt(i, 3) + "\n");
					bw.write("Gross Profit: RM" + table.getModel().getValueAt(i, 4) + "\n");
					bw.write("Operating Expense: RM" + table.getModel().getValueAt(i, 5) + "\n");
					bw.write("Operating Income: RM" + table.getModel().getValueAt(i, 6) + "\n");
					bw.write("Taxes: RM" + table.getModel().getValueAt(i, 7) + "\n");
					bw.write("Net Income: RM" + table.getModel().getValueAt(i, 8) + "\n");
					bw.write("\n");
				}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpload.setBackground(Color.YELLOW);
		btnUpload.setBounds(590, 36, 115, 43);
		panel_1_1_1.add(btnUpload);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to go back to Employee Management", "Employee Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Employee a = new Employee(totalMarketingCost);		//Button Exit connect to Admin Menu
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBackground(Color.YELLOW);
		btnBack.setBounds(881, 36, 115, 43);
		panel_1_1_1.add(btnBack);
	}
}
