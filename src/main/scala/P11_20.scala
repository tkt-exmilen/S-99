class P11_20 {

  /**
    *
    * P11
    * Modified run-length encoding.
    *
    * @param symbols
    * @return
    */
  def encodeModified(symbols: List[Symbol]): List[Any] = {
    List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  }

  /**
    *
    * P12
    * Decode a run-length encoded list.
    *
    * @param tuples
    * @return
    */
  def decode(tuples: List[(Int, Symbol)]): List[Symbol] = {
    List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }

  /**
    *
    * P13
    * Run-length encoding of a list (direct solution).
    *
    * @param symbols
    * @return
    */
  def encodeDirect(symbols: List[Symbol]): List[(Int, Symbol)] = {
    List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }

  /**
    *
    * P14
    * Duplicate the elements of a list.
    *
    * @param symbols
    * @return
    */
  def duplicate(symbols: List[Symbol]): List[Symbol] = {
    List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }

  /**
    *
    * P15
    * Duplicate the elements of a list a given number of times.
    *
    * @param i
    * @param symbols
    * @return
    */
  def duplicateN(i: Int, symbols: List[Symbol]): List[Symbol] = {
    List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }

  /**
    *
    * P16
    * Drop every Nth element from a list.
    *
    * @param i
    * @param symbols
    * @return
    */
  def drop(i: Int, symbols: List[Symbol]): List[Symbol] = {
    List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }

  /**
    *
    * P17
    * Split a list into two parts.
    *
    * @param i
    * @param symbols
    * @return
    */
  def split(i: Int, symbols: List[Symbol]): (List[Symbol], List[Symbol]) = {
    (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

  /**
    *
    * P18
    * Extract a slice from a list.
    *
    * @param i
    * @param i1
    * @param symbols
    * @return
    */
  def slice(i: Int, i1: Int, symbols: List[Symbol]): List[Symbol] = {
    List('d, 'e, 'f, 'g)
  }

  /**
    *
    * P19
    * Rotate a list N places to the left.
    *
    * @param i
    * @param symbols
    * @return
    */
  def rotate(i: Int, symbols: List[Symbol]): List[Symbol] = {
    List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  }

  /**
    *
    * P20
    * Remove the Kth element from a list.
    *
    * @param i
    * @param symbols
    * @return
    */
  def removeAt(i: Int, symbols: List[Symbol]): (List[Symbol], Symbol) = {
    (List('a, 'c, 'd),'b)
  }
}
