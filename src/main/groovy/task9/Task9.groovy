package task9

def static getFieldsAmount(String path, value) {
    Integer result = 0
    def node = new XmlSlurper().parse(path)
    node.children().each {
        if (it.name() == "field" && it.text() == value) {
            result++
        }
    }
    return result
}

println getFieldsAmount("D:\\work\\learn-groovy\\examples\\task9\\bigTest.xml", "\n" +
    "        SOME_VALUE_1\n" +
    "    ")