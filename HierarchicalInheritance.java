class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies in the sky.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.eat();
        dog.sound();
        dog.bark();

        Cat cat = new Cat();
        System.out.println("\nCat:");
        cat.eat();
        cat.sound();
        cat.meow();

        Bird bird = new Bird();
        System.out.println("\nBird:");
        bird.eat();
        bird.sound();
        bird.fly();
    }
}