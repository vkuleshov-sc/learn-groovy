package task6

def static deleteAllFiles(String path) {
    def dir = new File(path)
    dir.eachFileRecurse({
        if (it.isFile()) {
            it.delete()
        }
    })
}

deleteAllFiles("D:\\work\\learn-groovy\\examples\\task6")