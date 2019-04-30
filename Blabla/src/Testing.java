public class Testing implements Runnable {
    String nomor;
    Thread t;

    public Testing (String nama){
        nomor = nama;
        System.out.println(nomor + " Siap ");

    }

    public void run() {
        try {
            for( int i = 10 ; i >=0 ; i --) {
                System.out.println("Countdown" + nomor + " " + i );
                Thread.sleep(100);
            }
        } catch (InterruptedException ex) {
            System.out.println(nomor + " di interupsi");
        }

        //System.out.println(nomor + " ");
    }

    public void start(){
        System.out.println( nomor + " Mulai");
        if (t == null) {
            t = new Thread (this, nomor);

        }
        t.start ();
    }

}
