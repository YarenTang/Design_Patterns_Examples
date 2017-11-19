package Adapter.Scala

/**
  * Created by prefert on 2017/11/20.
  */
class HeadsetAdapter extends PhoneJackConnector with Lightning {
  override def audioTraditionally: Unit = println("通过 Lightning 播放声音")

  override def audioWithLightning: Unit = println("通过 Lightning 播放声音")
}
