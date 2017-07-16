package Builder.Scala

/**
  * Created by prefert on 2017/7/16.
  */
class AccountBuilderS[PassedStep <: BuildStep] private(
                                                      name: String,
                                                      nickname: String,
                                                      age: Int
                                                      ) {


  def build(): AccountS = new AccountS(name, nickname, age)

  protected def this() = this("", "", 0)

  protected def this(pb: AccountBuilderS[_]) = this(
    pb.name,
    pb.nickname,
    pb.age
  )


}

object PersonBuilder {
  def apply() = new AccountBuilderS[BuildStep]()
}
