package task4

class Address {
    private String city
    private String street
    private Integer index

    String toString() {
        return "${city}, ${street}, ${index}"
    }
}
