package library;
import java.awt.AWTEvent; 
import java.awt.BorderLayout; 
import java.awt.Container; 
import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent;  
import javax.swing.JFrame; 
import javax.swing.JMenu;
import javax.swing.JMenuBar; 
import javax.swing.JMenuItem; 

public class BookMain extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;  
	//----------�����˵���----------  
	JMenuBar mainMenu = new JMenuBar(); 
//--------------����ϵͳ����˵���--------------   
JMenu menuSystem = new JMenu(); 
JMenuItem itemExit = new JMenuItem();   
JMenu menubook = new JMenu();   
JMenu menuevent = new JMenu(); 
JMenuItem itemAdd  = new JMenuItem();   
JMenuItem itemEdit  = new JMenuItem();   
JMenuItem itemDelete  = new JMenuItem();   
JMenuItem itemSelect  = new JMenuItem();   
JMenuItem itemBook = new JMenuItem();   
JMenuItem itemReturn = new JMenuItem();   
JMenuItem itemDisplay = new JMenuItem();   
//------------��������ģ�����--------------   
public static bookInfo m_stu = new bookInfo();    
public void bookMain(){ 
 enableEvents(AWTEvent.WINDOW_EVENT_MASK); 
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 this.pack(); 
 this.setSize(600,480); 
 this.setTitle("ͼ�����ϵͳ");    
 try{ 
  Init(); 
 }
 catch (Exception e) {
	 e.printStackTrace();
	 }   
 }    
private void Init() throws Exception { 
 Container contentPane = this.getContentPane();    
 contentPane.setLayout(new BorderLayout());    //------��Ӳ˵���------- 
 menuSystem.setText("ϵͳ����"); 
 menuSystem.setFont(new Font("Dialog",0,12));    
 menubook.setText("ͼ����Ϣ����"); 
 menubook.setFont(new Font("Dialog",0,12));    
 menuevent.setText("ͼ����ͨ����"); 
 menuevent.setFont(new Font("Dialog",0,12));//---------����ϵͳ����˵���---------    itemExit.setText("�˳�"); 
 itemExit.setFont(new Font("Dialog",0,12));    //--------------����ѧ���˵���----------------    itemAdd.setText("����ͼ��"); 
 itemAdd.setFont(new Font("Dialog",0,12));    
 itemEdit.setText("�޸���Ϣ"); 
 itemEdit.setFont(new Font("Dialog",0,12));    
 itemDelete.setText("ɾ��ͼ��"); 
 itemDelete.setFont(new Font("Dialog",0,12));      
 itemSelect.setText("��ѯ"); 
 itemSelect.setFont(new Font("Dialog",0,12));    
 itemDisplay.setText("��ʾȫ����Ϣ"); 
 itemDisplay.setFont(new Font("Dialog",0,12)); 
//--------------���ɹ�������˵���----------------    
 itemBook.setText("ͼ�����"); 
 itemBook.setFont(new Font("Dialog",0,12));    
 itemReturn.setText("ͼ��黹"); 
 itemReturn.setFont(new Font("Dialog",0,12));    
 menuSystem.add(itemExit);    
 menubook.add(itemAdd);    
 menubook.add(itemEdit);    
 menubook.add(itemDelete);    
 menubook.add(itemSelect);     
 menubook.add(itemDisplay);    
 menuevent.add(itemBook);    
 menuevent.add(itemReturn);     
 //----��ϲ˵���--- 
 mainMenu.add(menuSystem);    
 mainMenu.add(menubook);    
 mainMenu.add(menuevent);    
 this.setJMenuBar(mainMenu);    
 //����¼����� 
 itemExit.addActionListener(this);    
 itemAdd.addActionListener(this);    
 itemEdit.addActionListener(this);    
 itemDelete.addActionListener(this);    
 itemSelect.addActionListener(this);    
 itemBook.addActionListener(this);    
 itemReturn.addActionListener(this);    
 itemDisplay.addActionListener(this);    
 setVisible(true); 
 this.addWindowListener(new WindowAdapter(){ 
  public void windowClosing(WindowEvent e){System.exit(0);}    
  }    
public void actionPerformed(ActionEvent e){    
	Object obj = e.getSource(); 
 if(obj == itemExit){System.exit(0);}    
 else if(obj == itemAdd){ 
  bookAdd asi = new bookAdd();         
  //asi.downInit();     
  asi.pack(); 
  asi.setVisible(true);    
  }
 else if(obj == itemEdit){ 
  bookEdit esi = new bookEdit();        
  //esi.downInit();     
  esi.pack(); 
  esi.setVisible(true);    
  }
 else if(obj == itemDelete){
	 bookDel dsi = new bookDel();     
	 //dsi.downInit();     
	 dsi.pack(); 
  dsi.setVisible(true);    
  }
 else if(obj == itemSelect){ 
  bookSearch sbid = new bookSearch();     
  sbid.pack(); 
  sbid.setVisible(true);    
  }
 else if(obj == itemBook){ 
  bookBook sboo = new bookBook();     
  sboo.pack(); 
  sboo.setVisible(true);    
  }
 else if(obj == itemReturn){ 
  bookReturn sre = new bookReturn();    
  sre.pack(); 
  sre.setVisible(true);    
  }
 else if(obj == itemDisplay){ 
  bookDisplay sre = new bookDisplay();     
  sre.pack(); 
  sre.setVisible(true);    
  }     
 } 
public static void main(String[] args){new bookMain();
} 
} 
