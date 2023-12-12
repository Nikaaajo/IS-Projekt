/* 
TO DO:
*/

import  java.util.ArrayList;
public class ServiceEvent {


  //Declaring instance variables---------------------------------------------------------------------
  private String serviceDate;
  private String problemDescription;
  private ArrayList<String> activtiesPerformed;
  private int partsReplaced;
  private double costOfService; 
  private Workshop responsibleWorkshop;
  private Vehicle servicedVehicle;

  
  //Constructors for Service Event, both empty and complete-----------------------------------------
  public ServiceEvent() {
  }

  public ServiceEvent(String serviceDate, String problemDescription, ArrayList<String> activtiesPerformed, int partsReplaced, double costOfService, Workshop responsibleWorkshop, Vehicle servicedVehicle) {
    this.serviceDate = serviceDate;
    this.problemDescription = problemDescription;
    this.activtiesPerformed = activtiesPerformed;
    this.partsReplaced = partsReplaced;
    this.costOfService = costOfService;
    this.responsibleWorkshop = responsibleWorkshop;
    this.servicedVehicle = servicedVehicle;
  }

  //Getters and Setters for Service Event instance variables --------------------------------------------------
  public String getServiceDate() {
  	return serviceDate;
  }
  
  public void setServiceDate(String serviceDate ) {
  	this.serviceDate = serviceDate;
  }
  
  public String getProblemDescription() {
  	return problemDescription;
  }
  
  public void setProblemDescription(String problemDescription) {
  	this.problemDescription = problemDescription;
  }
  
  public ArrayList<String> getActivtiesPerformed() {
  	return activtiesPerformed;
  }
  
  public void setActivtiesPerformed(ArrayList<String> activtiesPerformed) {
  	this.activtiesPerformed = activtiesPerformed;
  }
  
  public int getPartsReplaced() {
  	return partsReplaced;
  }
  
  public void setPartsReplaced(int partsReplaced) {
  	this.partsReplaced = partsReplaced;
  }
  
  public double getCostOfService() {
  	return costOfService;
  }
  
  public void setCostOfService(double costOfService) {
  	this.costOfService = costOfService;
  }
  
  public Workshop getResponsibleWorkshop() {
  	return responsibleWorkshop;
  }
  
  public void setResponsibleWorkshop(Workshop responsibleWorkshop) {
  	this.responsibleWorkshop = responsibleWorkshop;
  }
  
  public Vehicle getServicedVehicle() {
  	return servicedVehicle;
  }
  
  public void setServicedVehicle(Vehicle servicedVehicle) {
  	this.servicedVehicle = servicedVehicle;
  }
  

  //Service Event Methods -----------------------------------------------------------------
    
    //Each variable should have full CRUD Methods (Create, Read, Update, Delete):
  
    //serviceDate's Create method is served by the setServiceDate method. Read is served by the getServiceDate method. Update is served by the setServiceDate method. Delete is served by the method below:
    public void removeServiceDate(){
      serviceDate = null;  
    }

    //problemDescription's Create method is served by the setProblemDescription method. Read is served by the getProblemDescription method. Update is served by the setProblemDescription method. Delete is served by the method below:
    public void removeProblemDescription(){
      problemDescription= null;  
    }

    //activtiesPerformed's Create method is served by the setActivtiesPerformed method. Read is served by the getActivtiesPerformed method. Update is served by the setActivtiesPerformed method. Delete is served by the method below:
    public void removeActivtiesPerformed(){
      activtiesPerformed.clear();
    }

    //partsReplaced's Create method is served by the setPartsReplaced method. Read is served by the getPartsReplaced method. Update is served by the setPartsReplaced method. Delete is served by the method below:
    public void removePartsReplaced(){
      partsReplaced = 0;
    }

    //costOfService's Create method is served by the setCostOfService method. Read is served by the getCostOfService method. Update is served by the setCostOfService method. Delete is served by the method below:
    public void removeCostOfService(){
    costOfService = 0;
    }

    //responsibleWorkshop's Create method is served by the setResponsibleWorkshop method. Read is served by the getResponsibleWorkshop method. Update is served by the setResponsibleWorkshop method. Delete is served by the method below:
    public void removeResponsibleWorkshop(){
      responsibleWorkshop = null;
    }

    //servicedVehicle's Create method is served by the setServicedVehicle method. Read is served by the getServicedVehicle method. Update is served by the setServicedVehicle method. Delete is served by the method below:
    public void removeServicedVehicle(){
      servicedVehicle = null;
    }

    //Add new Service Activites
    //OBS! Should this maybe add new parts exchanghed? Perhaps random number between 1-10?
    public void addServiceActivity(String activity){
      activtiesPerformed.add(activity);
    }

    //Remove Service Activites
    public void removeServiceActivity(String activity){
      activtiesPerformed.remove(activity);
    }

    //Prints all service event info, is called by printVehicleServiceHistory in Main
    public void printServiceEvent(){

      System.out.println(" ");
      System.out.println("Service Date: " + this.getServiceDate());
      System.out.println("Workshop: " + this.getResponsibleWorkshop());
      System.out.println("Problem Description: " + this.getProblemDescription());
      //OBS!!!! Check how array list prints here, prob need to find better solution
      System.out.println("Activites Performed: " + this.getActivtiesPerformed());
      System.out.println("Total Amount of Parts Replaced: " + this.getPartsReplaced());
      System.out.println("Cost of Service: " + this.getCostOfService());
      System.out.println(" ");
    }
}