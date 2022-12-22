/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.NewJFrame;
import View.userdashboard;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import model.DataConnector;
//import view.User_pannel;

/**
 *
 * @author hp
 */
public class user {
    public void signup(String n,String e,String a,String p){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="insert into user1 (name,email,address,Password) values ('"+n+"','"+e+"','"+a+"','"+p+"')";          
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Register Sucessfull");
            NewJFrame x= new NewJFrame();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, "Somethnig went wrong");
            }
        
    }
    
    
    public void signIn(String email,String pass){
        
                try{
        DataConnector c = new DataConnector();
            Connection connection = c.Connector();
            String query="SELECT Password FROM user1 WHERE email='"+email+"'";
            Statement statement = connection.createStatement();
            ResultSet result;
            result = statement.executeQuery(query);
            result.next();
            String name = result.getString("Password");
           if(name.equals(pass)){
               //JOptionPane.showMessageDialog(null, "SignIn Successful");
                userdashboard u= new userdashboard();
                u.setVisible(true);
           }
           else{
               JOptionPane.showMessageDialog(null, "Incorrect Password");
           }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "Wrong usrname or Password");
       }
    
    }
    
    
    
     public ResultSet showcar(){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="select * from car";          
            Statement statement = connection.createStatement();
            ResultSet r=statement.executeQuery(query);
            return r;
 
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            return null;
            }
        
    }
     
     
          public ResultSet buycar(String id){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="SELECT * FROM car WHERE id='"+id+"'";          
            Statement statement = connection.createStatement();
            ResultSet r=statement.executeQuery(query);
            return r;
 
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            return null;
            }
        
    }
     
            public ResultSet excahngecar(int price){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="SELECT * FROM car WHERE price<'"+price+"'";          
            Statement statement = connection.createStatement();
            ResultSet r=statement.executeQuery(query);
            return r;
 
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            return null;
            }
        
    }
    
    
        public void sellcar(String model,String yop,String des){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="insert into sellcar (carmodel,yop,description,price) values ('"+model+"','"+yop+"','"+des+"','0')";          
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Car sell request is Sucessfull!!!");
            userdashboard x= new userdashboard();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            }
        
    }
        
       public void addaccount(String accname,String accno){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="insert into useracc (acctype,accno) values ('"+accname+"','"+accno+"')";          
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Payment Sucessfull!!!");
            userdashboard x= new userdashboard();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            }
        
    }
    
        
        
        
    public void makemoney(String model,String yop,String des){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="insert into checkcar (carmodel,yop,description) values ('"+model+"','"+yop+"','"+des+"')";          
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "An admin will check your car and let you know car price shortly");
            userdashboard x= new userdashboard();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            }
        
    }    
        
   public void repair(String model,String des){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="insert into repaircar (carmodel,description) values ('"+model+"','"+des+"')";          
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Request Sucessfull!!");
            userdashboard x= new userdashboard();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            }
        
    }     
   
   
       public void reqcar(String model,String m,String f,String p){
        try{
            DataConnector c = new DataConnector();
            Connection connection = c.Connector();  
            String query="insert into reqcar (carmodel,manufacturer,features,price) values ('"+model+"','"+m+"','"+f+"','"+p+"')";          
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Car requst is Sucessfull!!");
            userdashboard x= new userdashboard();
            x.setVisible(true);
   
       
    }
         catch(HeadlessException | ClassNotFoundException | SQLException x){
            JOptionPane.showMessageDialog(null, x);
            }
        
    } 
        
    
    
}
