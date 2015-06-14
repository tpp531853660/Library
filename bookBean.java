package library;

import java.sql.ResultSet; 
import javax.swing.JOptionPane; 
import library.DatabaseConn;  
public class bookBean {  
	String sql; 
 ResultSet rs = null;   
 String sid;  
 String sname;  
 String sowner;  
 String sstatus;  
 String suser;   
 String colName;  
 String colValue;   
 //-----------------���ͼ����Ϣ------------------ 
 public void bookAdd(String id,String name,String owner){   
	 DatabaseConn DB = new DatabaseConn();   
	 this.sid = id;   
	 this.sname = name;   
	 this.sowner = owner;   
	 this.sstatus = "����";   
	 this.suser = null;   
	 if(sid.equals("")){ 
   JOptionPane.showMessageDialog(null,"������ͼ��ID","����",JOptionPane.ERROR_MESSAGE);    
   return;   
   }   
	 else{    
		 sql = "insert into book(book_id,book_name,book_owner,book_status,book_user)values('"+sid+"','"+sname+"','"+sowner+"','"+sstatus+"','"+suser+"')";
		try{DB.OpenConn(); 
    DB.executeUpdate(sql); 
    JOptionPane.showMessageDialog(null,"�ɹ����һ����¼!");    
    }
		 catch (Exception e){ 
    System.out.println(e); 
    JOptionPane.showMessageDialog(null,"����ʧ��!","����",JOptionPane.ERROR_MESSAGE); 
   }
		 finally {DB.closeStmt();DB.closeConn();
		 }   
		 }  
	 } 
 //-----------------�޸�ͼ����Ϣ------------------ 
 public void bookModify(String id,String name,String owner){   
	 DatabaseConn DB = new DatabaseConn();   
	 this.sid = id;   
	 this.sname = name;   
	 this.sowner = owner;   
	 if(sid.equals("")){ 
   JOptionPane.showMessageDialog(null,"������ͼ��ID","����",JOptionPane.ERROR_MESSAGE);    
   return;   
   }   
	 else{ 
   sql = "update book set book_name='"+sname+"',book_owner='"+sowner+"' where book_id= "+sid+""; 
   try{
	   DB.OpenConn(); 
    DB.executeUpdate(sql); 
    JOptionPane.showMessageDialog(null,"�ɹ��޸�һ����¼!");    
    }
   catch (Exception e){ 
    System.out.println(e); 
    JOptionPane.showMessageDialog(null,"����ʧ��!","����",JOptionPane.ERROR_MESSAGE); 
   }
   finally {DB.closeStmt();DB.closeConn();
   }   
   }  
	 } 
 //-----------------ɾ��ͼ����Ϣ------------------  
 public void bookDel(String id){ 
  DatabaseConn DB = new DatabaseConn();   
  this.sid = id; 
  sql = "delete from book where book_id = "+id+"";   
  try{DB.OpenConn(); 
   DB.executeUpdate(sql); 
   JOptionPane.showMessageDialog(null,"�ɹ�ɾ��һ����¼!"); 
  }
  catch (Exception e){ 
	   System.out.println(e); 
	   JOptionPane.showMessageDialog(null,"ɾ��ʧ��!","����",JOptionPane.ERROR_MESSAGE); 
	  }
  finally {DB.closeStmt();DB.closeConn();}  
  }   
	 //------------����ָ��ID��ѯͼ����Ϣ------------------   
 public String [][]bookSearch(String id){    
	 this.colValue = id; 
	   DatabaseConn DB = new DatabaseConn();    
	   String [][] sn = null;    
	   int row = 0;    
	   int i = 0; 
	   sql = "select * from book where book_id="+colValue+"";    
	   try{ 
	    DB.OpenConn(); 
	    rs  = DB.executeQuery(sql); 
	    if(rs.last()){ row = rs.getRow();     
	    } 
	    if(row == 0)     {sn = null;}     else 
	    { 
	    	sn  = new String[row][5];     
	    	rs.first();      
	    	rs.previous();      
	    	while(rs.next()) 
	     { 
	    		sn[i][0] = rs.getString("book_id");       
	    		sn[i][1] = rs.getString("book_name");       
	    		sn[i][2] = rs.getString("book_owner");       
	    		sn[i][3] = rs.getString("book_status");       
	    		sn[i][4] = rs.getString("book_user");       
	    		i++;      
	    		}     
	    	} 
	   }
	   catch (Exception e) {} 
	   finally {DB.closeStmt();DB.closeConn();}   
	   return sn;   
	   } 
	  //-----------------����ͼ��------------------   
 public void bookBook1(String name,String user){    
	 DatabaseConn DB = new DatabaseConn();    
	 this.sname = name;    
	 this.suser = user;    
	 String temp ="�ѽ�"; 
	 if(sname.equals("")){ 
	    JOptionPane.showMessageDialog(null,"������ͼ������","����",JOptionPane.ERROR_MESSAGE);     
	    return;    
	    }    
	 else{     
		 sql = "update book set book_status='"+temp+"',book_user='"+suser+"' where book_name= '"+sname+"'";     
		 try{DB.OpenConn(); 
	     DB.executeUpdate(sql); 
	     JOptionPane.showMessageDialog(null,"�ɹ�����!");     
	     }
		 catch (Exception e){ 
	     System.out.println(e); 
	     JOptionPane.showMessageDialog(null,"����ʧ��!","����",JOptionPane.ERROR_MESSAGE); 
	    }
		 finally {
			 DB.closeStmt();DB.closeConn();
	    }    
		 }   
	 } 
	  //-----------------�黹ͼ��------------------   
 public void bookReturn1(String name){ 
	   DatabaseConn DB = new DatabaseConn();    
	   this.sname = name;    
	   String temp ="����";    
	   String temp2 =null;   
	   if(sname.equals("")){ 
	    JOptionPane.showMessageDialog(null,"������ͼ������","����",JOptionPane.ERROR_MESSAGE);     
	    return;    
	    }    
	   else{     
		   sql = "update book set book_status='"+temp+"',book_user='"+temp2+"' where book_name= '"+sname+"'";     
		   try{DB.OpenConn(); 
	     DB.executeUpdate(sql); 
	     JOptionPane.showMessageDialog(null,"�ɹ��黹!");     
	     }
		   catch (Exception e){ 
	     System.out.println(e); 
	     JOptionPane.showMessageDialog(null,"�黹ʧ��!","����",JOptionPane.ERROR_MESSAGE); 
	    }
		   finally {DB.closeStmt();DB.closeConn();}    
		   }   
	   } 
	  //------------��ʾȫ��ͼ����Ϣ-------------   
 public String [][]bookAllSearch(){
	 DatabaseConn DB = new DatabaseConn();    
	 String [][] sn = null;    
	 int row = 0;    
	 int i = 0; 
 sql = "select *from book";    
 try{ 
	    DB.OpenConn(); 
	    rs  = DB.executeQuery(sql); 
	    if(rs.last()){row = rs.getRow();     
	    } 
	    if(row == 0)     
	    {sn = null;}     
	    else 
	    {   
	    	sn  = new String[row][6];      
	    	rs.first();      
	    	rs.previous();      
	    	while(rs.next()) 
	     { 
	    		sn[i][0] = rs.getString("book_id");       
	    		sn[i][1] = rs.getString("book_name");       
	    		sn[i][2] = rs.getString("book_owner");       
	    		sn[i][3] = rs.getString("book_status");       
	    		sn[i][4] = rs.getString("book_user");       
	    		i++;      
	    		}     
	    	} 
	   }
 catch (Exception e) {} 
 finally {DB.closeStmt();DB.closeConn();
 }    
 return sn; 
	  } 
}
