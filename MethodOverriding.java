class bank {
    int rateOfInterest() {
        return 0;
    }
}

class axis extends bank {
    int rateOfInterest() {
        return 7;
    }
}

class icici extends bank {
    int rateOfInterest() {
        return 9;
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        bank b = new bank();
        System.out.println(b.rateOfInterest());
        axis a = new axis();
        System.out.println(a.rateOfInterest());
        icici i = new icici();
        System.out.println(i.rateOfInterest());
    }
}