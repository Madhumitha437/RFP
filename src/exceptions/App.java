package exceptions;

import java.util.logging.Logger;

public class App {

    private static final Logger logger =
            Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        logger.info("Application Started");

        System.out.println("Working...");

        logger.info("Application Ended");
    }
} 