package code.sukram;

import code.sukram.logger.CustomLoggerType;
import code.sukram.provider.CustomLoggerProvider;

public class Main {

    public static void main(String[] args) {
        CustomLoggerProvider provider = new CustomLoggerProvider();
        provider.get().doSomeLogging();
        for (CustomLoggerType type : CustomLoggerType.values()) {
            provider.get(type).doSomeLogging();
        }
    }
}
