import org.specs2.mutable.Specification

class P11_20Spec extends Specification {

  "encodeModified" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must beEqualTo(List((4,'a),
        'b, (2,'c), (2,'a), 'd, (4,'e)))
    }

  }

  "decode" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) must beEqualTo(List('a, 'a, 'a, 'a, 'b,
        'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    }

  }

  "encodeDirect" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must beEqualTo(List((4,'a),
        (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    }

  }

  "duplicate" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.duplicate(List('a, 'b, 'c, 'c, 'd)) must beEqualTo(List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))

    }
  }

  "duplicateN" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) must beEqualTo(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c,
        'd, 'd, 'd))
    }

  }

  "drop" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must beEqualTo(List('a, 'b, 'd, 'e, 'g, 'h, 'j,
        'k))
    }

  }

  "split" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must beEqualTo((List('a, 'b, 'c),List('d, 'e,
        'f, 'g, 'h, 'i, 'j, 'k)))
    }

  }

  "slice" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must beEqualTo(List('d, 'e, 'f, 'g))
    }

  }

  "rotate" should {

    "normal_1" in {
      val p11_20 = new P11_20
      p11_20.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must beEqualTo(List('d, 'e, 'f, 'g, 'h, 'i, 'j,
        'k, 'a, 'b, 'c))
    }

//    "normal_2" in {
//      val p11_20 = new P11_20
//      p11_20.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//    }

  }

  "removeAt" should {

    "normal" in {
      val p11_20 = new P11_20
      p11_20.removeAt(1, List('a, 'b, 'c, 'd)) must beEqualTo((List('a, 'c, 'd),'b))
    }

  }

}
