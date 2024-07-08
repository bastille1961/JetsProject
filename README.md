## Jets Application Project

# Overview

This application enables users to examine a pre-existing fleet livery consisting of passenger, cargo and fighter jet aircraft. User options include listing the speed, range and price of aircraft within an existing fleet or querying the array of aircraft for more discrete information such as which of the aircraft is the fastest, can fly the longest distance along with pricing. Users may also initiate aircraft mission options such as flying passengers, loading cargo or practicing a dogfight when those capabilities are assigned to a given aircraft.

# Description

This is a application which enables users to both view and evaluate basic performance characteristics among a livery of aircraft. A menu allows users to select performance parameters or mission profiles for an existing livery of aircraft, as well as, add or delete aircraft from the fleet if desired.

# How to Use this Application

The user is presented with a list of options numbered 1. - 9. and a prompt to "Enter your selection:"
The user may select an item from the list by typing in the number corresponding to a given menu option; e.g., "1" for "List fleet." followed by the [Enter] key.

The Application's Menu list of options include:

1. List fleet: This selection generates a list of each aircraft in the current livery including the model name, maximum speed in MPH, range in miles, and price in USD.
2. Fly all jets: This selection generates a list of each aircraft with a statement for the mission of the aircraft (e.g., "commuting with passengers", for the passenger jet, "flying with a full load of cargo" for cargo aircraft, and declares how long the given aircraft can remain aloft until fuel exhaustion.
3. View fastest jet: This selection prints the performance details for the fastest jet in the livery of aircraft.
4. View jet with longest range. This selection prints the performance details of the jet with the longest range for a given livery.
5. Load all Cargo Jets. This selection calls the loading cargo interface which declares a loading cargo instance for each cargo jet in the livery.
6. Perform simulated Dog fight with vintage aircraft. This selection initiates the Engaging in simulated combat with [...] fighter jets listed in the livery.
7. Add a jet to your livery: This option allows a user to add a new aircraft. Users are prompted to enter a model name, maximum speed in MPH, maximum range and acquisition price for the new aircraft.

 NOTE: If option number one ("1") "List fleet" may be selected if the user wants to view the new aircraft listed.
 
8. Remove a jet from your livery: Select this option to remove an aircraft from the existing livery.
9. Quit. To quit the application, select "9" and [Enter].
	

# Technologies Used

- MacOS Terminal/Unix
- Sublime Simple Text Editor
- Object-Oriented Programming Methods using:
  * Interfaces, ArrayList and Abstract classes.
  * Java utilities for Scanner Object, and InputMismatchException to preclude program failure when a User enters an incorrect selection.

# Lessons Learned and Review Topics

I need more work with and a deeper understanding of how ArrayLists within an application interface.

