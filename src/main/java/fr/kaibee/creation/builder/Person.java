package fr.kaibee.creation.builder;

import java.util.StringJoiner;

final public class Person {
    private String name;
    private String firstName;
    private int age;
    private String address;

    public static void main(String[] args) {
        Person build = Person.builder()
                .withAddress("dddd")
                .withName("ssssss")
                .withAge(10)
                .build();
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("firstName='" + firstName + "'")
                .add("age=" + age)
                .add("address='" + address + "'")
                .toString();
    }

    private Person(String name, String firstName, int age, String address) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.address = address;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class PersonBuilder {
        private String name;
        private String firstName;
        private int age;
        private String address;

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(name, firstName, age, address);
        }
    }


}
