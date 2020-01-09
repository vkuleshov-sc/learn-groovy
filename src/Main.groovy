import task1.TestTask1
import task2.TestTask2
import task3.Task3

class Main {
    def static main(args) {
        TestTask1.runTests()
        println()
        TestTask2.runTests()
        Task3.renameFiles("D:\\work\\learn-groovy\\examples\\task3")
    }
}
