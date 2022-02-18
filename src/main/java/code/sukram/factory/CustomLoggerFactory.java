package code.sukram.factory;

import code.sukram.logger.CustomLogger;
import code.sukram.logger.CustomLoggerType;
import code.sukram.logger.DefaultLogger;
import code.sukram.logger.InternalLogger;

public class CustomLoggerFactory {

    private CustomLoggerFactory() {
    }

    public static CustomLogger create(CustomLoggerType type) {
        return switch (type) {
            case INTERNAL -> new InternalLogger();
            default -> new DefaultLogger();
        };
    }
}
