/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Jazz
 */
public class SystemUI extends JFrame implements ActionListener{
    
    //Components
    //Buttons: AddCustomer, DealershipInfo, CarInfo, Edit, Exit
    //Labels: Ford Service Bulletin
    // TextFields: Name, Car, Dealership, Issues, ServiceDate, phone Number
    //Table: Table of Customers
    //Dialogue Box: Dealer, Add Customer, Car Info
    
    //TextFields
    private JTextField txtfName;
    private JTextField txtfCar;
    private JTextField txtfDealership;
    private JTextField txtfIssues;
    private JTextField txtfServiceDate;
    private JTextField txtfPhoneNumber;
    
    
    //Buttons
    private JButton btnAddCustomer;
    private JButton btnDealershipInfo;
    private JButton btnCarInfo;
    private JButton btnEdit;
    private JButton btnExit;
    private JButton btnCancel;
    private JButton btnConfirm;
    
    
    //Labels
    private JLabel lblFordServiceBulletin;
    private JLabel lblName;
    private JLabel lblCar;
    private JLabel lblDealership;
    private JLabel lblIssues;
    private JLabel lblServiceDate;
    private JLabel lblPhoneNumber;
    
    //Tables
    private JTable tblCustomerTable;
    
    //Dialog box
    private JDialog dialog;
    
    //JPanels
    
    private JPanel inputPanel; // for inputs
    private JPanel commandPanel; // for buttons
    private JPanel tablePanel;
    
    public SystemUI(){
        this.setTitle("Ford System UI");
        this.setSize(600,270);
        this.setPreferredSize(new Dimension(600,370));
        this.setLocation(200,300);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setupInputs();
        
        setupTable();
        
        
        setupCommands();
                
        pack();
        
    }
    
    private void setupInputs(){
        //Jpanel
        this.inputPanel = new JPanel();
        this.inputPanel.setPreferredSize(new Dimension(560,150));
        this.inputPanel.setBorder(BorderFactory.createTitledBorder("Inputs"));
        
        //Ford Label
        this.lblFordServiceBulletin = new JLabel("Ford Service Bulletin");
        this.lblFordServiceBulletin.setPreferredSize(new Dimension(120,30));
        this.inputPanel.add(this.lblFordServiceBulletin);
        
        //Add Customer Button
        this.btnAddCustomer = new JButton("Add Customer");
        this.btnAddCustomer.setPreferredSize(new Dimension(120,30));
        this.btnAddCustomer.addActionListener(this);
        this.inputPanel.add(this.btnAddCustomer);
        
        //Add 
        this.add(this.inputPanel);
        
        //JOptionPane.showInputDialog("Type In your name");
    }
    private void setupTable(){
        this.tablePanel = new JPanel();
        this.tablePanel.setPreferredSize(new Dimension(560,150));
        this.tablePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        Customer CustomerOne = new Customer("Jason", "Mustang", "Sterling", "blown Engine","10/30/19", 555);
        Object Head[] = {"Service Date","Name", "Car", "Dealership", "Phone Number", "Issue"};
        DefaultTableModel tableModel = new DefaultTableModel(Head,0);
        Object[] data = {CustomerOne.Name,CustomerOne.Car,CustomerOne.Dealership,CustomerOne.Issue,CustomerOne.ServiceDate,CustomerOne.PhoneNumber};
        tableModel.addRow(data);
        //Object Data[][] = {{"october", "Jason", "Mustang", "Sterling", "5555555555", "Blown Engine"}};
        this.tblCustomerTable = new JTable(tableModel);
        this.tblCustomerTable.setPreferredSize(new Dimension(540,140));
        
        
        this.tablePanel.add(new JScrollPane(this.tblCustomerTable));
        
        
        //Add
        this.add(this.tablePanel);
    }
    
    
    private void setupCommands(){
        
    }
    
    private void SetupDialog(){
        dialog = new JDialog();
        
        dialog.setSize(new Dimension(500,500));
        
        dialog.setResizable(false);
        dialog.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.btnConfirm = new JButton("Confirm");
        this.btnConfirm.addActionListener(this);
        
        this.btnCancel = new JButton("Cancel");
        this.btnCancel.addActionListener(this);
      
        
        //Variables
        String ServiceDate;
        String Name;
        String Car;
        String Dealership;
        String PhoneNumber;
        String Issues;
        
        
        
         //ServiceDate
        this.lblServiceDate = new JLabel("Service Date:");
        dialog.add(this.lblServiceDate);
        this.txtfServiceDate = new JTextField();
        this.txtfServiceDate.setPreferredSize(new Dimension(50,20));
        dialog.add(this.txtfServiceDate);
        
        //Name
        this.lblName = new JLabel("Name:");
        dialog.add(this.lblName);
        this.txtfName= new JTextField();
        this.txtfName.setPreferredSize(new Dimension(50,20));
        dialog.add(this.txtfName);
        
        //Car
        this.lblCar = new JLabel("Car:");
        dialog.add(this.lblCar);
        this.txtfCar = new JTextField();
        this.txtfCar.setPreferredSize(new Dimension(50,20));
        dialog.add(this.txtfCar);
        
        //Dealership
        this.lblDealership = new JLabel("Dealership:");
        dialog.add(this.lblDealership);
        this.txtfDealership = new JTextField();
        this.txtfDealership.setPreferredSize(new Dimension(50,20));
        dialog.add(this.txtfDealership);
        
        //PhoneNumber
        this.lblPhoneNumber = new JLabel("Phone Number:");
        dialog.add(this.lblPhoneNumber);
        this.txtfPhoneNumber = new JTextField();
        this.txtfPhoneNumber.setPreferredSize(new Dimension(50,20));
        dialog.add(this.txtfPhoneNumber);
        
        //Issues
        this.lblIssues = new JLabel("Issues:");
        dialog.add(this.lblIssues);
        this.txtfIssues = new JTextField();
        this.txtfIssues.setPreferredSize(new Dimension(250,20));
        dialog.add(this.txtfIssues);
        
        
        
        
        dialog.add(this.btnConfirm);
        dialog.add(this.btnCancel);
        //dialog.setSize(400,400);
        dialog.pack();
        dialog.setVisible(true);
        
        
    }
    
    @Override
    /**
     * 
     * Function to handle Click Events
     * @param event
     */
    public void actionPerformed(ActionEvent event){
        Object src = event.getSource();
        
        if(src.equals(this.btnAddCustomer)){
            SetupDialog();
            
        }
        else if(src.equals(this.btnConfirm)){
            String ServiceDate= this.txtfServiceDate.getText();
            String Name =  this.txtfName.getText();
            String Car = this.txtfCar.getText();
            String Dealership = this.txtfDealership.getText();
            String PhoneNumber = this.txtfPhoneNumber.getText();
            String Issues = this.txtfIssues.getText();
            dialog.dispose();
            System.out.println(ServiceDate);
            System.out.println(Name);
            System.out.println(Car);
            System.out.println(Dealership);
            System.out.println(PhoneNumber);
            System.out.println(Issues);
            
            
            
        }    
        else if(src.equals(this.btnCancel)){
                dialog.dispose();
                
            }
        }
    }
    

