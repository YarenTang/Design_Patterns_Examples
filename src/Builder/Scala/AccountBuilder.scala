package Builder.Scala

/**
  * Created by prefert on 2017/7/16.
  */
class AccountBuilder {
  var name = ""
  var nickname = ""
  var age = 0

  def setName(name:String):AccountBuilder = {
    this.name = name
    this
  }

  def setNickname(nickname:String):AccountBuilder = {
    this.nickname = nickname
    this
  }

  def setAge(age:Int):AccountBuilder = {
    this.age = age
    this
  }

  def build()  = {
    new Account(this)
  }
}
