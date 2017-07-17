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
    System.out.println(s"Account1: { \n name: ${account.name}\n nickname: ${account.nickname}\n age: ${account.age} }")

  //case class 版测试
  val account1 = AccountB(
    name = "Bat-Man",
    nickname = "Dark-Knight",
    age = 24
  )

  val account2 = AccountB(name = "prefert")

  System.out.println(s"AccountB 1: $account1")
  System.out.println(s"AccountB 2: $account2")


  // 类型安全版 测试
  val account3 = AccountBuilderS()
    .setName("tyl")
    .setNickname("prefert")
    .setAge(23)
    .build()
  System.out.println(s"Account: $account3")

  // 简化版
  val account4 = AccountC(
    name = "Bat-Man",
    nickname = "Dark-Knight",
    age = 24
  )
  System.out.println(s"AccountC 4: $account4")

  try {
    val account5 = AccountC(name = "Bat-Man",
      nickname = "Dark-Knight"
    )
  }catch {
    case e :Throwable => e.printStackTrace()
  }
}
