package packageArray;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


//exercise 2


public class Lights  extends JFrame{
	JRadioButton jRadioButton0;

   
    JRadioButton jRadioButton1;
  
 
    JRadioButton jRadioButton2;
  
   
    JButton jButton;
  
   
    ButtonGroup G1;
  
   
  
    
    public Lights()
    {
  
    
        this.setLayout(null);
        
        jRadioButton0 = new JRadioButton();
  
      
        jRadioButton1 = new JRadioButton();
  
      
        jRadioButton2 = new JRadioButton();
  
       
        jButton = new JButton("Click");
  

        G1 = new ButtonGroup();
  
       
        jRadioButton0.setText("RED");
        jRadioButton0.setBackground(Color.RED);
        
        jRadioButton1.setText("YELLOW");
        jRadioButton1.setBackground(Color.YELLOW);
       
        jRadioButton2.setText("GREEN");
        jRadioButton2.setBackground(Color.GREEN);
       
        jRadioButton0.setBounds(20, 30, 100, 50);
        
        
        jRadioButton1.setBounds(120, 30, 120, 50);
  
      
        jRadioButton2.setBounds(250, 30, 80, 50);
  
    
        jButton.setBounds(125, 90, 80, 30);
  
        
        this.add(jRadioButton0);
        
        
        this.add(jRadioButton1);
  
  
        this.add(jRadioButton2);
  
        this.add(jButton);
        
        G1.add(jRadioButton0);
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
//        jRadioButton0.addActionListener(this);
//        jRadioButton1.addActionListener(this);
//        jRadioButton2.addActionListener(this);
        jButton.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	             if(jRadioButton0.isSelected()) {
        	            	 System.out.println("STOP");
        	             }else if(jRadioButton1.isSelected()) {
        	            	 System.out.println("WAIT");
        	             }else if(jRadioButton2.isSelected()) {
        	            	 System.out.println("GO");
        	             }
        	        }  
        	    }); 
}
}