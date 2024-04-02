package com.example.chatapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.chatapp.R;
import com.example.chatapp.databinding.ActivitySignInBinding;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class SignInActivity extends AppCompatActivity {

    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.textCreateNewAccount.setOnClickListener(v->
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class)));
        /**call button sign in to add data*/
//        binding.buttonSignIn.setOnClickListener(v -> addDataToFireStore());
    }
    
    /**add users*/
    /*private void addDataToFireStore(){
        FirebaseFirestore database = FirebaseFirestore.getInstance();
        HashMap<String, Object> data = new HashMap<>();

        data.put("first_name", "Suren");
        data.put("last_name", "Prasanth");
        database.collection("users").add(data)
                .addOnSuccessListener(documentReference -> {
                    Toast.makeText(getApplicationContext(),"Data Inserted", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(exception -> {
                    Toast.makeText(getApplicationContext(), exception.getMessage(), Toast.LENGTH_SHORT).show();
                });

    }*/

}