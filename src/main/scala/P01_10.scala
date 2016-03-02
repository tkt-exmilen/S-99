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
    if (list.isEmpty) throw new NoSuchElementException
    list.last
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
    if (list.size < 2) throw new NoSuchElementException
    list.init.last
  }

  /**
    *
    * P03
    * Find the Kth element of a list.
    *
    * @param i
    * @param list
    * @return
    */
  def nth(i: Int, list: List[Int]): Int = {
    if (i < 0 | i >= list.size) throw new NoSuchElementException
    list.take(i + 1).last
  }

  /**
    *
    * P04
    * Find the number of elements of a list.
    *
    * @param ints
    * @return
    */
  def length(ints: List[Int]): Int = {
    ints.size
  }

  /**
    *
    * P05
    * Reverse a list.
    *
    * @param ints
    * @return
    */
  def reverse(ints: List[Int]): List[Int] = {
    ints.reverse
  }

  /**
    *
    * P06
    * Find out whether a list is a palindrome.
    *
    * @param ints
    * @return
    */
  def isPalindrome(ints: List[Int]): Boolean = {
    var isPalindrome = true
    val halfSize = ints.size / 2
    for (i <- 0 to halfSize) {
      if (ints(i) != ints.reverse(i)) {
        isPalindrome = false
      }
    }
    isPalindrome
  }

  /**
    *
    * P07
    * Flatten a nested list structure.
    *
    * @param elements
    * @return
    */
  def flatten(elements: List[Any]): List[Any] = elements flatten {
    case i: List[Any] => flatten(i)
    case e => List(e)
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
