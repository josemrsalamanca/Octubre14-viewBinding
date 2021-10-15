package com.example.octubre14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import com.example.octubre14.R;
import com.example.octubre14.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWidgets();
        setContentView(binding.getRoot());
        loadImage();
        cargarDatos();
    }

    private void cargarDatos() {
        binding.etNombre.setText("Jose");
        binding.etApellido.setText("Ramirez");
        binding.etMail.setText("josemrsalamanaca@gmail.com");
    }

    private void initWidgets() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
    }

    private void loadImage() {
        Picasso.get()
                .load("https://depor.com/resizer/dFX3j034-CJgT9Mpb4d5sVopRp4=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/5UUV6NB7PJHALDU7WOFJBGKKH4.jpg")
                .into(binding.ivAvatar);
    }
}