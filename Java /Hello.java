class Hello {
    public static void main(String args[]) {
        //System.out.println("Hello World");
        int num = 11;
        byte by = 121;
        short sh = 558;;
        float f = 5.8f;
        // by default its double
        double d = 5.8;
        //Type Casting
        byte b = 127;
        // int a = b;
        System.out.println(b);
        //cannot assign integer to byte
        int a = 257; // bigger number gives modulo
        byte k = (byte) a; // so type casting
        System.out.println(k);
        // Type promotion
        // java will promote off if two bytes multiplied to int as > 127
        byte o = 10;
        byte p = 30;
        int res = o*p;
        //System.out.println(res);
        //++num; // pre-increment
        // num++ // post - increment
        // instead of using multiple if else and else if statements use switch
        // Eg: also for case use break 
        // if break not use moment one case matches all execute

        int week = 8;
        switch(week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");
        }
        // loops
        // while loop
        int i = 1;
        while ( i <=4) {
            //System.out.println("while loop");
            i++;
        }
        //System.out.println("while loop" + " " + i);
         // if condition is false  and want loop to execute use do while
    int j = 5;
    do {
        System.out.println("do - while loop");
        j++;
        }while(j<=4);
        int e= 5;
        int w= 10;
        int z = ( e++>5 && w-- <10) ? e-- : w;
        System.out.println(e  + "" + w);
        i = 100;
    
        //System.out.println(++i);
        //System.out.println(i);
        // System.out.println(--i);
        // System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        int u= 3;
        int v= 6;
        int result = (~u&v)|(u&~v);
        System.out.println(result);
    }
}


// JVM only understands byte code
// Java code converted to Byte code by javac compiler
// Execution st arts from a file with main
// JVM is a part of JRE
// Java is WORA ---> write once run anywhere ( JRE and JVM should be there in that other machine)
 