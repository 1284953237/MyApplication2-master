package com.example.usermodule;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/8/9.
 */

public class Passworld_Forget extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.passworld_forget);
        final EditText editText = (EditText) findViewById(R.id.phone_num);
        findViewById(R.id.Verification_Code).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
               String msg= editText.getText().toString();

            }
        });

    }
}
