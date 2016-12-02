// COSC 455 - Programming Languages: Implementation and Design
// Project 2

// NAME: MatarAlnuaimi

def prime(n: Int) = !((2 until math.sqrt(n).toInt) exists (n % _ == 0))

def twinprimes(a: Int, b: Int) = (prime(a) && prime(b) && (b - a == 2))

def twinprimeslist(n: Int) = for (p <- List.range(2, n) if twinprimes(p, p+2); r <- List(p, p+2)) yield r

def goldbach(n: Int): Unit = {
  assert(n > 2 && n%2 == 0)
  for(i <- List.range(1, n/2))
    if(prime(i) && prime(n - i))
      return Pair(i, n - i)
}
