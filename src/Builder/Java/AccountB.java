package Builder.Java;
/**
 * Created by prefert on 2017/7/16.
 * builder 变种
 */
public class AccountB {
    private int id;
    private String name;
    private String nickname;
    private int age;
    private int sex;
    private String phone;
    private String address;

    public AccountB(AccountBuilder accountBuilder) {
        this.id = accountBuilder.id;
        this.name = accountBuilder.name;
        this.nickname = accountBuilder.nickname;
        this.age = accountBuilder.age;
        this.sex = accountBuilder.sex;
        this.phone = accountBuilder.phone;
        this.address = accountBuilder.address;
    }

    public static class AccountBuilder {
        private int id;
        private String name;
        private String nickname;
        private int age;
        private int sex;
        private String phone;
        private String address;

        // 必填参数
        public AccountBuilder(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        //选填参数
        public AccountBuilder withOptionalNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public AccountBuilder withOptionalAge(int age) {
            this.age = age;
            return this;
        }

        public AccountBuilder withOptionalSex(int sex) {
            this.sex = sex;
            return this;
        }

        public AccountBuilder withOptionalAddress(String address) {
            this.address = address;
            return this;
        }

        public AccountB buildEmployee() {
            ValidateAccountData();
            return new AccountB(this);
        }

        private boolean ValidateAccountData() {
            // TODO 参数格式检查
            return true;
        }
    }

    @Override
    public String toString() {
        return "Account {" +
                "  name = '" + name + '\'' +
                ", nickname = '" + nickname + '\'' +
                ", age = " + age +
                ", sex = " + sex +
                ", phone = '" + phone + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}