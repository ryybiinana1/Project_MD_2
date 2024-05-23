package ru.mirea_.rybina_iboldova.project_md;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.security.crypto.MasterKeys;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class SignUpActivity extends AppCompatActivity {
    private TextView No_password1;
    private Intent intent;
    private TextView User_name;
    private TextView Password;
    private ConstraintLayout Button_autorizaton;



    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";
    //private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //SharedPreferences sp = getSharedPreferences("PC", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = sp.edit();

        setContentView(R.layout.activity_sign_up);
        No_password1 = findViewById(R.id.no_password1);
        No_password1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Здесь код, который будет выполнен при клике на No_password
                intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        User_name = findViewById(R.id.user_name);
        Password = findViewById(R.id.password);
        Button_autorizaton = findViewById(R.id.button_autorizaton);

        /*sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        User_name.setText(savedText);*/

        /*Button_autorizaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDataEntered();
            }

            boolean isEmpty(EditText text) {
                    CharSequence str = text.getText().toString();
                    return TextUtils.isEmpty(str);
            }

            void checkDataEntered() {
                int k = 0;
                if (isEmpty((EditText) User_name)) {
                    Toast t = Toast.makeText(SignUpActivity.this, "You must enter username to register!", Toast.LENGTH_SHORT);
                    t.show();
                } else if (isEmpty((EditText) Password)) {
                    Password.setError("Password is required!");
                } else if (Password.getText().toString().length() < 4) {
                        Password.setError("Password must be at least 4 chars long!");
                } else {
                    /*sPref = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor ed = sPref.edit();
                    ed.putString(SAVED_TEXT, User_name.getText().toString());
                    ed.commit();
                    ed.putString(SAVED_TEXT, Password.getText().toString());
                    ed.commit();*/
                    /*Toast.makeText(SignUpActivity.this, "You are successfull autorizated", Toast.LENGTH_SHORT).show();


                }

                }
            Button_autorizaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Здесь код, который будет выполнен при клике на Button_autorizaton
                if (User_name.getText().toString().isEmpty() || User_name.getText().toString().contains("@")) {
                    Toast.makeText(SignUpActivity.this, "Проверьте поле email!", Toast.LENGTH_LONG).show();
                } else  if (Password.getText().toString().isEmpty() || Password.getText().toString().length() < 6){
                    Toast.makeText(SignUpActivity.this, "Пароль должен содержать не менее 6 символов", Toast.LENGTH_LONG).show();
                }else {
                    SharedPreferences	sharedPref	=
                            getSharedPreferences("mirea_settings",	Context.MODE_PRIVATE);

                    KeyGenParameterSpec keyGenParameterSpec	=	MasterKeys.AES256_GCM_SPEC;
                    try {
                        String	mainKeyAlias	=	MasterKeys.getOrCreate(keyGenParameterSpec);
                    } catch (GeneralSecurityException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    FileOutputStream outputStream;
                    try {
                        outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
                        outputStream.write(User_name.getText().toString().getBytes());
                        outputStream.write(Password.getText().toString().getBytes());
                        outputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        });*/
    }
}