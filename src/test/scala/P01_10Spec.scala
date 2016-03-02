import org.specs2.mutable.Specification

class P01_10Spec extends Specification {

  "P01_10Spec" should {

    "last" in {
      val p01_10 = new P01_10
      p01_10.last(List(1, 1, 2, 3, 5, 8)) must beEqualTo(8)
    }

    "penultimate" in {
      val p01_10 = new P01_10
      p01_10.penultimate(List(1, 1, 2, 3, 5, 8)) must beEqualTo(5)
    }

    "nth" in {
      val p01_10 = new P01_10
      p01_10.nth(2, List(1, 1, 2, 3, 5, 8)) must beEqualTo(2)
    }

    "length" in {
      val p01_10 = new P01_10
      p01_10.length(List(1, 1, 2, 3, 5, 8)) must beEqualTo(6)
    }

    "reverse" in {
      val p01_10 = new P01_10
      p01_10.reverse(List(1, 1, 2, 3, 5, 8)) must beEqualTo(List(8, 5, 3, 2, 1, 1))
    }

    "isPalindrome" in {
      val p01_10 = new P01_10
      p01_10.isPalindrome(List(1, 2, 3, 2, 1)) must beEqualTo(true)
    }

    "flatten" in {
      val p01_10 = new P01_10
      p01_10.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) must beEqualTo(List(1, 1, 2, 3, 5, 8))
    }

    "compress" in {
      val p01_10 = new P01_10
      p01_10.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must beEqualTo(List('a, 'b, 'c,
        'a, 'd, 'e))
    }

    "pack" in {
      val p01_10 = new P01_10
      p01_10.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must beEqualTo(List(List('a, 'a, 'a,
        'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    }

    "encode" in {
      val p01_10 = new P01_10
      p01_10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must beEqualTo(List((4,'a), (1,'b),
        (2,'c), (2,'a), (1,'d), (4,'e)))
    }

  }
}
