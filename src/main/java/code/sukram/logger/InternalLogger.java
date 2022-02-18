package code.sukram.logger;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class InternalLogger implements CustomLogger, System.Logger {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    public void doSomeLogging() {
        log(Level.DEBUG, "internal debug level log message");
        log(Level.INFO, "internal info level log message");
    }

    @Override
    public String getName() {
        return InternalLogger.class.getName();
    }

    @Override
    public boolean isLoggable(Level level) {
        return level.ordinal() >= Level.INFO.ordinal();
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
        if (isLoggable(level)) {
            System.out.printf("[%s] %s - %s%n", getName(), level, msg);
            thrown.printStackTrace();
        }
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {
        if (isLoggable(level)) {
            System.out.printf("%s [%s] %s - %s%n", LocalDateTime.now().format(FORMATTER), getName(), level, MessageFormat.format(format, params));
        }
    }
}
