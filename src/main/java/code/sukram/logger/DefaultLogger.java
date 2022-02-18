package code.sukram.logger;

import static java.lang.System.Logger;
import static java.lang.System.Logger.Level;

public class DefaultLogger implements CustomLogger {

    private static final Logger LOGGER = System.getLogger(DefaultLogger.class.getName());

    @Override
    public void doSomeLogging() {
        LOGGER.log(Level.DEBUG, "Default debug message");
        LOGGER.log(Level.INFO, "Default info message");
    }
}
