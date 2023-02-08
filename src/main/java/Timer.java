import java.util.Date;

public class Timer implements Runnable {

    private static long startTime = System.currentTimeMillis();
    private static long elapsedTime = 0L;

    @Override
    public void run() {

        while (elapsedTime < (7*60 * 1000)) {
            elapsedTime = (new Date()).getTime() - startTime;
        }
        if (elapsedTime == (7*60 * 1000)) {
            System.out.println("==================================");
            System.out.println("You ran out of time...Game Over");
            System.out.println("==================================");
//            gameClient.setQuitGame(true);
            GameClientUtil.gameExitMessage();
            System.exit(0);
        }
    }


}
