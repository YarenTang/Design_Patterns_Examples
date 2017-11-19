package Adapter.Scala

/**
  * Created by prefert on 2017/11/20.
  */
object Test extends App{
  override def main(args: Array[String]): Unit = {
    val headsetAdapter = new HeadsetAdapter
    headsetAdapter.audioTraditionally

    //隐式
    val light: Lightning = new FinalPhoneJackConector
    light.audioWithLightning()
  }
}
