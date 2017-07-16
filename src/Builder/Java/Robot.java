package Builder.Java;

public class Robot {
    private String sensor;
    private String control;
    private String drive;
    private String shell;

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    @Override
    public String toString() {
        return "Robot {" +
                "  Sensor = '" + sensor + '\'' +
                ", Control = '" + control + '\'' +
                ", Drive = '" + drive + '\'' +
                ", Shell = '" + shell + '\'' +
                '}';
    }
}