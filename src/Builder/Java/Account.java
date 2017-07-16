package Builder.Java;
/**
 * Created by prefert on 2017/7/16.
 * 原始
 */
public class Account {
    private int id;
    private String name;
    private String nickname;
    private int age;
    private int sex;
    private String phone;
    private String address;

    public Account(int id, String name, String nickname, int age, int sex, String phone, String address) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
    }

    public Account(int id, String name, String nickname, String phone, String address) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.phone = phone;
        this.address = address;
    }

    public Account(int id, String name, String nickname, String phone) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.phone = phone;
    }

    public Account(int id, String name,String phone) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.phone = phone;
    }



    @Override
    public String toString() {
        return "Account {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", nickname = '" + nickname + '\'' +
                ", age = " + age +
                ", sex = " + sex +
                ", phone = '" + phone + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}