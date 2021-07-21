package utilities;

public abstract class BrowserSleep {
    public static void time(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
