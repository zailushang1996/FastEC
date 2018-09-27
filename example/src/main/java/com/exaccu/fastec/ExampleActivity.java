package com.exaccu.fastec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.exaccu.latte.ec.launcher.LauncherDelegate;
import com.exaccu.latte_core.activities.ProxyActivity;
import com.exaccu.latte_core.app.Latte;
import com.exaccu.latte_core.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }
}
