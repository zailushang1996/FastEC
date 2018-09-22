package com.exaccu.latte_core.app;

import java.util.WeakHashMap;

/**
 * Author:liuzhixiang
 * PackageName:com.exaccu.latte_core.app
 * Create by 17864 on 2018/9/22
 *
 * @ Description:
 */
public class Configurator {

    private static final WeakHashMap<String, Object> LATTE_CONFIGUS = new WeakHashMap<>();

    private Configurator() {
        LATTE_CONFIGUS.put(ConfigType.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }

    final WeakHashMap<String, Object> getLatteConfigus() {
        return LATTE_CONFIGUS;
    }

    private static class Holder{
        private static final Configurator INSTANCE = new Configurator();
    }

    public final void configure() {
        LATTE_CONFIGUS.put(ConfigType.CONFIG_READY.name(), true);
    }

    public final Configurator withApiHost(String host) {
        LATTE_CONFIGUS.put(ConfigType.APIHOST.name(), host);
        return this;
    }

    private void checkConfiguration() {
        final boolean isReady = (boolean) LATTE_CONFIGUS.get(ConfigType.CONFIG_READY.name());
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready,call configure");
        }
    }

    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key) {
        checkConfiguration();
        return (T) LATTE_CONFIGUS.get(key);
    }
}
