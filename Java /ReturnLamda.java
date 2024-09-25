@FunctionalInterface 
interface Add {
    int sum( int i, int j);
}


class ReturnLamda{
    public static void main(String args[]) {
        Add object = ( i, j) -> i+j;
        // java 8 fetaurecompiler understands the brackets the methods etc.
        System.out.println(object.sum(26, 1));
        // only works with funcitonal interface
    }
    // with lamda expression no FunInt$1 anonymous class file is created
}
