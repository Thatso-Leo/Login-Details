/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Leo
 */
public class LoginGUI extends JFrame{
    //panels
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel usernameAndPasswordPnl;
    private JPanel buttonPnl;
    private JPanel headingPnl;
    private JPanel mainPnl;
    
    //Labels
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JLabel headingLbl;
    
    //TextField
    private JTextField usernameTxtFld;
    private JTextField passwordTxtFld;
    
    //Button
    private JButton submitBtn;
    
    public LoginGUI(){
    //configure the frame
        setLayout(new BorderLayout());
        setTitle("User login page");
        setResizable(false);
        setSize(300,200);
        setForeground(Color.YELLOW);
        
        //create Panels
        usernamePnl= new JPanel(new FlowLayout());
        passwordPnl= new JPanel(new FlowLayout());
        
        usernameAndPasswordPnl=  new JPanel(new GridLayout(2,1));
        headingPnl= new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        buttonPnl= new JPanel(new FlowLayout());
        mainPnl= new JPanel(new BorderLayout());
        
        //create the Labels
        usernameLbl= new JLabel("Username: ");
        passwordLbl= new JLabel("Password: ");
        headingLbl= new JLabel("Login Details");
       
        //create the text fields
        usernameTxtFld= new JTextField(20);
        passwordTxtFld= new JTextField(20);
        
        //create the submit button
        submitBtn= new JButton("SUBMIT");
        
        //ADD THE NAME label and text field to the name panel
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtFld);
        
        //add the password label and text field to the password panel
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordTxtFld);
        
        //add the button to the panel
        buttonPnl.add(submitBtn);
        
        //add the username and password panel to the collective panel
        usernameAndPasswordPnl.add(usernamePnl);
        usernameAndPasswordPnl.add(passwordPnl);
        
        //add the heading label to the Heading Panel
        headingPnl.add(headingLbl);
        
        //add the panels to the main panel
        mainPnl.add(usernameAndPasswordPnl,BorderLayout.CENTER);
        mainPnl.add(buttonPnl,BorderLayout.SOUTH);
        
        //add the main panel to the frame's panel
        add(mainPnl,BorderLayout.CENTER);
        add(headingPnl,BorderLayout.NORTH);
                
        //set visbility
        setVisible(true);
    }
}
