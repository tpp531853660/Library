package library;

import java.awt.*; 
import java.awt.event.*; 

import javax.*;  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class bookSearch extends JFrame implements ActionListener{  
	Container c; 
 JLabel jLabel1 = new JLabel(); 
 JTextField sFrom = new JTextField(4);  
 JButton confirm = new JButton();   
 public bookSearch(){ 
  this.setTitle("��ͼ��ID��ѯ");   
  this.setResizable(false); 
  try{Init();}catch (Exception e){e.printStackTrace();}   //���þ��� 
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
  this.setLocation((int)(screenSize.width - 400)/2,(int)(screenSize.height - 300)/2 +45);  
  }   
 public void Init() throws Exception{   
	 this.setSize(300,500);   
	 c = this.getContentPane();   
	 c.setLayout(new FlowLayout()); 
  jLabel1.setText("������ͼ��ID: "); 
  jLabel1.setFont(new Font("Dialog",0,12));   
  c.add(jLabel1); 
  sFrom.setText(null); 
  sFrom.setFont(new Font("Dialog",0,12));   
  c.add(sFrom); 
  confirm.setText("ȷ��"); 
  confirm.setFont(new Font("Dialog",0,12));   
  c.add(confirm); 
  confirm.addActionListener(this);  
  }   
 public void actionPerformed(ActionEvent e){   
	 Object obj = e.getSource(); 
 if(obj == confirm){ 
	   Resultbook rs = new Resultbook();    
	   this.dispose();   
	   }  
 } 
 } 