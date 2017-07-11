package Singleton.Scala

import scala.collection.convert.Wrappers.MutableMapWrapper
import scala.collection.mutable


/**
  * Created by prefert on 2017/7/9.
  */
object AppRegistry{
  println("Registry initialization block called.")
  private lazy val lazyXX  = ???
  private val users: scala.collection.mutable.HashMap[String, String] =  scala.collection.mutable.HashMap.empty

  def addUser(id: String, name: String): Unit = { users.put(id, name) }
  def removeUser(id: String): Unit = { users.remove(id) }
  def isUserRegistered(id: String): Boolean = users.contains(id)
  def getAllUserNames(): List[String] = users.map(_._2).toList
}
