package Adapter.Scala

/**
  * Created by prefert on 2017/11/20.
  */
final class FinalPhoneJackConector {
    def  audioTraditionally = println("通过 PhoneJack 播放声音")
  }

object FinalPhoneJackConector {
    implicit class ImplictHeadsetAdapter(phoneJackConnector: FinalPhoneJackConector) extends Lightning {
      override def audioWithLightning: Unit =  println("通过 Lightning 播放声音")
    }
}