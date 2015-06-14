package library;
import java.sql.Connection; 

import java.sql.DriverManager; 

import java.sql.ResultSet; 

import java.sql.SQLException; 

import java.sql.Statement;

public class DatabaseConn {
	private Statement stmt = null;  
	ResultSet rs = null; 
	 private Connection conn = null;  
	 String sql; 
	 public DatabaseConn(){  } 
	 public void OpenConn() 
			 throws Exception {   
		 try{ 
	   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
	   conn = DriverManager.getConnection("jdbc:odbc:library"); 
	  }
	 catch (Exception e) 
	 {
		 System.err.println("数据库连接:"+e.getMessage());
		 }  
	 }   
	 public ResultSet executeQuery(String sql)
	 {   
		 stmt = null;   
		 rs = null;   
		 try{    
			 stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); 
	   rs = stmt.executeQuery(sql);   
	   }
		 catch (SQLException e)
		 {
			 System.err.println("查询数据:"+e.getMessage());
			 }   
		 return rs;  
		 }   
	 public void executeUpdate(String sql){   
		 stmt = null;   
		 rs = null; 
		 try{    
			 stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); 
		   rs = stmt.executeQuery(sql);    
		   conn.commit();   
		   }
		 catch (SQLException e)
		 {
			 System.err.println("更新数据:"+e.getMessage());
			 }  
		 }   
		 public void closeStmt(){ 
		  try {stmt.close();
		  }
		  catch (SQLException e){ 
		   System.err.println("释放对象:"+e.getMessage());    
		   }  
		  }   
		 public void closeConn(){ 
		  try {conn.close();
		  }
		  catch (SQLException ex){ 
		   System.err.println("释放对象:"+ex.getMessage());    
		   }  
		  }   
		 public static String toGBK(String str){   
			 try{ 
		   if(str == null)     
			   str = null;    
		   else 
		    str = new String(str.getBytes("ISO-8859-1"),"GBK");   
		   }
			 catch (Exception e){System.out.println(e);
			 }   
			 return str;  
			 } 
		 } 
