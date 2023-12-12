/* 
TO DO:
*/

import  java.util.ArrayList;
public class Workshop {


  //Declaring instance variables-------------------------------------------------------------------
  private String shopName;
  private String address;
  private boolean shopType; //true = internal workshop, false = external workshop
  private ArrayList<Vehicle> assignedVehicles;
  private ArrayList<ServiceEvent> shopServiceHistory;
  private ArrayList<MaintenanceEvent> shopMaintenanceSchedule;


  //Workshop Constructors, both empty and complete------------------------------------
  public Workshop (){
    
  }

  public Workshop(String shopName, String address, boolean shopType, ArrayList<Vehicle> assignedVehicles, ArrayList<ServiceEvent> shopServiceHistory, ArrayList<MaintenanceEvent> shopMaintenanceSchedule){
    this.shopName = shopName;
    this.address = address;
    this.shopType = shopType;
    this.assignedVehicles = assignedVehicles;
    this.shopServiceHistory = shopServiceHistory;
    this.shopMaintenanceSchedule = shopMaintenanceSchedule;
  }


  //Getters and Setters for all instance variables--------------------------------------
  public String getShopName() {
  	return shopName;
  }
  
  public void setShopName(String shopName) {
  	this.shopName = shopName;
  }
  
  public String getAddress() {
  	return address;
  }
  
  public void setAddress(String address) {
  	this.address = address;
  }
  
  public boolean isShopType() {
  	return shopType;
    //true = internal workshop, false = external workshop
  }
  
  public void setShopType(boolean shopType) {
  	this.shopType = shopType;
    //true = internal workshop, false = external workshop
  }
  
  public ArrayList<Vehicle> getAssignedVehicles() {
  	return assignedVehicles;
  }
  
  public void setAssignedVehicles(ArrayList<Vehicle> assignedVehicles) {
  	this.assignedVehicles = assignedVehicles;
  }
  
  public ArrayList<ServiceEvent> getShopServiceHistory() {
  	return shopServiceHistory;
  }
  
  public void setShopServiceHistory(ArrayList<ServiceEvent> shopServiceHistory) {
  	this.shopServiceHistory = shopServiceHistory;
  }
  
  public ArrayList<MaintenanceEvent> getShopMaintenanceSchedule() {
  	return shopMaintenanceSchedule;
  }
  
  public void setShopMaintenanceSchedule(ArrayList<MaintenanceEvent> shopMaintenanceSchedule) {
  	this.shopMaintenanceSchedule = shopMaintenanceSchedule;
  }

  //Workshop Methods--------------------------------------

    //Each variable should have full CRUD Methods (Create, Read, Update, Delete):

    //shopName's Create method is served by the setShopName method. Read is served by the getShopName method. Update is served by the setShopName method. Delete is served by the method below:
    public void removeShopName(){
        shopName= null;
    }

    //address's Create method is served by the setAddress method. Read is served by the getAddress method. Update is served by the setAddress method. Delete is served by the method below:
    public void removeAddress(){
      address = null;      
    }

    //shopType's Create method is served by the setShopType method. Read is served by the getShopType method. Update is served by the setShopType method. Delete is served by the method below:
    //OBS!!! This is technically not removing the shop type
    public void removeShopType(){
      shopType = false;
    }

    //assignedVehicles's Create method is served by the setAssignedVehicles method. Read is served by the getAssignedVehicles method. Update is served by the setAssignedVehicles method. Delete is served by the method below:
    public void removeAssignedVehicles(){
      assignedVehicles.clear();
    }
  
    //shopServiceHistory's Create method is served by the setShopServiceHistory method. Read is served by the getShopServiceHistory method. Update is served by the setShopServiceHistory method. Delete is served by the method below:
    public void removeShopServiceHistory(){
      shopServiceHistory.clear();
    }

    //shopMaintenanceSchedule's Create method is served by the setShopMaintenanceSchedule method. Read is served by the getShopMaintenanceSchedule method. Update is served by the setShopMaintenanceSchedule method. Delete is served by the method below:
    public void removeShopMaintenanceSchedule(){
      shopMaintenanceSchedule.clear();
    }

    //Display all service events in Workshop's Service History
    //OBS!! Check how this actually looks when printed out, I imagine we could need to make it prettier
    public void displayServiceHistory(){
      System.out.println(this.shopName + "'s Service History:");
      for(int i = 0; i < shopServiceHistory.size(); i++){
        System.out.println(shopServiceHistory.get(i));
        this.shopServiceHistory.get(i).printServiceEvent();
      }
    }

    //Prints all Workshop info, is called by printPartnerInfo and printMostExpensiveWorkshop in Main
    public void printWorkshopInfo(){

      System.out.println(" ");
      System.out.println("Workshop Name: " + this.getShopName());
      System.out.println("Address: " + this.getAddress());
      if (this.isShopType() == true){
        System.out.println("Workshop Type: internal");
      } else {
        System.out.println("Workshop Type: external");
      }
      System.out.println(" ");
    }
    
}
