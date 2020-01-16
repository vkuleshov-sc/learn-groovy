package task2

import groovy.io.FileType
import groovy.xml.MarkupBuilder

class Task2 {
    def static scanDir(String path) {
        def dir = new File(path)
        def res = [:]
        dir.eachFileRecurse(FileType.FILES) {
            if (it.name ==~ ~/.*groovy\.[^.]+/) {
                if (res[it.name]) {
                    res[it.name].quantity++
                    res[it.name].size += it.size() / 1000 / 1024
                } else {
                    res[it.name] = [
                        "quantity": 1,
                        "size"    : it.size() / 1000 / 1024
                    ]
                }
            }
        }
        return res
    }

    def static createXML(Map files) {
        def writer = new StringWriter()
        def builder = new MarkupBuilder(writer)
        files.each { k, v ->
            builder.fileData() {
                name(k)
                quantity(v.quantity)
                size(v.size)
            }
        }
        return writer.toString()
    }
}
