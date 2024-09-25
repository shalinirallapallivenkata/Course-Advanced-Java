class MobileDevice{
    public void deviceOne() {
        System.out.println("Its an eyePhoneeeeeee");

    }
}
// class DeviceOther extends MobileDevice {
//     public void deviceOne() {
//         System.out.println("Its an FooSung");

//     }
// }

class Anonymousclass{
    public static void main (String args[]) {
        //MobileDevice object = new DeviceOther ();
        // reference parent 
        // object new created of sub class in Hash refers to parents class object thats overriden
        // by method over riding we can change the deviceOne if class child extends class parent
        //object.deviceOne();
        // above can be implemented in a differnt way
        MobileDevice object = new MobileDevice() 
        { // Anonymous class
            public void deviceOne() {
                System.out.println("Its an FooSung");
        
            }
        };
        object.deviceOne();
    }
}