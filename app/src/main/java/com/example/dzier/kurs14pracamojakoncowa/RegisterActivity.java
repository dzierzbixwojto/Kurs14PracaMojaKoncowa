package com.example.dzier.kurs14pracamojakoncowa;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends Activity {

    @BindView(R.id.editRegLogin)
    EditText editRegLogin;

    @BindView(R.id.editRegPassword)
    EditText editRegPassword;

    @BindView(R.id.editRegPasswordAgain)
    EditText editRegPasswordAgain;

    @BindView(R.id.editRegTelephone)
    EditText editRegTelephone;
    @BindView(R.id.textView)
    TextView textView;

    //private Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        Database db = new Database(this);
        db.addUser("Jan", "Kowalski");
        db.addUser("Krzysiek", "Klan");
        db.addUser("Admin", "admin");
        Cursor k = db.showUsers();
         while(k.moveToNext()){
            Integer id=k.getInt(0);
            String imie=k.getString(1);
            String naz=k.getString(2);

            textView.setText(textView.getText()+"\n"+imie+ " "+naz);

        }

    }
    @OnClick(R.id.buttonRegRegistryMe)
    public void buttonRegRegistryMe(

            //trzeba pobrac wartosci pol i wyslac je do bazy.
            String name = editRegLogin.get
    ){



    }
}
