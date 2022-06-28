package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    public Dog() {
        System.out.println("Собака создана\n");
    }

    public String toString() {
        return "I'm a dog";
    }
}
