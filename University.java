package LabAssignment1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Lab> labs;

    public University() {
        labs = new ArrayList<>();
    }

    public List<Lab> getLabs() {
        return labs;
    }

    public void setLabs(List<Lab> labs) {
        this.labs = labs;
    }

    // Method to add a lab to the University
    public void addLab(Lab lab) {
        labs.add(lab);
    }

    // Method to remove a lab from the University based on labID
    public boolean removeLab(String labID) {
        for (Lab lab : labs) {
            if (lab.getLabID().equals(labID)) {
                labs.remove(lab);
                return true;
            }
        }
        return false; // Lab with the specified labID not found
    }

    // Method to fetch a lab based on labID
    public Lab getLab(String labID) {
        for (Lab lab : labs) {
            if (lab.getLabID().equals(labID)) {
                return lab;
            }
        }
        return null; // Lab with the specified labID not found
    }

    public static void main(String[] args) {
        // Create a University object
        University university = new University();

        // Create some Lab objects
        Lab lab1 = new Lab("Lab001", new Computer[10], LabStatus.OPERATIONAL, new Employee("John"));
        Lab lab2 = new Lab("Lab002", new Computer[15], LabStatus.FAULTY_MULTIMEDIA, new Employee("Alice"));

        university.addLab(lab1);
        university.addLab(lab2);
        boolean labRemoved = university.removeLab("Lab001");
        if (labRemoved) {
            System.out.println("Lab Lab001 removed successfully.");
        } else {
            System.out.println("Lab Lab001 not found.");
        }

        Lab fetchedLab = university.getLab("Lab002");
        if (fetchedLab != null) {
            System.out.println("Lab Lab002 found.");
        } else {
            System.out.println("Lab Lab002 not found.");
        }
    }
}
