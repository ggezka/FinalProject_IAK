package gaizkamaulana.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    ImageButton btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.txt1);
        btnback = (ImageButton)findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Menu.class));
            }
        });

        loadDataFromAsset();
    }

    public void loadDataFromAsset(){

        try {

            InputStream is = getAssets().open("Biodata.txt");

            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            textView.setText(new String(buffer));


        }catch (IOException ex){
            return;
        }



    }

}
