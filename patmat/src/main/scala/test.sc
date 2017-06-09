import patmat.Huffman._

val l = List('a','a','b','a','b','a','c','c','d','c','f','f','f','f','f','f')

makeOrderedLeafList(times(l))

until(singleton, combine)(List(Fork(Leaf('a', 1), Leaf('c', 3), List('a','c'), 4), Leaf('a', 43), Leaf('d', 50)))

makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)))