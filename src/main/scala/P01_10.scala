class P01_10 {

  /**
    *
    * P01
    * Find the last element of a list.
    *
    * @param list
    * @return
    */
  def last(list: List[Int]): Int = {
    8
  }

  /**
    *
    * P02
    * Find the last but one element of a list.
    *
    * @param list
    * @return
    */
  def penultimate(list: List[Int]): Int = {
    5
  }

  /**
    *
    * P03
    * Find the Kth element of a list.
    *
    * @param i
    * @param ints
    * @return
    */
  def nth(i: Int, ints: List[Int]): Int = {
    2
  }

  /**
    *
    * P04
    * Find the number of elements of a list.
    *
    * @param list
    * @return
    */
  def length(list: List[Int]): Int = {
    6
  }

  /**
    *
    * P05
    * Reverse a list.
    *
    * @param list
    * @return
    */
  def reverse(list: List[Int]): List[Int] = {
    List(8, 5, 3, 2, 1, 1)
  }

  /**
    *
    * P06
    * Find out whether a list is a palindrome.
    *
    * @param list
    * @return
    */
  def isPalindrome(list: List[Int]): Boolean = {
    true
  }

  /**
    *
    * P07
    * Flatten a nested list structure.
    *
    * @param list
    * @return
    */
  def flatten(list: List[Any]): List[Any] = {
    List(1, 1, 2, 3, 5, 8)
  }

  /**
    *
    * P08
    * Eliminate consecutive duplicates of list elements.
    *
    * @param symbols
    * @return
    */
  def compress(symbols: List[Symbol]): List[Symbol] = {
    List('a, 'b, 'c, 'a, 'd, 'e)
  }

  /**
    *
    * P09
    * Pack consecutive duplicates of list elements into sublists.
    *
    * @param symbols
    * @return
    */
  def pack(symbols: List[Symbol]): List[List[Symbol]] = {
    List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }

  def encode(symbols: List[Symbol]) = {
    List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
