package library;
import java.awt.*; 
import javax.swing.*; 
public class BookDisplay extends JFrame{  
	JLabel jLabel1 = new JLabel();  
	JButton jBExit = new JButton();  
	JScrollPane jScrollPane1;  
	JTable jTabstuInfo;  
	String sNum; 
String[] ���� = {"ͼ��ID","ͼ����","ͼ��������","ͼ��״̬","ʹ����"};  
String [][] ��ֵ;  
String sColValue;  
String sColName;  
String sFromValue; 
String sToValue; 
public void bookDisplay(){ 
	  this.setTitle("ѧ����Ϣ��ѯ���");   //--------��������λ�þ���--------- 
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
	  this.setLocation((int)(screenSize.width - 400)/2,(int)(screenSize.height - 300)/2 +45);    
	  bookBean rstu = new bookBean();   
	  try{ 
	   ��ֵ = rstu.bookAllSearch();    
	   if(��ֵ == null){ 
	    JOptionPane.showMessageDialog(null, "û�з��������ļ�¼");     
	    this.dispose();    
	    }
	   else
	   { 
	    jTabstuInfo = new JTable(��ֵ,����); 
	    jScrollPane1 = new JScrollPane(jTabstuInfo); 
	    this.getContentPane().add(jScrollPane1,BorderLayout.CENTER);     
	    this.pack(); 
	    this.setVisible(true);    
	    } 
	  }
	  catch (Exception e) {e.printStackTrace();}  
	  } 
} 
