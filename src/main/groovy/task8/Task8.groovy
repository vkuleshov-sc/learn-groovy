package task8

def shell = new GroovyShell()
println("Run task 7 script:")
def task7Script = shell.parse(new File("D:/work/learn-groovy/src/main/groovy/task7/Task7.groovy"))
task7Script.run()

println("\nRun some script with arguments:")
def someScript = shell.parse(new File("D:/work/learn-groovy/src/main/groovy/task8/SomeScript.groovy"))
someScript.binding = new Binding([x: "HELLO WORLD!!!"])
someScript.run()


println("\nImport address class: ")
def gcl = new GroovyClassLoader()
def addressClass = gcl.parseClass(new File("D:/work/learn-groovy/src/main/groovy/task4/Address.groovy"))
def address = addressClass.newInstance(city: 'Minsk', street: 'Oktyabrskaya', index: 123321)
println address
