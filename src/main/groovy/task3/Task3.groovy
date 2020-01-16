package task3

import groovy.io.FileType

class Task3 {
    def static renameFiles(String dirPath) {
        def dir = new File(dirPath)
        dir.eachFileRecurse(FileType.FILES) {
            if (it.name ==~ ~/[0-9]+\.txt/) {
                def splitName = it.name.split("\\.")
                splitName[(splitName.size() - 1)] = ""
                def newName = splitName.join("").reverse()
                newName += newName.toCharArray().collect{it.toString().toInteger()}.sum()
                println()
                it.renameTo(it.path.replace(it.name, "${newName}.dat"))
            }
        }
    }
}
