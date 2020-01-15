package task7

import task4.Address
import task4.Person

println("4^5 = ${4**5}")

def printValue = { value -> println(value ?: "no value") }
print("printValue(5): ")
printValue(5)
print("printValue(null): ")
printValue(null)

List<Person> personList = [
    new Person(
        address: new Address(city: 'Minsk', street: 'Oktybrskay', index: 123321),
        surName: 'Kuleshov',
        firstName: 'Vlad',
        age: 19
    ),
    new Person(
        address: new Address(city: 'Minsk', street: 'Kuznecova', index: 321123),
        surName: 'Ivan',
        firstName: 'Ivanov',
        age: 26
    ),
    new Person(
        surName: 'Sasha',
        firstName: 'Petrov',
        age: 33
    ),
]
println("Indexes ")
personList.each { println(it.address?.index ?: "no address") }