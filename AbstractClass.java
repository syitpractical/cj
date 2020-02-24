abstract class p4c {
    public p4c() {
        System.out.println("Bike");
    }

    public void gear() {
        System.out.println("Gear");
    }

    abstract void speed();
}

class vehicle extends p4c {
    void speed() {
        System.out.println("Speed");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.gear();
        v.speed();
    }
}