/* 
TO DO:
*/

import  java.util.ArrayList;
public class MaintenanceEvent {
 

  //Declaring instance variables-------------------------------------------------------------------
  private String maintenanceDate;
  private Workshop assignedWorkshop;
  private Vehicle assignedVehicle;

  
  //Constructors for Maintenance Event, both empty and complete--------------------------------------------------------------------
  public MaintenanceEvent() {
  }

  public MaintenanceEvent(String maintenanceDate, Workshop assignedWorkshop, Vehicle assignedVehicle) {
    this.maintenanceDate = maintenanceDate;
    this.assignedWorkshop = assignedWorkshop;
    this.assignedVehicle = assignedVehicle;
  }


  //Getters and Setters for Maintenance Event instance variables ---------------------------------
  public String getMaintenanceDate() {
  	return maintenanceDate;
  }
  
  public void setMaintenanceDate(String maintenanceDate) {
  	this.maintenanceDate = maintenanceDate;
  }
  
  public Workshop getAssignedWorkshop() {
  	return assignedWorkshop;
  }
  
  public void setAssignedWorkshop(Workshop assignedWorkshop) {
  	this.assignedWorkshop = assignedWorkshop;
  }
  
  public Vehicle getAssignedVehicle() {
  	return assignedVehicle;
  }
  
  public void setAssignedVehicle(Vehicle assignedVehicle) {
  	this.assignedVehicle = assignedVehicle;
  }

  //Maintenance Event Methods ---------------------------------------------

    //Each variable should have full CRUD Methods (Create, Read, Update, Delete):
    
    //maintenanceDate's Create method is served by the setMaintenanceDate method. Read is served by the getMaintenanceDate method. Update is served by the setMaintenanceDate method. Delete is served by the method below:
    public void removeMaintenanceDate(){
      maintenanceDate= null;
    }

    //assignedWorkshop's Create method is served by the setAssignedWorkshop method. Read is served by the getAssignedWorkshop method. Update is served by the setAssignedWorkshop method. Delete is served by the method below:
    public void removeAssignedWorkshop(){
      assignedWorkshop = null;
    }

    //assignedVehicle's Create method is served by the setAssignedVehicle method. Read is served by the getAssignedVehicle method. Update is served by the setAssignedVehicle method. Delete is served by the method below:
    public void removeAssignedVehicle(){
      assignedVehicle= null;
    }

    //Prints all maintenance event info, is called by printVehicleMaintenanceSchedule in Main
    public void printMaintenanceEvent(){
      System.out.println(" ");
      System.out.println("Scheduled Maintenance Date: " + this.getMaintenanceDate());
      System.out.println("Assigned Workshop: " + this.getAssignedWorkshop().getShopName());
      System.out.println(" ");
    }
}
  