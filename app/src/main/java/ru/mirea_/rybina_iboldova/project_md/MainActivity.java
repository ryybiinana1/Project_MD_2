package ru.mirea_.rybina_iboldova.project_md;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private TextView No_password;
    private Intent intent;
    private TextView User_name;
    private TextView Password;
    private ConstraintLayout Button_autorizaton;
    //private ActivityLoginBinding binding;

    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (FirebaseAuth.getInstance().getCurrentUser() == null) {
            startActivity(new Intent(MainActivity.this, SignUpActivity.class));
        }
        No_password.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                // Здесь код, который будет выполнен при клике на No_password
                intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }


        /* (2)setupUI();
        setupListeners();


        No_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Здесь код, который будет выполнен при клике на No_password
                intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });/
    }

    private void setupUI() {
        No_password = findViewById(R.id.no_password);
        User_name = findViewById(R.id.user_name);
        Password = findViewById(R.id.password);
        Button_autorizaton = findViewById(R.id.button_autorizaton);

    }

    /* (2) private void setupListeners() {
        Button_autorizaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUsername_password();
            }

            void checkUsername_password() {
                boolean isValid = true;
                if (isEmpty((EditText) User_name)) {
                    User_name.setError("You must enter username to login!");
                    isValid = false;
                }

                if (isEmpty((EditText) Password)) {
                    Password.setError("You must enter password to password!");
                    isValid = false;
                } else {
                    if (Password.getText().toString().length() < 4) {
                        Password.setError("Password must be at least 4 chars long!");
                        isValid = false;
                    }
                }

                //check email and password
                //IMPORTANT: here should be call to backend or safer function for local check; For example simple check is cool
                //For example simple check is cool
                if (isValid) {
                    String usernameValue = User_name.getText().toString();
                    String passwordValue = Password.getText().toString();

                    sPref = getPreferences(MODE_PRIVATE);
                    String savedText = sPref.getString(SAVED_TEXT, "");
                    User_name.setText(savedText);


                    if (usernameValue.equals("Nastya") && passwordValue.equals("password1234")) {
                        //everything checked we open new activity
                        intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    } else {
                        Toast t = Toast.makeText(MainActivity.this, "Wrong username or password!", Toast.LENGTH_SHORT);
                        t.show();
                    }
                }

            }

            boolean isEmpty(EditText text) {
                CharSequence str = text.getText().toString();
                return TextUtils.isEmpty(str);
            }
        });
    }*/
}


