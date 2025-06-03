// Bad Example (Violates ISP)

interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human is working.");
    }

    public void eat() {
        System.out.println("Human is eating.");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot is working.");
    }

    public void eat() {
        // Robots don't eat!
        throw new UnsupportedOperationException("Robots don't eat!");
    }
}

/* Problems:
RobotWorker is forced to implement eat(), which doesn't make sense.
This violates ISP — the interface is too broad.
*/

 // Good Example (Follows ISP)

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working.");
    }

    public void eat() {
        System.out.println("Human is eating.");
    }
}

class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot is working.");
    }
}

/* What should be done
Split the interface into two: Workable and Eatable.
Now, RobotWorker only implements what it needs (Workable).
This is clean, flexible, and follows Interface Segregation Principle.
*/
