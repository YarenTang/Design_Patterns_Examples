package Builder.Java.origin;


/**
 * Created by prefert on 2017/7/16.
 * 原始写法
 */
public class Robot {
    private String code;
    private String name;
    private int type;
    private int battery;
    private int ability;
    private double weight;
    private double height;

    // 通常我们会生成一个含有全部参数的构造函数
    public Robot(String code, String name, int type, int battery, int ability, double weight, double height) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.battery = battery;
        this.ability = ability;
        this.weight = weight;
        this.height = height;
    }

    public Robot(String code, String name, int type) {
        this.code = code;
        this.name = name;
        this.type = type;
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