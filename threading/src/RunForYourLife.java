public class RunForYourLife implements Runnable {
    String name;
    Thread t;

    public RunForYourLife (String threadname){
        name = threadname;
        System.out.println(name + ", ready.");
    }

//    @Override
    public void run() {
        LetsGo rand = new LetsGo();
        try {
            for( int i = 1 ; i <=20 ; i ++) {
                System.out.println(name + " has passed checkpoint (" + i + ")");
                Thread.sleep(rand.random());
            }
        } catch (InterruptedException ex) {
            System.out.println(name + " was interrupted");
        }

        System.out.println(name + " has finished!");
    }

    public void start(){
        System.out.println(name + ", set...");
        if (t == null) {
            t = new Thread (this, name);
            if(name.equals("Lionel")){
                t.setPriority(Thread.MIN_PRIORITY);
            }else if(name.equals("Andres")){
                t.setPriority(Thread.NORM_PRIORITY);
            }else{
                t.setPriority(Thread.MAX_PRIORITY);
            }
            t.start ();
        }
    }

}
