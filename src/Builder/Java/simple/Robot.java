package Builder.Java.simple;

/**
 * Created by prefert on 2017/7/16.
 * builder 变种
 */
public class Robot {
    private String code;
    private String name;
    private int type;
    private int battery;
    private int ability;
    private double weight;
    private double height;

    public Robot(RobotBuilder robotBuilder) {
        this.code = robotBuilder.code;
        this.name = robotBuilder.name;
        this.type = robotBuilder.type;
        this.battery = robotBuilder.battery;
        this.ability = robotBuilder.ability;
        this.weight = robotBuilder.weight;
        this.height = robotBuilder.height;
    }

    public static class RobotBuilder {
        private String code;
        private String name;
        private int type;
        private int battery;
        private int ability;
        private double weight;
        private double height;

        // 必填参数
        public RobotBuilder(String code, String name, int type) {
            this.code = code;
            this.name = name;
            this.type = type;
        }

        //选填参数
        public RobotBuilder withOptionalBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public RobotBuilder withOptionalAbility(int ability) {
            this.ability = ability;
            return this;
        }

        public RobotBuilder withOptionalWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public RobotBuilder withOptionalHeight(int height) {
            this.height = height;
            return this;
        }

        public Robot buildRobot() {
            ValidateRobotData();
            return new Robot(this);
        }

        private boolean ValidateRobotData() {
            // TODO 参数格式检查
            return true;
        }
    }

    @Override
    public String toString() {
        return "Robot {" +
                "code = " + code + '\'' +
                ", name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                ", battery = " + battery +
                ", ability = " + ability +
                ", weight = '" + weight + '\'' +
                ", height = '" + height + '\'' +
                '}';
    }
}