package be.nadira;

public class Car {
    private int radiostation;
    private  int wheels =4;
    private boolean workingMotor;

    public Car(int radiostation, int wheels, boolean workingMotor) {
        this.radiostation = radiostation;
        this.wheels = wheels;
        this.workingMotor = workingMotor;
    }

    public int getRadiostation() {
        return radiostation;
    }

    public void setRadiostation(int radiostation) {
        this.radiostation = radiostation;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isWorkingMotor() {
        return workingMotor;
    }

    public void setWorkingMotor(boolean workingMotor) {
        this.workingMotor = workingMotor;
    }
}
