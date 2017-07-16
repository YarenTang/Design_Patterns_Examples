package Builder.Scala

/**
  * Created by prefert on 2017/7/16.
  * 仿 java 版
  */
class Account(builder: AccountBuilder) {
    val name = builder.name
    val nickname = builder.nickname
    val age = builder.age
  }



