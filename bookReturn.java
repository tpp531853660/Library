package library;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;  
public class bookReturn extends JFrame implements ActionListener{  
	Container c; 
 JLabel jLabel1 = new JLabel(); 
 JTextField sname = new JTextField(10);  
 JButton reconfirm = new JButton();   
 public bookReturn(){ 
  this.setTitle("�黹ͼ��");   
  this.setResizable(false); 
  try{Init();
  }
  catch (Exception e){e.printStackTrace();}   //���þ��� 
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
  this.setLocation((int)(screenSize.width - 400)/2,(int)(screenSize.height - 300)/2 +45);  
  }   
 public void Init() throws Exception{   
	 this.setSize(300,500);   
	 c = this.getContentPane();   
	 c.setLayout(new FlowLayout());   
	 jLabel1.setText("�黹ͼ������: "); 
  jLabel1.setFont(new Font("Dialog",0,12));   
  c.add(jLabel1); 
  sname.setText(null); 
  sname.setFont(new Font("Dialog",0,12));   
  c.add(sname);    
  reconfirm.setText("ȷ��"); 
  reconfirm.setFont(new Font("Dialog",0,12));   
  c.add(reconfirm); 
  reconfirm.addActionListener(this);  
  }   
 public void actionPerformed(ActionEvent e){   
	 Object obj = e.getSource();   
	 if(obj == reconfirm){ 
   bookBean rs = new bookBean();    
   rs.bookReturn1(sname.getText());    
   this.dispose();   
   } 
	 } 
 }  