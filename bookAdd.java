package library;
import java.awt.*; 
import java.awt.event.*; 

import javax.swing.*; 
public class bookAdd extends JFrame implements ActionListener{
	Container c; 
	 JLabel jLabel1 = new JLabel();  
	 JLabel jLabel2 = new JLabel();  
	 JLabel jLabel3 = new JLabel();  
	 JLabel jLabel4 = new JLabel();  
	 JLabel jLabel5 = new JLabel(); 
	 JTextField sid = new JTextField(10);  
	 JTextField sname = new JTextField(10);  
	 JTextField sowner = new JTextField(10); 
	 JTextField sstatus = new JTextField(10); 
	 JTextField suser = new JTextField(10);  
	 JButton addconfirm = new JButton();   
	 public void bookAdd(){ 
	  this.setTitle("����ͼ����Ϣ");   
	  this.setResizable(false); 
	  try{Init();}catch (Exception e){
		  e.printStackTrace();
		  }   //���þ��� 
	  }
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
	  this.setLocation((int)(screenSize.width - 400)/2,(int)(screenSize.height - 300)/2 +45);  
	  }   
	 public void Init() throws Exception{   
		 this.setSize(300,500);   
		 c = this.getContentPane();   
		 c.setLayout(new FlowLayout());   
		 jLabel1.setText("ͼ��ID: "); 
	  jLabel1.setFont(new Font("Dialog",0,12));   
	  c.add(jLabel1);   sid.setText(null); 
	  sid.setFont(new Font("Dialog",0,12));   
	  c.add(sid);    
	  jLabel2.setText("ͼ������: "); 
	  jLabel2.setFont(new Font("Dialog",0,12));
	  c.add(jLabel2); 
	  sname.setText(null); 
	  sname.setFont(new Font("Dialog",0,12));  
	  c.add(sname);    
	  jLabel3.setText("ͼ��������: "); 
	  jLabel3.setFont(new Font("Dialog",0,12));   
	  c.add(jLabel3); 
	  sowner.setText(null); 
	  sowner.setFont(new Font("Dialog",0,12));   
	  c.add(sowner);    
	  addconfirm.setText("ȷ������"); 
	  addconfirm.setFont(new Font("Dialog",0,12));   
	  c.add(addconfirm); 
	  addconfirm.addActionListener(this);  
	  }   
	 public void actionPerformed(ActionEvent e){   
		 Object obj = e.getSource();  
		 if(obj == addconfirm){ 
	   bookBean rs = new bookBean(); 
	   rs.bookAdd(sid.getText(),sname.getText(),sowner.getText());    
	   this.dispose();   
	   }
		 }
	 } 