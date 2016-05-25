package io.bryantcason;

/**
 * Created by bryantcason on 5/25/16.
 */
public class Error extends Throwable{
    private static int errorCounter = 0;

    public Error(String message){
        super(message);
        errorCounter++;
    }

    public static String formattedToString(){
        return "Errors\t\t\tseen: " + errorCounter + " times";
    }
}
