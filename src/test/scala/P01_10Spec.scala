import org.specs2.mutable.Specification

class P01_10Spec extends Specification {

  "last" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.last(List(1, 1, 2, 3, 5, 8)) must beEqualTo(8)
    }

    "exception NullPointerException" in {
      val p01_10 = new P01_10
      p01_10.last(null) must throwA[NullPointerException]
    }

    "exception NoSuchElementException" in {
      val p01_10 = new P01_10
      p01_10.last(List()) must throwA[NoSuchElementException]
    }

  }

  "penultimate" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.penultimate(List(1, 1, 2, 3, 5, 8)) must beEqualTo(5)
    }

    "exception NullPointerException" in {
      val p01_10 = new P01_10
      p01_10.penultimate(null) must throwA[NullPointerException]
    }

    "exception NoSuchElementException" in {
      val p01_10 = new P01_10
      p01_10.penultimate(List(1)) must throwA[NoSuchElementException]
    }
  }

  "nth" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.nth(2, List(1, 1, 2, 3, 5, 8)) must beEqualTo(2)
    }

    "exception NoSuchElementException" in {
      val p01_10 = new P01_10
      p01_10.nth(6, List(1, 1, 2, 3, 5, 8)) must throwA[NoSuchElementException]
    }

  }

  "length" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.length(List(1, 1, 2, 3, 5, 8)) must beEqualTo(6)
    }

  }

  "reverse" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.reverse(List(1, 1, 2, 3, 5, 8)) must beEqualTo(List(8, 5, 3, 2, 1, 1))
    }

  }

  "isPalindrome" should {

    "true" in {
      val p01_10 = new P01_10
      p01_10.isPalindrome(List(1, 2, 3, 2, 1)) must beEqualTo(true)
    }

    "false" in {
      val p01_10 = new P01_10
      p01_10.isPalindrome(List(1, 3, 3, 2, 1)) must beEqualTo(false)
    }

  }

  "flatten" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) must beEqualTo(List(1, 1, 2, 3, 5, 8))
    }

  }

  "compress" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must beEqualTo(List('a, 'b, 'c,
        'a, 'd, 'e))
    }

  }

  "pack" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must beEqualTo(List(List('a, 'a, 'a,
        'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    }

  }

  "encode" should {

    "normal" in {
      val p01_10 = new P01_10
      p01_10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must beEqualTo(List((4,'a), (1,'b),
        (2,'c), (2,'a), (1,'d), (4,'e)))
    }

  }
}
