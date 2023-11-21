// Product - Car
class Car {
    private String color;
    private int engineCapacity;
    private int numDoors;

    public Car(String color, int engineCapacity, int numDoors) {
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.numDoors = numDoors;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the engineCapacity
     */
    public int getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * @param engineCapacity the engineCapacity to set
     */
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    /**
     * @return the numDoors
     */
    public int getNumDoors() {
        return numDoors;
    }

    /**
     * @param numDoors the numDoors to set
     */
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    
}

// Builder
class CarBuilder {
    private String color;
    private int engineCapacity;
    private int numDoors;

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

    public CarBuilder setNumDoors(int numDoors) {
        this.numDoors = numDoors;
        return this;
    }

    public Car build() {
        Car car = new Car(color, engineCapacity, numDoors);
        reset();
        return car;
    }

    public void reset() {
        color = null;
        engineCapacity = 0;
        numDoors = 0;
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a car using the builder
        CarBuilder builder = new CarBuilder();

        Car car = builder.setColor("Red")
                         .setEngineCapacity(2000)
                         .setNumDoors(4)
                         .build();

        // Access car properties
        System.out.println("Color: " + car.getColor());
        System.out.println("Engine Capacity: " + car.getEngineCapacity());
        System.out.println("Number of Doors: " + car.getNumDoors());
    }
}

// Director
class CarDirector {
    public Car constructSportsCar() {
        return new CarBuilder()
                .setColor("Red")
                .setEngineCapacity(3000)
                .setNumDoors(2)
                .build();
    }

    public Car constructSUV() {
        return new CarBuilder()
                .setColor("Blue")
                .setEngineCapacity(2500)
                .setNumDoors(4)
                .build();
    }
}
