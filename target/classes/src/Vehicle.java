/* 
TO DO: Find way to generate Vin randomly, add validity check when instantiating vehicle type in constructor,

*/

import  java.util.ArrayList;
public class Vehicle {

  
  //Declaring Vehicle instance variables-----------------------
  private int vin;
  private String vehicleName;
  private String type;
  private double capacity;
  private String currentLocation;
  //Maybe make into object Boolean instead so that we can set it's value to null?
  private boolean available;
  private boolean inCommission;
  private ArrayList <ServiceEvent> serviceHistory;
  private int totalPartsReplaced;
  private Workshop assignedWorkshop;
  private ArrayList <MaintenanceEvent> maintenanceSchedule;

  
  //Constructors for Vehicle, both empty and complete----------------------------
  public Vehicle(){
    
  }

  public Vehicle(String vehicleName, String type, double capacity, String currentLocation, boolean available, boolean inCommission, ArrayList<ServiceEvent> serviceHistory, int totalPartsReplaced, Workshop assignedWorkshop, ArrayList<MaintenanceEvent> maintenanceSchedule){
    //OBS! need to make this.vin = randomly generated vin
    this.vehicleName = vehicleName;
    //OBS need to add check to confirm that String == available types
    this.type = type;
    if (capacity < 0){
      System.out.println("Vehicles are not able to have a negative capacity, and you have inputed a capacity of " + capacity + ". As this is a negative amount, the vehicle will be assigned the capacity of 0.0");
      this.capacity = 0.0;
    } else {
      this.capacity = capacity;
    }
    this.currentLocation = currentLocation;
    this.available = available;
    this.inCommission = inCommission;
    this.serviceHistory = serviceHistory;
    this.totalPartsReplaced = totalPartsReplaced;
    this.assignedWorkshop =assignedWorkshop;
    this.maintenanceSchedule = maintenanceSchedule;
  }

  
  //Getters and Setters for Vehicle instance variables---------------------------
  public int getVin(){
    return vin;
  }

  public void setVin(int vin) {
	  this.vin = vin;
  }

  public String getVehicleName() {
	   return vehicleName;
  }

  public void setName(String name) {
	   this.vehicleName = name;
  }

  public String getType() {
	   return type;
  }

  public void setType(String type) {
	   this.type = type;
  }

  public double getCapacity() {
	   return capacity;
  }

  public void setCapacity(double capacity) {
	  if (capacity < 0){
      System.out.println("Vehicles are not able to have a negative capacity, and you have inputed a capacity of " + capacity + ". As this is a negative amount, the setCapacity action has been canceled and the vehicle retains it's original capacity of " + this.getCapacity());
    } else {
      this.capacity = capacity;
    }
  }
  

  public String getCurrentLocation() {
	   return currentLocation;
  }

  public void setCurrentLocation(String currentLocation) {
	   this.currentLocation = currentLocation;
  }

  public boolean isAvailable() {
	   return available;
  }

  public void setAvailable(boolean available) {
	 this.available = available;
  }

  public boolean isInCommission() {
     return inCommission;
  }

  public void setInCommission(boolean inCommission) {
   this.inCommission = inCommission;
  }

  public ArrayList<ServiceEvent> getServiceHistory() {
	   return serviceHistory;
  }

  public void setServiceHistory(ArrayList<ServiceEvent> serviceHistory) {
	   this.serviceHistory = serviceHistory;
  }

  public int getTotalPartsReplaced(){
    return totalPartsReplaced;
  }

  public void setTotalPartsReplaced( int totalPartsReplaced){
    this.totalPartsReplaced = totalPartsReplaced;
  }

  public Workshop getAssignedWorkshop() {
	   return assignedWorkshop;
  }

  public void setAssignedWorkshop(Workshop assignedWorkshop) {
	   this.assignedWorkshop = assignedWorkshop;
  }

  public ArrayList<MaintenanceEvent> getMaintenanceSchedule() {
    return maintenanceSchedule;
  }

  public void setMaintenanceSchedule(ArrayList<MaintenanceEvent> maintenanceSchedule) {
    this.maintenanceSchedule = maintenanceSchedule;
  }

  
  //Vehicle Methods---------------------------------------------------------------------------------------

    //Each variable should have full CRUD Methods (Create, Read, Update, Delete):
  
    //vin's Create method is served by the setVin method. Read is served by the getVin method. Update is served by the setVin method. Delete is served by the method below: 
    public void deleteVin(){
      this.vin = 0;
    }

    //vehicleName's Create method is served by the setvehicleName method. Read is served by the getvehicleName method. Update is served by the setvehicleName method. Delete is served by the method below: 
    public void deletevehicleName(){
      this.vehicleName = null;
    }

    //types's Create method is served by the setType method. Read is served by the getType method. Update is served by the setType method. Delete is served by the method below: 
    public void deleteType(){
      this.type = null;
    }

    //capacity's Create method is served by the setCapacity method. Read is served by the getCapacity method. Update is served by the setCapacity method. Delete is served by the method below:
    public void deleteCapacity(){
      this.capacity = 0.0;
    }
  
    //currentLocation's Create method is served by the setCurrentLocation method. Read is served by the getCurrentLocation method. Update is served by the setCurrentLocation method. Delete is served by the method below:
    public void deleteCurrentLocation(){
      this.currentLocation = null;
    }
  
    //available's Create method is served by the setAvailable method. Read is served by the getAvailable method. Update is served by the setAvailable method. Delete is served by the method below:
    //OBS!!! Consider if we should use Boolean instead so we can set value to null
    public void deleteAvailable(){
      this.available = false;
    }

    //available's Create method is served by the setAvailable method. Read is served by the getAvailable method. Update is served by the setAvailable method. Delete is served by the method below:
    //OBS!!! Consider if we should use Boolean instead so we can set value to null
    public void deleteInCommission(){
      this.inCommission = false;
    }

    //serviceHistory's Create method is served by the setServiceHistory method. Read is served by the getServiceHistory method. Update is served by the setServiceHistory method. Delete is served by the method below:
    public void deleteServiceHistory(){
      this.serviceHistory.clear();
    }

    //totalPartsReplaced's Create method is served by the setTotalPartsReplaced method. Read is served by the getTotalPartsReplaced method. Update is served by the setTotalPartsReplaced method. Delete is served by the method below:
    public void deleteTotalPartsReplaced(){
      this.totalPartsReplaced = 0;
    }

    //assignedWorkshop's Create method is served by the setAssignedWorkshop method. Read is served by the getAssignedWorkshop method. Update is served by the setAssignedWorkshop method. Delete is served by the method below:
    public void deleteAssignedWorkshop(){
      this.assignedWorkshop = null;
    }

    //maintenanceSchedule's Create method is served by the setMaintenanceSchedule method. Read is served by the getMaintenanceSchedule method. Update is served by the setMaintenanceSchedule method. Delete is served by the method below:
    public void deleteMaintenanceSchedule(){
      this.maintenanceSchedule.clear();
    }

    //Display Vehicle Maintenance Schedule & Workshop
    //OBS!!!! double check how print looks when maintenance schedule includes different workshops
    public void displayMaintenanceSchedule(){
      System.out.println("Maintenance Schedule for " + getVehicleName() + ": ");
      for(int i = 0; i < maintenanceSchedule.size(); i++){
        maintenanceSchedule.get(i).printMaintenanceEvent();
      }
      System.out.println("Assigned Workshop: " + assignedWorkshop.getShopName());
    }

    //Display Vehicle Service History
    public void displayServiceHistory(){
      System.out.println("Service History for " + getVehicleName() + ": ");
      for(int i = 0; i < serviceHistory.size(); i++){
        serviceHistory.get(i).printServiceEvent();
      }
    }

    //Add Vehicle Service Event
    public void addServiceEvent(ServiceEvent serviceEvent){
      
      if (totalPartsReplaced + serviceEvent.getPartsReplaced() <= 100){
        serviceHistory.add(serviceEvent);
        totalPartsReplaced += serviceEvent.getPartsReplaced();
      } else {
        System.out.println("A vehicle is not allowed to remain active if it has had more than 100 parts replaced. Therefore, once this service job is complete, this vehicle will be decommissioned.");
        serviceHistory.add(serviceEvent);
        totalPartsReplaced += serviceEvent.getPartsReplaced();
        //OBS!!!! Should these maybe be set to final?
        this.available = false;
        this.inCommission = false;
      } 
      
    }  

    //Remove Vehicle Service Event
    public void removeServiceEvent(ServiceEvent serviceEvent){
      serviceHistory.remove(serviceEvent);
    }

    //Add Vehicle Maintenance Event
    public void addMaintenanceEvent(MaintenanceEvent maintenanceEvent){
      maintenanceSchedule.add(maintenanceEvent);
    }

    //Remove Vehicle Maintenance Event
    public void removeMaintenanceEvent(MaintenanceEvent maintenanceEvent){
      maintenanceSchedule.remove(maintenanceEvent);
    }

    //Display total Vehicle Service Event cost
    public void displayTotalServiceCost(){
      double totalServiceCost = 0;
      for(int i = 0; i < serviceHistory.size(); i++){
        totalServiceCost += serviceHistory.get(i).getCostOfService();
      }
      System.out.println("Total Service Cost: " + totalServiceCost);
    }

    //Display all workshops Vehicle has previously had a Service Event in
    public void displayPreviousWorkshops(){
      System.out.println("Workshops Vehicle has previously had a Service Event in: ");
      for(int i = 0; i < serviceHistory.size(); i++){
       System.out.println(serviceHistory.get(i).getResponsibleWorkshop().getShopName());
      }
    }

    //Prints all vehicle info, is called by printFleetInfo in Main
    public void printVehicleInfo(){

      System.out.println(" ");
      System.out.println("VIN: " + this.getVin());
      System.out.println("Vehicle Name: " + this.getVehicleName());
      System.out.println("Vehicle Type: " + this.getType());
      System.out.println("Capacity: " + this.getCapacity());
      System.out.println("Current Location: " + this.getCurrentLocation());
      System.out.println("Availability: " + this.isAvailable());
      System.out.println(" ");
    }
}