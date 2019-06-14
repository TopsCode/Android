package com.topscode.firebasedatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button button;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseReference = FirebaseDatabase.getInstance().getReference("Person");

        findViewById(R.id.login_id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        Person person = dataSnapshot.getValue(Person.class);
                        if(editText1.getText().toString().equals(person.getEmail()) && editText2.getText().toString().equals(person.getPassword())){
                            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                            intent.putExtra("fname",person.getFname());
                            intent.putExtra("lname", person.getLname());
                            intent.putExtra("gender",person.getGender());
                            intent.putExtra("email",person.getEmail());
                            intent.putExtra("mobileno",person.getMobileNo());
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                    }
                });
            }
        });
    }
}
