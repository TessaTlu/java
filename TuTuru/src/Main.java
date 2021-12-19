import com.tuturu.ShiinaMayuri;

public class Main {

    public static void main(String[] args) {

        while (true) {
            ShiinaMayuri pongThread = new ShiinaMayuri() {
                @Override
                public void run() {
                    System.out.println("Tu!");
                    System.gc();
                    super.run();
                }
            };


            ShiinaMayuri pingThread = new ShiinaMayuri() {
                @Override
                public void run() {
                    System.out.println("Turu!");
                    System.gc();
                    super.run();
                }
            };

            ShiinaMayuri.CompleteCallback pingCompleteCallback = () -> {
                try {
                    pongThread.start();
                } catch (Exception e) {
                    pongThread.run();
                }
            };
            ShiinaMayuri.CompleteCallback pongCompleteCallback = () -> {
                try {
                    pingThread.start();
                } catch (Exception e) {
                    pingThread.run();
                }
            };
            pingThread.setCompleteCallback(pingCompleteCallback);
            pongThread.setCompleteCallback(pongCompleteCallback);
            pongThread.start();
        }
    }
}
