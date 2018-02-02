/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanagement;

/**
 * @author DLawrence
 */
public class ClientRecord {
    
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
       //default constructor 
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
    
    public String getFirstName(){
        return firstName;
    }
    public String getRating(){
        return rating;
    }
    public boolean getFPO(){
        return FPO_BU;
    }
    
    
}
