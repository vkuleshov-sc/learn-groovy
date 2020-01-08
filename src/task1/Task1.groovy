package task1

class Task1 {
    static def getOnlyLowerCaseWords(String str) {
        str.split(" ").
            findAll {
                it == it.toLowerCase()
            }
    }

    static def getPartOfString(String str) {
        str.toCharArray()[11..16].join("")
    }

    static def firstLetterToUpperCase(String str) {
        str.split(" ").collect { word ->
            def tmp = word.toCharArray()
            tmp[0] = tmp[0].toUpperCase()
            new String(tmp)
        }.join(' ')
    }

    static def findPalindrome(String str, maxUniqueSymbols) {
        str.split(" ").findAll { word ->
            def symbols = [];
            word.toCharArray().each {

            }
        }
    }

    static def tests() {
        testGetOnlyLowerCaseWords()
        testGetPartOfString()
        testFirstLetterToUpperCase()
    }

    static def testGetOnlyLowerCaseWords() {
        def testCases = [
            "test1 test2 test3 test4",
            "test1 test2 Test3 Test4",
            "test1 test2 tesT3 tesT4"
        ]
        def answers = [
            ["test1", "test2", "test3", "test4"],
            ["test1", "test2"],
            ["test1", "test2"],
        ]

        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != getOnlyLowerCaseWords(testCase)) {
                failedCases.add([getOnlyLowerCaseWords(testCase), answers[i]])
            }
        }
        printTestResult(
            "Should find all words containing only lowercase letters: ",
            failedCases
        )
    }

    static def testGetPartOfString() {
        def testCases = [
            "11symbols11HeyMom",
            "${"1" * 11}${"2" * 6}",
        ]
        def answers = [
            "HeyMom",
            "${"2" * 6}",
        ]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != getPartOfString(testCase)) {
                failedCases.add([getPartOfString(testCase), answers[i]])
            }
        }
        printTestResult(
            "Should print characters from the 11th to the 16th (taking into account that the string is more than 16 characters): ",
            failedCases
        )
    }

    static def testFirstLetterToUpperCase() {
        def testCases = [
            "test1 test2 test3",
        ]
        def answers = [
            "Test1 Test2 Test3",
        ]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != firstLetterToUpperCase(testCase)) {
                failedCases.add([firstLetterToUpperCase(testCase), answers[i]])
            }
        }
        printTestResult(
            "Should print characters from the 11th to the 16th (taking into account that the string is more than 16 characters): ",
            failedCases
        )
    }

    static def printTestResult(message, failedCases) {
        print message
        if (!failedCases.size()) {
            println "success!!!"
        } else {
            println "failed!!!"
            failedCases.eachWithIndex { failedCase, i ->
                println(i + 1 + ")")
                println("Received: ${failedCase[0]} ")
                println("Expected: ${failedCase[1]}")
            }
        }
    }
}
