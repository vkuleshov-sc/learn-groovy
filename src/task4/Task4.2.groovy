package task4

def closure = { Integer num, String str, Closure action ->
    return action(num, str)
}
def subClosure = { num, str -> print(str * num) }
closure(7, 'Hello World!!!\n', subClosure)


