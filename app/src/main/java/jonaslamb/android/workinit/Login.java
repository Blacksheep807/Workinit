package jonaslamb.android.workinit;
/*Assignment 2
Part I.

Let’s start creating an app. We are going to create a mobile application for
personal trainers this time around. Here’s the scenario.

You’re a personal trainer who trains your clients at their home. Your clients
pay for a given number of training sessions each month. Each time you train
them, you mark off a session. Currently, you carry a binder around with each
customers sign in sheet to each session. This has started to become tedious,
not to mention that you forget your pen every time. Since you’re in school and
taking the Introduction to Android course, you decide to build an application
to handle this for you.

For this assignment, create an android project for our Personal Trainer Customer
Management Application. Name it whatever you like. After you’ve created your
project, search the web and find some icons. There are plenty out there. I want
you to add an image resource for the logo.

Add string resources for the following:

The Application Name
Successful Login Message
Unsuccessful Login Message
User Name (Make it jdoe)
Password (Make it welcome1)

Add any other resources you may want to use in your app.

Our application will require the following permissions to run:

Ability to write to settings
Ability to access the built in camera.
Ability to write to external storage

Modify your application manifest for these permissions. (See page 120)


Create a login activity. You can use the login activity code template that’s an
option from the new activity menu or create your own. Make this activity the
launch activity. Don’t worry about coding anything else for now. We’ll keep the
view simple for now until we discuss user interfaces next week. When I run your
app, the login activity should start.
*/

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.content.ContextCompat;

public class Login extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static Button mLoginButton;

    private static final String TAG = "QuizActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        checkCameraPermission();
        checkWritePermission();
        checkSetttingsPermission();
        Log.d(TAG, "onCreate(Bundle) called");
        LoginButton();
    }

    void checkCameraPermission(){
    if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
        !=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.CAMERA}, 3);
        }
    }
    void checkWritePermission(){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                !=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.WRITE_EXTERNAL_STORAGE}, 3);
        }
    }
       void checkSetttingsPermission(){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_SETTINGS)
                !=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.WRITE_SETTINGS}, 3);
        }
    }

    public void LoginButton(){
        username= (EditText)findViewById(R.id.nameEditText);
        password= (EditText)findViewById(R.id.passwordEditText);
        mLoginButton= (Button)findViewById(R.id.loginButton);

        mLoginButton.setOnClickListener(new View.OnClickListener(){
            Intent i = new Intent(Login.this, Directory.class);
            @Override
            public void onClick(View v){
                int login = 0;
                if(username.getText().toString().equals("jdoe")
                        && password.getText().toString().equals("welcome1")
                        ){
                    login = R.string.successLogin;
                    Toast.makeText(Login.this, login, Toast.LENGTH_SHORT).show();

                    startActivity(i);
                }else{
                    login= R.string.unsuccessLogin;
                    Toast.makeText(Login.this, login, Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}
