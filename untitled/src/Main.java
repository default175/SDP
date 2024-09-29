import java.util.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //Task 1
        User user = new User("Alice", "alice@example.com");
        EmailValidator validator = new EmailValidator();

        if (validator.isValid(user.getEmail())) {
            System.out.println(user.getName() + "'s email is valid.");
        } else {
            System.out.println(user.getName() + "'s email is invalid.");
        }


        //Task 2
            Shape rectangle = new Rectangle(5, 3);
            Shape circle = new Circle(4);

            System.out.println("Rectangle area: " + rectangle.area());
            System.out.println("Circle area: " + circle.area());
        }
    }

//Task 3
/*public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        ((Flyable) sparrow).fly();

        Bird penguin = new Penguin();
        penguin.eat();
    }
}
 */
//Task 4
/*
public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();

        humanWorker.work();
        ((Eatable) humanWorker).eat();

        robotWorker.work();
    }
}

 */





















