package task4

Integer.metaClass.getInverse = { -> 1 / (int) delegate }
Integer.metaClass.static.getPrimeNumbers = { from, to ->
    def result = []
    def isSimple = { n ->
        for (int i = 2; i <= n / 2; i++) {
            if ((n % i) == 0) {
                return false
            }
        }
        return true
    }
    for (int i = from; i <= to; i++) {
        if (isSimple(i)) {
            result.add(i)
        }
    }
    return result
}

List.metaClass.static.concat = { List a, List b ->
    def tmp = []
    tmp.addAll(a)
    tmp.addAll(b)
    return tmp
}

List.metaClass.println = {
    println(delegate)
}

Integer a = 4
Integer from = 1
Integer to = 100
println "Inverse ${a}: ${a.getInverse()} "
println "Prime numbers from ${from} to ${to}: ${Integer.getPrimeNumbers(from, to)}"

def listA = [1, 2, 3, 4, 5]
def listB =  [6, 7, 8, 9]
print "Print list A: "
listA.println()
print "Concat list A with list B: ${List.concat(listA,listB)}"