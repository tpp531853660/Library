package library;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;  
public class Resultbook extends JFrame{  
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
 public Resultbook(String colname,String colvalue){   
	 this.sColValue = colvalue;   
	 this.sColName = colname; 
  this.setTitle("ͼ����Ϣ��ѯ���");   //--------��������λ�þ���--------- 
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
  this.setLocation((int)(screenSize.width - 400)/2,(int)(screenSize.height - 300)/2 +45);    
  bookBean rstu = new bookBean();   
  try{ 
   ��ֵ = rstu.bookSearch( sColValue);    
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
