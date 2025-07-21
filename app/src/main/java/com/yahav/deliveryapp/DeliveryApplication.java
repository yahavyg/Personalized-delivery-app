package com.yahav.deliveryapp;
import android.app.Application;
import android.content.res.Configuration;
import java.util.Locale;
public class DeliveryApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Locale locale = Locale.ENGLISH;
        Locale.setDefault(locale);
        Configuration config = getResources().getConfiguration();
        config.setLocale(locale);
        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
    }
}
