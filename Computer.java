package LabAssignment1;

public class Computer {
    private String computerNumber;
    private String IcdModel;

    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        IcdModel = icdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }


        public static void main(String[] args) {

            Computer computer1 = new Computer("12345", "IcdModel1", 8, 512, true);
            Computer computer2 = new Computer("67890", "IcdModel2", 16, 1024, false);


            boolean areEqual = computer1.equals(computer2);

            if (areEqual) {
                System.out.println("Both computers are equal.");
            } else {
                System.out.println("Computers are not equal.");
            }
        }



    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getIcdModel() {
        return IcdModel;
    }

    public void setIcdModel(String icdModel) {
        IcdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }


    public Object clone() {
        try {
            Computer clonedComputer = (Computer) super.clone();
            clonedComputer.computerNumber = new String(this.computerNumber);
            clonedComputer.IcdModel = new String(this.IcdModel);
                        return clonedComputer;
        } catch (CloneNotSupportedException e) {

            throw new InternalError(e.getMessage());
        }
    }

        Computer original = new Computer("12345", "ModelXYZ", 8, 512, true);



    {

        Computer cloned = (Computer) original.clone();
        System.out.println("Original: " + original.getComputerNumber());
        System.out.println("Cloned: " + cloned.getComputerNumber());
        cloned.setComputerNumber("54321");
        System.out.println("Original: " + original.getComputerNumber());
        System.out.println("Cloned: " + cloned.getComputerNumber());

    }
    }
