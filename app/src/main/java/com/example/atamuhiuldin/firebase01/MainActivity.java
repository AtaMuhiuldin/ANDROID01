package com.example.atamuhiuldin.firebase01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    Firebase  fUsers;
    private EditText txtID;
    private EditText txtValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // this line is just valid for only one acticity but for more activityes make some other class and handel it
//        Firebase.setAndroidContext(this);

        txtID = (EditText)findViewById(R.id.txtID);
        txtValue = (EditText)findViewById(R.id.txtValue);

        fUsers = new Firebase("https://fir-01-66e7f.firebaseio.com/Users");

    }

    public void sendData(View view)
    {
       Firebase fChild;
       fChild = fUsers.child(txtID.getText().toString().trim());
       fChild.push().setValue(txtValue.getText().toString().trim());
    }
}
