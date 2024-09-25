
enum Laptop { // enum class of latop objects
    Macbook(1000), dell(800), lenovo(500), surface();
    // price needs to be created for enum to know
    private int price;
    // create constructor which takes price as argument

    // if a price not set for a laptop gives error because the constructor added here has argument price
    // so create a construcdtor add price

    private Laptop() { // this is a default constructor
        // and can specify the price
        price= 1200; // adds to surface 
    }

    private Laptop(int price){
        this.price = price;
    } 

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}



class EnumConstructor {
    public static void main(String args[]) {
        //Laptop device = Laptop.Macbook;
        //System.out.println(device + " " + device.getPrice());
        // prints MAcbook but we need price too
        // but private so add getters and setters
        // for all laptops and values

        for(Laptop device: Laptop.values()){
            System.out.println(device + ":" + " " + device.getPrice());
        }

    }
}