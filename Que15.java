package A;

 class Vehicle {
    String color;
    int Speed;
    int MaxSpeed;
    
    Vehicle(String color,int Speed)
    {
        this.color=color;
        this.MaxSpeed=MaxSpeed;
        this.Speed=0;
    }
    void speed()
    {
        if(Speed > MaxSpeed)
        {
            throw new IllegalArgumentException("Speed exceeds maximum speed for this Vehicle");
        }
        this.Speed=Speed;
    }
}
class Truck extends Vehicle{
    Truck(String color) {
        super(color, 100);
    }
        void speed(int Speed) {
            if (Speed > 100) {
                throw new IllegalArgumentException("Speed cannot exceed 100 km/h for trucks");
            }
            this.Speed = Speed;
}
}
class Submarine extends Vehicle {
    public Submarine(String color) {
        super(color, 20); // Example: Submarines have a max speed of 20 knots
    }
    public void speed(int speed) {
        if (Speed > 20) {
            throw new IllegalArgumentException("Speed cannot exceed 20 knots for submarines");
        }
        this.Speed = Speed;
    }
}
class Main {
    public static void main(String[] args) {
        // Creating instances of Truck and Submarine
        Truck truck = new Truck("Red");
        Submarine submarine = new Submarine("Blue");

        // Setting speeds within limits
        try {
            truck.speed(80);
            submarine.speed(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(truck);
        System.out.println(submarine);
        // trying to set limit for truck
        try {
            truck.speed(120);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            submarine.speed(25); // Raises IllegalArgumentException: Speed cannot exceed 20 knots for submarines
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

