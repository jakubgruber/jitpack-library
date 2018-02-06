package cz.gruber.core;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

/**
 * Created by gruber on 06/02/2018.
 */

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        new StyleableToast
                .Builder(this)
                .text("Stylable Toast!")
                .textColor(Color.WHITE)
                .backgroundColor(Color.BLUE)
                .show();
    }
}
