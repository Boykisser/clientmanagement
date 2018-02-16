/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanagement;

/**
 *
 * @author Dmoney
 */

import java.sql.*;
import java.util.*;
import javax.swing.*;


public class Database {
    
    /*
    example of INSERT using variables:

    String sqlInsert;
            sqlInsert = "INSERT INTO ClientRecord VALUES (" + "'" + firstName + "'" 
                                                            + ", " + "'" + lastName + "'" 
                                                            + ", " + "'" + email + "'"+ " )";

    -----------------------------------------------------------------------------------------------

    Get column names and row data from the database

    ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            //Get column names
            for (int i = 1; i <= columns; i++){
                columnNames.add(md.getColumnName(i));
            }

            //Get row data
            while (rs.next()){
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++){
                    row.add(rs.getObject(i));
                }

                data.add(row);
            }



    */

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/EMP";

    //Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    //Arrays
    private ArrayList columnNames = new ArrayList();
    private ArrayList data = new ArrayList();
    private Vector columnNamesVector = new Vector();
    private Vector dataVector = new Vector();
   
    
    public void authenticate(){

    }

    public void queryAllElements(){

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

            String sqlSelect;
            sqlSelect = "SELECT * FROM Employees";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            //STEP 5: Extract data from result set
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            //Get column names
            for (int i = 1; i <= columns; i++){
                columnNames.add(md.getColumnName(i));
            }

            //Get row data
            while (rs.next()){
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++){
                    row.add(rs.getObject(i));
                }

                data.add(row);
            }
            
        // Create Vectors and copy over elements from ArrayLists to them
        // Vector is deprecated but I am using them in this example to keep 
        // things simple - the best practice would be to create a custom defined
        // class which inherits from the AbstractTableModel class
        

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));


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

    }//end queryAllElements

    public void selectEntry(){

    }

    public void deleteEntry(){

    }



    public Vector getData(){
        return dataVector;
    }

    public Vector getColumnNames(){
        return columnNamesVector;
    }
   
   
}
