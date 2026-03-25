package org.example;

public class Main {
    public static void main(String[] args) {

        DBConnection.getConnection();

        DBConnection.createTable("person");

        DBConnection.insertPerson(new Person("John", "Doe", 25));
        DBConnection.insertPerson(new Person("Alice", "Smith", 30));

        System.out.println(DBConnection.getAllPerson());

        System.out.println(DBConnection.getPersonbyId(1));

        DBConnection.deletePersonBYId(1);

        DBConnection.closeConnection();
    }
}