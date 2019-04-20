import java.util.concurrent.ThreadLocalRandom;

public class LetsGo  {

    public int random() {
        return ThreadLocalRandom.current().nextInt(100, 500 + 1);
    }

    public static void main(String args[]){
        RunForYourLife lionel = new RunForYourLife("Lionel");
        lionel.start();
        RunForYourLife andres = new RunForYourLife("Andres");
        andres.start();
        RunForYourLife messi = new RunForYourLife("Messi");
        messi.start();

    }
}

