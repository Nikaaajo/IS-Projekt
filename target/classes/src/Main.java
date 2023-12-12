/*
Current Progress: All object classes have variables, constructors, and getters and setters. All object classses have methods according to Annika's drafts
Next Steps: 
  -MAYBE? add print info methods as form of "Read" function
  -Implement business rules into object classes
  - add System.out.prints for each method

ASK: is setting Workshop's shopType to false good enough for remove?
*/

import  java.util.ArrayList;
class Main {

  //Creating an array list of vehicles and and array list of workshops
  private static ArrayList<Vehicle> currentFleet = new ArrayList<Vehicle>();
  private static ArrayList<Workshop> workshopPartners = new ArrayList<Workshop>();
  
  public static void main(String[] args) {

    
    System.out.println("Hello world!");
    Vehicle car = new Vehicle();
    System.out.println(car.getVin() + "-" + car.getVehicleName() + "-" + car.getCapacity() + "-" + car.isAvailable() + "-" + car.getServiceHistory() + "-" + car.getAssignedWorkshop() + "-" + car.getMaintenanceSchedule());
    
    }

  //Class Methods for Main---------------------------------------------------------------------

  //Find Vehicle's location
  public static void findVehicleLocation(Vehicle truck){
    System.out.println("Vehicle " + truck.getVehicleName() + " is located at " + truck.getCurrentLocation());
  }

  //Check Vehicle Availability
  public static void checkVehicleAvailability(Vehicle truck){
    if(truck.isAvailable() == true){
      System.out.println("The vehicle " + truck.getVehicleName() + " is available");
  } else {
      System.out.println("The vehicle " + truck.getVehicleName() + " is not available");
  }
  }
  
  //Display the information of each individual vehcile in the currentFleet
  public static void printFleetInfo(ArrayList<Vehicle> currentFleet){
    System.out.println("The System will now print the Vehicle information for every Vehicle in the current vehicle fleet");
    for (int i = 0; i < currentFleet.size(); i++){
      currentFleet.get(i).printVehicleInfo();
    }
  }
    

  //Display the information of each individual Workshop of our WorkshopPartners
  public static void printPartnerInfo(ArrayList<Workshop> workshopPartners){
    System.out.println("The System will now print the Workshop information for each of our Workshop Partners: ");
    for (int i = 0; i < workshopPartners.size(); i++){
      workshopPartners.get(i).printWorkshopInfo();
    }
  }

  //Display an individual vehicle's Maintenance Schedule
  public static void printVehicleMaintenanceSchedule(Vehicle truck){
    System.out.println("The System will now print the maintenance schedule for the requested vehicle,  " + truck.getVehicleName() + ": ");
    for (int i = 0; i < truck.getMaintenanceSchedule().size(); i++){
      //Maybe the i should go in the printMaintenanceEvent call?
      truck.getMaintenanceSchedule().get(i).printMaintenanceEvent();
    }
  }

  //Display an individual vehicle's Service History
  public static void printVehicleServiceHistory(Vehicle truck){
    System.out.println("The System will now print the service history for the requested vehicle,  " + truck.getVehicleName() + ": ");
    for (int i = 0; i < truck.getServiceHistory().size(); i++){
      //Maybe the i should go in the printMaintenanceEvent call?
      truck.getServiceHistory().get(i).printServiceEvent();
    }
  }

  //Calculate Average Cost for Vehicle Maintenance 
  //OBS!!! I read this as the average cost for any given service event. Could also be read as asking for average manitanance cost across vehicle lifetime
  public static void printAverageMaintenanceCost(ArrayList<Vehicle> currentFleet){
    System.out.println("The System will now print the average maintenance cost based on the current vehicle fleet's service history: ");
    double totalCost = 0;
    double averageCost = 0;
    double totalServiceEvents = 0;
    
    //For each truck in current fleet
    for (int i = 0; i < currentFleet.size(); i++){

      //For each truck's service event in it's Service History
      for (int j = 0; j < currentFleet.get(i).getServiceHistory().size(); j++){
        totalCost += currentFleet.get(i).getServiceHistory().get(j).getCostOfService();
        totalServiceEvents++;
      }
      
    }
    averageCost = totalCost / totalServiceEvents;
    System.out.println("The average maintenance cost for a given vehicle in our current fleet is: " + averageCost);
  }

  //Display the most expensive maintance job, what vehicle, and what workshop was involved
  public static void printMostExpensiveMaintenanceJob(ArrayList<Vehicle> currentFleet){
    System.out.println("The System will now find the most expensive maintenance job in the current fleet's service history: ");
    double mostExpensiveServiceCost = 0;
    ServiceEvent mostExpensiveServiceEvent = new ServiceEvent();
    
    
    //For each truck in current fleet
    for (int i = 0; i < currentFleet.size(); i++){
      //For each truck's service event in it's Service History
      for (int j = 0; j < currentFleet.get(i).getServiceHistory().size(); j++){
        if (currentFleet.get(i).getServiceHistory().get(j).getCostOfService() > mostExpensiveServiceCost){
          mostExpensiveServiceCost = currentFleet.get(i).getServiceHistory().get(j).getCostOfService();
          mostExpensiveServiceEvent = currentFleet.get(i).getServiceHistory().get(j);
        }
      }
    }

    System.out.println("The most expensive maintenance job in the current fleet's service history was " + mostExpensiveServiceEvent.getServicedVehicle().getVehicleName() + "'s service event on " + mostExpensiveServiceEvent.getServiceDate() + ", which cost a total of " + mostExpensiveServiceCost + "kr. The Workshop that carried out the service was " + mostExpensiveServiceEvent.getResponsibleWorkshop().getShopName());
  }

  //Display the most expensive Workshop
  public static void printMostExpensiveWorkshop(ArrayList<Workshop> workshopPartners){
    System.out.println("The System will now find the most expensive Workshop out of our current Partners based on the average cost of each workshop's service history: ");
    Workshop mostExpensiveWorkshop = new Workshop();
    double mostExpensiveWorkshopAverageCost = 0;

    //For each Workshop in our Workshop Partners list...
    for (int i = 0; i < workshopPartners.size(); i ++){
      //Create a set of temporary variables for each Workshop
      double tempTotalCost = 0;
      double tempNumOfServiceEvents = 0;
      double tempAverageCost= 0;

      //For each service event in a Workshop's service history, add the service cost to the total cost and add 1 to the number of service events
      for (int j = 0; j < workshopPartners.get(i).getShopServiceHistory().size(); j++){
        tempNumOfServiceEvents ++;
        tempTotalCost += workshopPartners.get(i).getShopServiceHistory().get(j).getCostOfService();
      }

      //Find the average cost of a Workshop's services
      tempAverageCost = tempTotalCost / tempNumOfServiceEvents;

      //Compare this average cost to the most expensive Workshop's average cost, if it is more, the most expensive Workshop is assigned the value of the current Workshop
      if (tempAverageCost > mostExpensiveWorkshopAverageCost){
        mostExpensiveWorkshop = workshopPartners.get(i);
        mostExpensiveWorkshopAverageCost = tempAverageCost;
      }

      //The temp variables for individual Workshop "clears" and are used for the next workshop
    }

    System.out.println("The most expensive Workshop of our current workshop partners is " + mostExpensiveWorkshop.getShopName() + ", with an average service job cost of " + mostExpensiveWorkshopAverageCost + "kr. Here is the Workshop's information:");
    mostExpensiveWorkshop.printWorkshopInfo();
    
  }

  
  
    
}