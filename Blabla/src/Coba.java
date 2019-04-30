public class Coba extends Exception {


public static void main(String args[]){
    int[] erei =  new int[2];
    erei[0] = 1;
    erei[1] = 1;
    String ayamku = null;
    try{
        erei[2] = 2;
    }catch (ArrayIndexOutOfBoundsException ex){
        System.out.println("Gaada Indexnya");
    }

//    try{
//         char a = ayamku.charAt(6) ;
//    }catch (StringIndexOutOfBoundsException ex){
//        System.out.println("Keluar Bound");
//    }

    try{
        ayamku.toUpperCase();
    }catch (NullPointerException ex){
        System.out.println("Null Pointer");
    }
//    Testing t1 = new Testing("Thread1");
//    t1.start();
//    Testing t2 = new Testing("Thread2");
//    t2.start();
//    Testing t3 = new Testing("Thread3");
//    t3.start();

}

}
