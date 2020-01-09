package task1

class TestTask1 {
    def static runTests() {
        println('STRING: ')
        testGetOnlyLowerCaseWords()
        testGetPartOfString()
        testFirstLetterToUpperCase()
        testFindPalindromes()
        testIsContainsEmail()
        println('ARRAY: ')
        testGetUniqueNumbersAmount()
        testGetMaxAndMin()
        testIncreaseNumbers()
        testGetCommonNumbers()
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
            if (answers[i] != Task1_1.getOnlyLowerCaseWords(testCase)) {
                failedCases.add([Task1_1.getOnlyLowerCaseWords(testCase), answers[i]])
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
            if (answers[i] != Task1_1.getPartOfString(testCase)) {
                failedCases.add([Task1_1.getPartOfString(testCase), answers[i]])
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
            "Some example teXT",
        ]
        def answers = [
            "Test1 Test2 Test3",
            "Some Example TeXT",
        ]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != Task1_1.firstLetterToUpperCase(testCase)) {
                failedCases.add([Task1_1.firstLetterToUpperCase(testCase), answers[i]])
            }
        }
        printTestResult(
            "Should print characters from the 11th to the 16th (taking into account that the string is more than 16 characters): ",
            failedCases
        )
    }

    static def testFindPalindromes() {
        def testCases = [
            "bob word reviver rotator each qwertytrewq loooooooooooool qwerrewq \t",
        ]
        def answers = [
            ["bob", "reviver", "rotator", "loooooooooooool", "qwerrewq", "\t"],
        ]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != Task1_1.findPalindromes(testCase, 5)) {
                failedCases.add([Task1_1.findPalindromes(testCase, 5), answers[i]])
            }
        }
        printTestResult(
            "Should find all words whose reverse (reverse order of letters) is identical to the word itself\n" +
                "and the number of different letters (excluding repetitions) in the word is less than 5: ",
            failedCases
        )
    }

    static def testIsContainsEmail() {
        def testCases = [
            "Simple text without email!",
            "HELLO, kuleshov@scand.com",
            "kuleshov@@scand.com",
            "123@karandash.by"
        ]
        def answers = [false, true, false, true]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != Task1_1.isContainsEmail(testCase)) {
                failedCases.add([Task1_1.isContainsEmail(testCase), answers[i]])
            }
        }
        printTestResult(
            "Should determine if the string contains an email address: ",
            failedCases
        )
    }

    static def testGetUniqueNumbersAmount() {
        def testCases = [
            [1, 2, 3, 4, 5, 6, 7, 8, 9],
            [1, 2, 3, 4, 5, 5, 5, 5, 5],
            [-1, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2,]
        ]
        def answers = [9, 5, 2]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != Task1_2.getUniqueNumbersAmount(testCase)) {
                failedCases.add([Task1_2.getUniqueNumbersAmount(testCase), answers[i]])
            }
        }
        printTestResult(
            "Should find the number of different numbers: ",
            failedCases
        )
    }

    static def testGetMaxAndMin() {
        def testCases = [
            [1, 2, 3, 4, 5, 6, 7, 8, 9],
            [1, 2, 3, 4, 5, 5, 5, 5, 5],
            [-1, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2,]
        ]
        def answers = [
            [1, 9],
            [1, 5],
            [-2, -1]
        ]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != Task1_2.getFindMinAndMax(testCase)) {
                failedCases.add([Task1_2.getFindMinAndMax(testCase), answers[i]])
            }
        }
        printTestResult(
            "Should find the best and minimum number: ",
            failedCases
        )
    }

    static def testIncreaseNumbers() {
        def testCases = [
            [1, 1, 1, -2],
            [0, -10],
            [-123, 11, 2]
        ]
        def answers = [
            [2, 2, 2, -6],
            [0, -30],
            [-369, 22, 4]
        ]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != Task1_2.increaseNumbers(testCase)) {
                failedCases.add([Task1_2.increaseNumbers(testCase), answers[i]])
            }
        }
        printTestResult(
            "Should increase each number 2 times if it is positive and three times if it is negative: ",
            failedCases
        )
    }

    static def testGetCommonNumbers() {
        def testCases = [
            [[1, 2, 3], [1, 2]],
            [[-1, -1, -1], [1, 2]],
            [[1, 1, 1], [1, 1]],
        ]
        def answers = [
            [1, 2],
            [],
            [1]
        ]
        def failedCases = []
        testCases.eachWithIndex { testCase, i ->
            if (answers[i] != Task1_2.getCommonNumbers(testCase[0], testCase[1])) {
                failedCases.add([Task1_2.getCommonNumbers(testCase[0], testCase[1]), answers[i]])
            }
        }
        printTestResult(
            "Should determine the numbers included in both the first and second array: ",
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
