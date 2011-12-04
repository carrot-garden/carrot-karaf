package com.carrotgarden.test

class TestFor {

}

/**
 * http://www.infoq.com/news/2011/11/yammer-scala
 */

object TestFor {

  val COUNT = 1000000

  def main(args: Array[String]) {

    {

      var start = System.currentTimeMillis();
      var total = 0; for (i <- 0 until COUNT) { total += i };
      var end = System.currentTimeMillis();
      println(end - start);
      println(total);

    }

    //

    {

      var start = System.currentTimeMillis();
      var total = 0; var i = 0; while (i < COUNT) { i = i + 1; total += i };
      var end = System.currentTimeMillis();
      println(end - start);
      println(total);

    }

  }

}