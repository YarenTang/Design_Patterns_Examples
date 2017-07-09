package Singleton

import Singleton.Scala.{AppRegistry, Singleton2Scala}

/**
  * Created by prefert on 2017/7/8.
  */
object Test {
  def main(args: Array[String]): Unit = {
    println(Singleton2Scala.sum(List(1, 2, 3, 4, 5)))

    testAppRegistry()
  }

  def testAppRegistry(){
    System.out.println("Sleeping for 5 seconds.")
    Thread.sleep(5000)
    System.out.println("I woke up.")
    AppRegistry.addUser("1", "Ivan")
    AppRegistry.addUser("2", "John")
    AppRegistry.addUser("3", "Martin")
    System.out.println(s"Is user with ID=1 registered? ${AppRegistry.isUserRegistered("1")}")
    System.out.println("Removing ID=2")
    AppRegistry.removeUser("2")
    System.out.println(s"Is user with ID=2 registered? ${AppRegistry.isUserRegistered("2")}")
    System.out.println(s"All users registered are: ${AppRegistry.getAllUserNames().mkString(",")}")
  }
}

