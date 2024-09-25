class Car {
    public void ModelOne() {
        System.out.println("Car");
    }
    static class Drive { // inner class
        public void driving(){
            System.out.println("Driving");
        }
    }
}


class Innerclass {
    public static void main(String args[]) {
        Car object = new Car();
        object.ModelOne();// basic access of methods
        // to access inner class
        //Car.Drive objectOne = object.new Drive();
        // reference drive is an inner class of Car
        //To call the method of B we need an object of A since B isnt static class and available to all objects
        // if Drive is static we donot need an object from the non inner class
        Car.Drive objectOne= new Car.Drive();
        objectOne.driving();
        // ststic can only be used for inner class


    }
}