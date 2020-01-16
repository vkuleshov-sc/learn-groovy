package task9

def static getFieldsAmount(String path, value) {
    def file = new File(path)
    Integer result = 0
    String tmp = ""
    file.eachLine {
        if (tmp == "" && it.trim() ==~ ~/<field.*>/) {
            tmp += it
        } else {
            if (tmp != "") {
                tmp += it + '\n'
            }
            if (it.trim() == "</field>") {
                if (new XmlParser().parseText(tmp).text().trim() == value.trim()) {
                    result++
                }
                tmp = ""
            }
        }
    }
    return result
}

println getFieldsAmount("D:\\work\\learn-groovy\\examples\\task9\\test.xml", "SOME_VALUE_1")