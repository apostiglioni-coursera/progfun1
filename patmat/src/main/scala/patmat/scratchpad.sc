import patmat.Huffman._

object Scratchpad {
  val t1: Fork = Fork.apply(Leaf.apply('a',2), Leaf.apply('b',3), List.apply('a','b'), 5)
  val t2: Fork = Fork.apply(Fork.apply(Leaf.apply('a',2), Leaf.apply('b',3), List.apply('a','b'), 5), Leaf.apply('d',4), List.apply('a','b','d'), 9)

  createCodeTree(augmentString("AAAAERTYUI").toList)


  Nil == List()

  decodedSecret.mkString

  convert(frenchCode)

  quickEncode(frenchCode)("huffmanestcool".toList) == secret
}
