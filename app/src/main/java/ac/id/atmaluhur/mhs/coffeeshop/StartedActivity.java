package ac.id.atmaluhur.mhs.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartedActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_started);

        Button tombol = findViewById(R.id.button);
        tombol.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                    Intent pindahIntent = new Intent(StartedActivity.this, DashboardActivity.class);
                    startActivity(pindahIntent);
                    break;
        }
    }
}