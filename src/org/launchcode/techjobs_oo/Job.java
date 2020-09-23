package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        //this.value = value;
    }

    public Job(String web_developer, String centene, String s, String s1, String javaScript) {
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {

        if(getName() == null) {
           System.out.println("\n" + "ID: " + getId() +
                    "\nName: Data Not Available" +
                    "\nEmployer: " + getEmployer() +
                    "\nLocation: " + getLocation() +
                    "\nPosition Type: " + getPositionType() +
                    "\nCore Competency: " + getCoreCompetency() +
                    "\n");
        } else if(getEmployer() == null) {
            System.out.println("\n" + "ID: " + getId() +
                    "\nName: " + getName() +
                    "\nEmployer: Data Not Available" +
                    "\nLocation: " + getLocation() +
                    "\nPosition Type: " + getPositionType() +
                    "\nCore Competency: " + getCoreCompetency() +
                    "\n");

        } else if (getLocation() == null) {
            System.out.println("\n" + "ID: " + getId() +
                    "\nName: " + getName() +
                    "\nEmployer: " + getEmployer() +
                    "\nLocation: Data Not Available"   +
                    "\nPosition Type: " + getPositionType() +
                    "\nCore Competency: " + getCoreCompetency() +
                    "\n");

        } else if (getPositionType().equals("")) {
            System.out.println("\n" + "ID: " + getId() +
                    "\nName: " + getName() +
                    "\nEmployer: " + getEmployer() +
                    "\nLocation: " + getLocation() +
                    "\nPosition Type: Data Not Available"  +
                    "\nCore Competency: " + getCoreCompetency() +
                    "\n");

        } else if (getCoreCompetency() ==null) {
            System.out.println("\n" + "ID: " + getId() +
                    "\nName: " + getName() +
                    "\nEmployer: " + getEmployer() +
                    "\nLocation: " + getLocation() +
                    "\nPosition Type: " + getPositionType() +
                    "\nCore Competency: Data Not Available" +
                    "\n");
        } else {
            System.out.println("\n" + "ID: " + getId() +
                    "\nName: " + getName() +
                    "\nEmployer: " + getEmployer() +
                    "\nLocation: " + getLocation() +
                    "\nPosition Type: " + getPositionType() +
                    "\nCore Competency: " + getCoreCompetency() +
                    "\n");
        }
      return String;
    }



    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //generate getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    //generate setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}


