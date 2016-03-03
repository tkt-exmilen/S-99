class P01_10 {

  /**
    *
    * P01
    * Find the last element of a list.
    *
    * @param ints
    * @return
    */
  def last(ints: List[Int]): Int = {
    if (ints.isEmpty) throw new NoSuchElementException
    ints.last
  }

  /**
    *
    * P02
    * Find the last but one element of a list.
    *
    * @param ints
    * @return
    */
  def penultimate(ints: List[Int]): Int = {
    if (ints.size < 2) throw new NoSuchElementException
    ints.init.last
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
    if (i < 0 | i >= ints.size) throw new NoSuchElementException
    ints.take(i + 1).last
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
    var outList =  List[Symbol]()
    for (symbol <- symbols) {
      if (outList.isEmpty) {
        outList = outList :+ symbol
      } else if (outList.last != symbol) {
        outList = outList :+ symbol
      }
    }
    return outList
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
    var outList = List[List[Symbol]]()
    var tempList = List[Symbol]()
    for (symbol <- symbols) {
      if (tempList.isEmpty) tempList = tempList :+ symbol
      else if (tempList.last == symbol) tempList = tempList :+ symbol
      else if (tempList.last != symbol) {
        outList = outList :+ tempList
        tempList = List(symbol)
      }
    }
    outList = outList :+ tempList
    outList
  }

  /**
    *
    * P10
    * Run-length encoding of a list.
    *
    * @param symbols
    * @return
    */
  def encode(symbols: List[Symbol]): List[(Int, Symbol)] = {
    var outList = List[(Int, Symbol)]()
    for (list <- pack(symbols)) {
      outList = outList :+ (list.length, list.head)
    }
    outList
  }
}
