package main.scala

import org.apache.spark.{SparkContext,SparkConf}

object AppScala {

  def main(args:Array[String]): Unit = {

    println("in scala")
    val conf = new SparkConf().setAppName("event").setMaster("local")
    val sc = new SparkContext(conf)

    val data = sc.textFile("D:\\projects\\hiring-event\\src\\main\\resources\\test")


    data.collect().foreach(println)

  }

}
