package library;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class bookDel extends JFrame implements ActionListener{  
	Container c; 
JLabel jLabel1 = new JLabel(); 
JTextField sid = new JTextField(10);  
JButton delconfirm = new JButton();   
public bookDel(){ 
 this.setTitle("ɾ��ͼ����Ϣ");   
 this.setResizable(false); 
 try{Init();}catch (Exception e){e.printStackTrace();}   
 //���þ��� 
 }
 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
 this.setLocation((int)(screenSize.width - 400)/2,(int)(screenSize.height - 300)/2 +45);  
}
public void Init() throws Exception
{   
	this.setSize(300,500);   
	c = this.getContentPane();   
	c.setLayout(new FlowLayout()); 
 jLabel1.setText("Ҫɾ����ͼ��ID: "); 
 jLabel1.setFont(new Font("Dialog",0,12));   
 c.add(jLabel1);   sid.setText(null); 
 sid.setFont(new Font("Dialog",0,12));   
 c.add(sid);    
 delconfirm.setText("ȷ��ɾ��"); 
 delconfirm.setFont(new Font("Dialog",0,12));   
 c.add(delconfirm); 
 delconfirm.addActionListener(this);  
 }
public void actionPerformed(ActionEvent e){
	Object obj = e.getSource();   
	if(obj == delconfirm){ 
  bookBean rs = new bookBean();    
  rs.bookDel(sid.getText());    
  this.dispose();   
  }
 }
}
  