interface vone {
    int speed = 100;

    public void speed();
}

interface vtwo {
    int distance = 500;

    public void distance();
}

class vehicle implements vone, vtwo {
    public void speed() {
        System.out.println("Speed: " + speed);
    }

    public void distance() {
        System.out.println("Distance: " + distance);
    }
}

class MultipleInheritance {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.speed();
        v.distance();
    }
}