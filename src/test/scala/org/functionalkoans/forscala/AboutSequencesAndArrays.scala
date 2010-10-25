package org.functionalkoans.forscala

import support.KoanSuite
import support.BlankValues._
import org.scalatest.matchers.ShouldMatchers

class AboutSequencesAndArrays extends KoanSuite with ShouldMatchers {

  koan ("A list can be converted to an array") {
    val l = List(1,2,3)
    val a = l.toArray
    a should equal (Array(1,2,3))
  }

  koan ("Any sequence can be converted to a list") {
    val a = Array(1,2,3)
    val s = a.toSeq
    val l = s.toList
    l should equal (List(1,2,3))
  }

  koan ("You can create a sequence from a for comprehension") {
    val s = for ( v <- 1 to 4 ) yield v
    s.toList should be (List(1,2,3,4))
  }

  koan ("You can create a sequence from a for comprehension with a condition") {
    val s = for ( v <- 1 to 10 if v % 3 == 0) yield v
    s.toList should be (List(3,6,9))
  }

  koan ("You can filter any sequence based on a predicate") {
    val s = Seq("hello", "to", "you")
    val filtered = s.filter(_.length > 2)
    filtered should be (Seq("hello", "you"))
  }

  koan ("You can also filter Arrays in the same way") {
    val a = Array("hello", "to", "you", "again")
    val filtered = a.filter(_.length > 3)
    filtered should be (Array("hello", "again"))
  }

  koan ("You can map values in a sequence through a function") {
    val s = Seq("hello", "world")
    val r = s map {_.reverse}

    r should be (Seq("olleh", "dlrow"))
  }

}
