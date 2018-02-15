/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author DLawrence
 */
public class ClientRecord {
    
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/EMP";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "root";
    
    //Client Record Data
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String phone = "";
    private String occupation = "";
    private String rating = "";
    private String type = "";
    private String source = "";
    private String gradYear = "";
    private String stage = "";
    
    //Scheduling Details Data
    private String lastContact = "";
    private String nextContact = "";
    private String quickContactNotes = "";
    
    //Meeting Tracking Data
    private String type1_MT = "";
    private String type2_MT = "";
    private String date1_MT = "";
    private String date2_MT = "";
    
    //Account Information Data
    private String type_AI = "";
    private String opened = "";
    private String company = "";
    private String benefit = "";
    private boolean FPO_BU;
    
    ClientRecord(){
       
    }
    
    ClientRecord(String firstname, String lastName, String email, String phone, String occupation,
                String rating, String type, String source, String gradYear, String stage, String lastContact,
                String nextContact, String quickContactNotes, String type1_MT, String type2_MT, String date1_MT,
                String date2_MT, String type_AI, String opened, String company, String benefit, boolean FPO_BU){
        
    this.firstName = firstname;   
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.occupation = occupation;
    this.rating = rating;
    this.type = type;
    this.source = source;
    this.gradYear = gradYear;
    this.stage = stage;
    this.lastContact = lastContact;
    this.nextContact = nextContact;
    this.quickContactNotes = quickContactNotes;
    this.type1_MT = type1_MT;
    this.type2_MT = type2_MT;
    this.date1_MT = date1_MT;
    this.date2_MT = date2_MT;
    this.type_AI = type_AI;
    this.opened = opened;
    this.company = company;
    this.benefit = benefit;
    this.FPO_BU = FPO_BU;
          
    }
    
    //get methods are currently only used for testing purposes
    public String getFirstName(){
        return firstName;
    }
    public String getRating(){
        return rating;
    }
    public boolean getFPO(){
        return FPO_BU;
    }
    
    public void submitRecord(){
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sqlInsert;
            sqlInsert = "INSERT INTO ClientRecord VALUES (" + "'" + firstName + "'" 
                                                            + ", " + "'" + lastName + "'" 
                                                            + ", " + "'" + email + "'"+ " )";
            stmt.executeUpdate(sqlInsert);

            String sqlSelect;
            sqlSelect = "SELECT firstName, lastName, email FROM ClientRecord";
            ResultSet rs = stmt.executeQuery(sqlSelect);
            
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                String id  = rs.getString("firstName");
                String last = rs.getString("lastName");
                String emailPrint = rs.getString("email");
                

                //Display values
                System.out.print("Firstname: " + id);
                System.out.print(", Lastname: " + last);
                System.out.print(", email: " + emailPrint);
                
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
	}
	   catch(SQLException se){
		  //Handle errors for JDBC
		  se.printStackTrace();
	   }
	   catch(Exception e){
		  //Handle errors for Class.forName
		  e.printStackTrace();
	   }
	   finally{
		  //finally block used to close resources
		  try{
			 if(stmt!=null)
				stmt.close();
		  }catch(SQLException se2){
			//nothing we can do
		  }
		  try{
			 if(conn!=null){
				conn.close();
			 }
		  }catch(SQLException se){
			se.printStackTrace();
		  }//end finally try
	   }//end try
	   System.out.println("\nGoodbye!");
    }
    
    
}
