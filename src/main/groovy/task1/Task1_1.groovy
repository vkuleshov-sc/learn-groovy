package task1

class Task1_1 {
    static def getOnlyLowerCaseWords(String str) {
        str.split().
            findAll {
                it == it.toLowerCase()
            }
    }

    static def getPartOfString(String str) {
        str[11..16]
    }

    static def firstLetterToUpperCase(String str) {
        str.split(" ").collect { word ->
            word.capitalize()
        }.join(" ")
    }

    static def findPalindromes(String str, maxUniqueSymbols) {
        str.split(" ").findAll { word ->
            word.collect().unique().size() < maxUniqueSymbols && word.reverse() == word
        }
    }

    static def isContainsEmail(String str) {
        str ==~ ~/.*[A-Za-z0-9-_.]+@[A-Za-z0-9-_]+\.[A-Za-z0-9-_]+.*/
    }

}
