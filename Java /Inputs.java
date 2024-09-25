import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


class Inputs {
    public static void main(String args[]) throws IOException {
        // System.in throws IOexception

        System.out.println("Enter a number");
        // println method is a part of PrintStram class
        // out is static object of type PrintStram in Ssytem class
        // Inputs:
        // int num = System.in.read();
        // System.out.println(num); // returns ASCII

        //better way to get it done BufferReader

        //InputStreamReader in = new InputStreamReader(System.in);
        //InputStramReader needs an object of InputStream
        //use Syetem.in
        //BufferedReader bf = new BufferedReader(in);
        // constructor takes argument of object InputStreamReader "in"
        //int nbr = Integer.parseInt(bf.readLine());
        //System.out.println(nbr); 
        //bf.close();
        // always close resources
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);


        // closing the resources can be apt for try catch and finally
        //we can use try anf finally
        // close the resource with above BufferedRead and Input Stream
        // create the Buffered Reader object in the class instead. try block for scope
        // BufferedReader br = null
        // the rest stmts in try
        // add the br.close() in finally block
        // also can make it
        // br = new BufferedReader(new InputStreamReader(System.in))
        // we can use try (new BufferedReader(new InputStreamReader(System.in)))
        // { num = etc }
        // try closes the br automatically extends Closable and Autoclosable

    }
}