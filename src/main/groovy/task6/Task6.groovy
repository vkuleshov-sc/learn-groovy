package task6

import groovy.io.FileType

static def deleteAllFiles(String path) {
    def dir = new File(path)
    dir.eachFileRecurse(FileType.FILES){
            it.delete()
    }
}

deleteAllFiles("D:\\work\\learn-groovy\\examples\\task2")