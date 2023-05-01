package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role) {
		super(id);
		// TODO Auto-generated constructor stub
	}
  
    
    // METHODS
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    


    
    // TO DO: Implement HIPAACompliantAdmin!
    //Returns a list of strings (incidents reported)
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents;
	}
	
	
	// TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length();
		if (length == 6) {
			return true;
		}else {
			return false;			
		}
	}

	/*Compares the id s, and if they are not a match,
	 *creates an incident report using the authIncident method,
	  Returns true if id s match, false if not.
	 */
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID == this.id) {
			return true;
		} else {
			this.authIncident();
			return false;
		}
	}

	
	
	// TO DO: Setters & Getters
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}


	
}
