package com.example.dzier.kurs14pracamojakoncowa;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends Activity {
@BindView(R.id.editLogin)
    EditText editLogin;

    @BindView(R.id.editPassword)
    EditText editPassword;

    @BindView(R.id.checkBoxsave)
    CheckBox checkBoxsave;

    private Database database;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.buttonReg)
    public void buttonReg(){
        startActivity(new Intent(this,RegisterActivity.class));
        finish();
    }

    @OnClick(R.id.buttonLogin)
    public void onClickLogin() {
    }
}
