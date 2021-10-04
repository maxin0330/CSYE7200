/*
 * Copyright (c) 2018. Phasmid Software
 */

package edu.neu.coe.csye7200.lab99.scala99

import scala.annotation.tailrec

object P00 {
  def flatten[X](xss: List[List[X]]): List[X] = {
    @scala.annotation.tailrec
    def inner(r: List[X], wss: List[List[X]]): List[X] = wss match {
      case Nil => r
      case h :: t => inner(r ++ h, t)
    }

    inner(Nil, xss)
  }

  def fill[X](n: Int)(x: X): List[X] = {
    @scala.annotation.tailrec
    def inner(r: List[X], l: Int): List[X] = if (l <= 0) r else inner(r :+ x, l - 1)

    inner(Nil, n)
  }
}

object P01 {

  @scala.annotation.tailrec
  def last[X](xs: List[X]): X = xs match{
    case Nil => throw new NoSuchElementException
    case h:: Nil =>h
    case h :: t => last(t)
  } // TO BE IMPLEMENTED
}

object P02 {

  def penultimate[X](xs: List[X]): X = xs match{
    case h :: _ :: Nil =>h
    case h::t => penultimate(t)
    case h => throw new NoSuchElementException
  } // TO BE IMPLEMENTED
}

object P03 {

  def kth[X](k: Int, xs: List[X]): X = (k,xs) match {
    case (0, x:: _) =>x
    case (n, _::t) => kth(n-1, t)
    case (_,_) => throw new NoSuchElementException
  }// TO BE IMPLEMENTED
}

object P04 {

  def length[X](xs: List[X]): Int = {
//    @tailrec
//    def inner(result: Int, _xs: List[X]): Int = {
//      _xs match {
//        case Nil => result
//        case _ :: t => inner(result + 1, t)
//      }
//    }
//
//    inner(0, xs)
    def anyname(r: Int, work: List[X]):Int = work match {
      case Nil => r
      case _:: t => anyname(r+1,t)
    }
    anyname(0,xs)
  }
}

object P05 {

  def reverse[X](xs: List[X]): List[X] = {
    def inner(r:List[X],_xs: List[X]): List[X] = _xs match {
      case Nil => r
      case h::t => inner(h +: r,t)
    }
    inner(Nil, xs)
//    xs match {
//      case Nil=>Nil
//      case _::Nil => xs
//      case h :: t => reverse(t):+h
//    }
  }
    // TO BE IMPLEMENTED
}

object P06 {

  // inefficient solution
  def isPalindrome[X](xs: List[X]): Boolean = ??? // TO BE IMPLEMENTED
}

object P07 {

  type ListAny = List[Any]

  def flatten(xs: ListAny): ListAny = {
    // TO BE IMPLEMENTED
    ???
  }
}

object P08 {

  def compress[X](xs: List[X]): List[X] = {
    // TO BE IMPLEMENTED
    ???
  }
}

object P09 {

  def pack[X](xs: List[X]): List[List[X]] = {
    // TO BE IMPLEMENTED
    ???
  }
}

object P10 {

  def encode[X](xs: List[X]): List[(Int, X)] = ??? // TO BE IMPLEMENTED
}

object P11 {

  def encodeModified[X](xs: List[X]): List[Any] = ??? // TO BE IMPLEMENTED
}

object P12 {

  def decode[X](xIs: List[(Int, X)]): List[X] = ??? // TO BE IMPLEMENTED
}

object P13 {

  def encodeDirect[X](xs: List[X]): List[(Int, X)] = {
    // TO BE IMPLEMENTED
    ???
  }
}

object P14 {

  def duplicate[X](xs: List[X]): List[X] = {
    // TO BE IMPLEMENTED
    ???
  }
}

object P15 {

  def duplicateN[X](n: Int, xs: List[X]): List[X] = {
    // TO BE IMPLEMENTED
    ???
  }
}
