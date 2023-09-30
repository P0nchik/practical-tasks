package com.walking.lesson18_instanceof_getClass.task1_instanceof;

/**
 * Реализовать задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson13_inheritance/task2">...</a>
 * используя instanceof.
 */

import com.walking.lesson18_instanceof_getClass.Task1.zoo.Animal;
import com.walking.lesson18_instanceof_getClass.Task1.zoo.Cat;
import com.walking.lesson18_instanceof_getClass.Task1.zoo.Cow;
import com.walking.lesson18_instanceof_getClass.Task1.zoo.Dog;

/**
 * Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
 * Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
 * Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению,
 * если они необходимы.
 * <p>
 * Каждый из методов должен выводить в консоль соответствующую ему строку:
 * "woof ", "meow " или "moo".
 * <p>
 * В main() создать и наполнить в произвольном порядке
 * объектами разных классов-наследников массив типа Animal.
 * Реализовать метод, принимающий массив Animal и вызывающий метод,
 * характерный для конкретного животного.
 * Дополнительное условие (необязательно): решить задачу, при условии,
 * что woof(), meow() и moo() внутри себя выполняют только вызов protected-метода sound(),
 * который определен в Animal.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Sharik"),new Cat("Murka"),new Cow("Burenka")};
        soundAll(animals);
    }
    private static void soundAll(Animal[] animals){
        for (Animal animal : animals){
            if (animal instanceof Dog someDog)
                someDog.woof();
            else if (animal instanceof Cat someCat)
                someCat.meow();
            else if (animal instanceof Cow someCow)
                someCow.Moo();
            else System.out.println("There is wrong animal...");
        }
    }
}
