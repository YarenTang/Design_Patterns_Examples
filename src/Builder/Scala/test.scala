package Builder.Scala

/**
  * Created by prefert on 2017/7/15.
  */
object test extends App{
    val account:Account = new AccountBuilder()
      .setName("Bat-Man")
      .setNickname("Dark-Knight")
      .setAge(23)
      .build()
    System.out.println(s"Account: { \n name: ${account.name}\n nickname: ${account.nickname}\n age: ${account.age} }")

  //case class 版测试
  val account1 = AccountB(
    name = "Bat-Man",
    nickname = "Dark-Knight",
    age = 24
  )

  val account2 = AccountB(name = "prefert")

  System.out.println(s"AccountB 1: $account1")
  System.out.println(s"AccountB 2: $account2")
}