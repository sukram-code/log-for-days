package code.sukram.provider;

import code.sukram.factory.CustomLoggerFactory;
import code.sukram.logger.CustomLogger;
import code.sukram.logger.CustomLoggerType;

import java.util.HashMap;
import java.util.Map;

public class CustomLoggerProvider {

    private static final Map<CustomLoggerType, CustomLogger> LOGGERS = new HashMap<>();

    public CustomLogger get() {
        return get(CustomLoggerType.DEFAULT);
    }

    public CustomLogger get(CustomLoggerType type) {
        return LOGGERS.computeIfAbsent(type, CustomLoggerFactory::create);
    }
}
