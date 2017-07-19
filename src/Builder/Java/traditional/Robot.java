package Builder.Java.traditional;

public class Robot {
    private String sensor; // 传感器
    private String control;// 控制器
    private String drive; //  驱动
    private String shell; // 外壳

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