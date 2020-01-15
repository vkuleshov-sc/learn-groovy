package task4

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
        address: new Address(city: 'Minsk', street: 'Kuznecova', index: 321123),
        surName: 'Sasha',
        firstName: 'Petrov',
        age: 33
    ),
]

print "Age < 30: "
println personList.findAll({ it.age < 30 })
Person.metaClass.toString = {
    "${delegate.surName} ${delegate.firstName} (${delegate.age})"
}
print "Unique address: "
personList.collect({ it.address }).unique { a, b ->
    a.toString() <=> b.toString()
}.each {
    print "$it; "
}
println()
println "(${personList[0]}) + (${personList[1]}) = ${personList[0] + personList[1]}"
println "(${personList[1]}) - (${personList[0]}) = ${personList[1] - personList[0]}"


