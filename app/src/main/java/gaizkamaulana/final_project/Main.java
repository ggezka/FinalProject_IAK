package gaizkamaulana.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by yusril on 11/02/18.
 */

public class Main extends AppCompatActivity {

    Button btndaftar;
    Button btnlogout;
    Button btnmusic;
    Button btnabout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btndaftar = (Button) findViewById(R.id.btndaftar);

        btnlogout = (Button) findViewById(R.id.btnlogout);

        btnmusic = (Button)findViewById(R.id.btnmusic);

        btnabout = (Button)findViewById(R.id.btnabout);
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main.this,AboutMe.class));

            }
        });

        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main.this,ListMusic.class));

            }
        });

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main.this, Menu.class));

            }
        });

    }

}
