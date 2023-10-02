package LabAssignment1;

public class Lab {

    private final String labID;
    private final Computer[]  computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public String getLabID() {
        return labID;
    }

    public void addComputer(Computer computer) {
        }
        public boolean removeComputer(String computerNumber) {
            for (Computer computer : computers) {
                if (computer.getComputerNumber().equals(computerNumber)) {
                    return true;
                }
            }
            return false;
        }
        public Computer getComputerByNumber(String computerNumber) {
            for (Computer computer : computers) {
                if (computer.getComputerNumber().equals(computerNumber)) {
                    return computer;
                }
            }
            return null;
        }
        public void changeLabStatus(LabStatus newStatus) {
            this.status = newStatus;
        }
        public Employee getLabAttendant() {
            return labAttendant;
        }

        public static void main(String[] args) {
            Computer[] computers = new Computer[10];
            Employee labAttendant = new Employee("John Doe");

            Lab lab = new Lab("Lab123", computers, LabStatus.OPERATIONAL, labAttendant);
            Computer newComputer = new Computer("12345", "ModelXYZ", 8, 512, true);
            lab.addComputer(newComputer);

            String computerNumberToRemove = "12345";
            if (lab.removeComputer(computerNumberToRemove)) {
                System.out.println("Computer removed successfully.");
            } else {
                System.out.println("Computer not found.");
            }
            String computerNumberToFetch = "12345";
            Computer fetchedComputer = lab.getComputerByNumber(computerNumberToFetch);
            if (fetchedComputer != null) {
                System.out.println("Fetched Computer: " + fetchedComputer.getComputerNumber());
            } else {
                System.out.println("Computer not found.");
            }
            lab.changeLabStatus(LabStatus.FAULTY_MULTIMEDIA);
            Employee attendant = lab.getLabAttendant();
            System.out.println("Lab Attendant: " + attendant.getName());
        }
    }

