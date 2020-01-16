package task3

class Task3 {
    def static renameFiles(String dirPath) {
        def dir = new File(dirPath)
        dir.eachFileRecurse {
            if (it.name ==~ ~/[0-9]+\..+/) {
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
