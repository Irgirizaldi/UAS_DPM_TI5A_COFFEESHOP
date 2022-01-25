package ac.id.atmaluhur.mhs.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button tombol = findViewById(R.id.button);
        tombol.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                Intent pindahIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(pindahIntent);
                break;
        }
    }
}