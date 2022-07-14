//VacationClient.java

//create the main method

import java.io.*;

import java.util.*;

public class VacationClient {

public static void main(String[] args) {

// create the array list of "vacation"

List<vacation> l = new ArrayList<vacation>();

// assign the value to "allinclusive"

allinclusive x = new allinclusive("Good", 5, 679, "Jamaica");

// assign the value to "piecemeal"

piecemeal y = new piecemeal(852.43, 64.8, 56.9, "Secrets St. James Montego Bay");

// add the vlaue to the list

l.add(x);

l.add(y);

// display the output

for (int i = 0; i < l.size(); i++) {

System.out.println(l.get(i).toString());

System.out.println(" Cost : $" + l.get(i).calculatecost());

}

}

}