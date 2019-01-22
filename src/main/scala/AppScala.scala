package main.scala

import org.apache.spark.{SparkContext,SparkConf}
import com.github.tototoshi.csv._

object AppScala {

  def main(args:Array[String]): Unit = {

    val conf = new SparkConf().setAppName("event").setMaster("local")
    val sc = new SparkContext(conf)

    val result = task1(sc)
    println(result)

  }

  def task1(sc:SparkContext) = ???

}
