package com.carrotgarden.test

class TestMap {

}

object TestMap {

  val COUNT = 1000000

  def scala() {

    println("--")
    println("-- SCALA:")
    println("--")

    val s = new collection.mutable.HashMap[Int, Int]();
    var i = 0;
    val start = System.currentTimeMillis();
    while (i < COUNT) { i = i + 1; s.put(i, i); };
    val end = System.currentTimeMillis();
    println(end - start);
    println(s.size)
  }

  def javaHashMap() {

    println("--")
    println("-- JAVA HASHMAP:")
    println("--")

    val m = new java.util.HashMap[Int, Int];
    var i = 0;
    val start = System.currentTimeMillis();
    while (i < COUNT) { i = i + 1; m.put(i, i); };
    val end = System.currentTimeMillis();
    println(end - start);
    println(m.size)
  }

  def javaConcurrentHashMap() {

    println("--")
    println("-- JAVA CONCURRENTHASHMAP:")
    println("--")

    val c = new java.util.concurrent.ConcurrentHashMap[Int, Int];
    var i = 0;
    val start = System.currentTimeMillis();
    while (i < COUNT) { i = i + 1; c.put(i, i); };
    val end = System.currentTimeMillis();
    println(end - start);
    println(c.size)
  }

  def main(args: Array[String]) {

    javaConcurrentHashMap()

    javaHashMap()

    scala()

  }

}
