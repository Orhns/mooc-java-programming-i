/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarunas
 */
public class Example11 {
    public static void main(String[] args) {
        Person11 first = new Person11("First");

        System.out.println(first);
        youthen(first);
        System.out.println(first);

        Person11 second = first;
        youthen(second);

        System.out.println(first);
    }

    public static void youthen(Person11 person) {
        person.setBirthYear(person.getBirthYear() + 1);
    }
}
