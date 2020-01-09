package task2

class TestTask2 {
    def static runTests() {
        println("Directory scanning result: ")
        def scanResult = Task2.scanDir("D:\\work\\learn-groovy\\examples\\task2")
        scanResult.collect { k, v ->
            "*Name: $k*\n*Quantity: $v.quantity*\n*Size: $v.size*"
        }.each { println it + "\n" }
        println("XML: ")
        println(Task2.createXML(scanResult))
    }
}
