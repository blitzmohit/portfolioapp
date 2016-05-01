package us.mohitarora.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick({ R.id.popularmovies, R.id.stockhawk, R.id.makeyourappmaterial, R.id.goubiquitous, R.id.capstone, R.id.builditbigger})
    public void createToast(Button project){
        String buttonText = project.getText().toString();

        String message = "This button will launch my "+ buttonText.toLowerCase() + " app !";

        Toast.makeText(MainActivity.this, message , Toast.LENGTH_SHORT).show();
    }
}
