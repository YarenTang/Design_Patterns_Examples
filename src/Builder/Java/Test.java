package Builder.Java;

/**
 * Created by prefert on 2017/7/15.
 */
public class Test {
    public static void main(String[] args) {
        Account account1 = new Account(1, "tyl","Prefert",23, 1 ,"12300000000","Address");
        System.out.println(account1);

        Account account2 = new Account(2, "zhy","Hyman","12300000000","Address");
        System.out.println(account2);

        AccountB accountB = new AccountB.AccountBuilder(3,"spider-man","189")
                .withOptionalNickname("失败的人")
                .withOptionalAge(28)
                .withOptionalSex(0)
                .withOptionalAddress("earth")
                .buildEmployee();
        System.out.println(accountB);


        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.Construct(builder); // 发出组装机器人的指令

        Robot robot = builder.getRobot(); // 拿来拼装好的机器人

        System.out.println(robot); // 展示机器人
    }
}
