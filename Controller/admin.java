/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.NewJFrame;
import View.admindashboard;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DataConnector;

/**
 *
 * @author hp
 */
public class admin {
    
   public void addcar(String id,String pr,String man,String mod,String f,String p){
       int price = Integer.parseInt(p);
               try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="insert into car (id,product,manufacturer,model,features,price) values ('"+id+"','"+pr+"','"+man+"','"+mod+"','"+f+"','"+price+"')";          
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Sucessfully Added");
            admindashboard x= new admindashboard();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, "Somethnig went wrong");
            }
       
    
    } 
   
      public void deletecar(String id){
       
               try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="delete from car where id='"+id+"';";          
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Sucessfully Deleted");
            admindashboard x= new admindashboard();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            }
       
    
    }
   
   
   
   
   public void updatecar(String id,String f,String nv){
       
               try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query= "";
            if (f.equals("price")){int price = Integer.parseInt(nv);
             query="update car set "+f+"='"+price+"' where id='"+id+"';";
            }
            else{
             query="update car set "+f+"='"+nv+"' where id='"+id+"';";          
            
            }
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Sucessfully Updated");
            admindashboard x= new admindashboard();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            }
       
    
    } 
   
    
    
        public void signIn(String email,String pass){
    
                try{
        DataConnector c = new DataConnector();
            Connection connection = c.Connector();
            String query="SELECT Password FROM admin WHERE email='"+email+"'";
            Statement statement = connection.createStatement();
            ResultSet result;
            result = statement.executeQuery(query);
            result.next();
            String name = result.getString("Password");
           if(name.equals(pass)){
               //JOptionPane.showMessageDialog(null, "admin SignIn Successful");
                admindashboard admin= new admindashboard();
                admin.setVisible(true);
           }
           else{
               JOptionPane.showMessageDialog(null, "Incorrect Password");
           }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "Wrong usrname or Password");
       }
    
    }
        
       public ResultSet stufflist(){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="select * from suff";          
            Statement statement = connection.createStatement();
            ResultSet r=statement.executeQuery(query);
            return r;
 
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            return null;
            }
        
    }     
        
           public ResultSet seeuserreq(){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="select * from reqcar";          
            Statement statement = connection.createStatement();
            ResultSet r=statement.executeQuery(query);
            return r;
 
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            return null;
            }
        
    }  
      
    
    
}
