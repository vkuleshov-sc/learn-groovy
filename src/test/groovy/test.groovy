import spock.lang.*
import task4.Address
import task4.Person

class MyFirstSpecification extends Specification {
    def "plussing two persons"() {
        given:
        def person1 =  new Person(
            address: new Address(city: 'Minsk', street: 'Kuznecova', index: 321123),
            surName: 'Ivan',
            firstName: 'Ivanov',
            age: 26
        )
        def person2 = new Person(
            address: new Address(city: 'Minsk', street: 'Kuznecova', index: 321123),
            surName: 'Sasha',
            firstName: 'Petrov',
            age: 33
        )
        def answer
        when:
        answer = person1 + person2
        then:
        answer == 59
    }
}
