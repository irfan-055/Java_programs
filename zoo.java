public class Zoo {
    interface Animal {
        void makeSound(); 
        void move();
    }

    static class Bird implements Animal {
        public void makeSound() {
            System.out.println("Tweet");
        }

        public void move() {
            System.out.println("Fly");
        }
    }

    static class Dog implements Animal {
        public void makeSound() {
            System.out.println("Bark");
        }

        public void move() {
            System.out.println("Run");
        }
    }

    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal dog = new Dog();

        System.out.println("Bird Behavior:");
        bird.makeSound();
        bird.move();

        System.out.println("\nDog Behavior:");
        dog.makeSound();
        dog.move();
    }
}
