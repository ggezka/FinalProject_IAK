package gaizkamaulana.final_project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Music5 extends AppCompatActivity {

    MediaPlayer mediaPlayer = null;
    Button btnplay;
    Button btnstop;
    ImageButton btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music5);

        btnback = (ImageButton)findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Music5.this,ListMusic.class));

                stop();
            }
        });

        btnplay = (Button)findViewById(R.id.btnplay);
        btnstop = (Button)findViewById(R.id.btnstop);

        btnstop.setEnabled(false);
        btnplay.setEnabled(true);

        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play();
                Toast.makeText(Music5.this,"Play",Toast.LENGTH_LONG).show();
            }
        });

        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stop();
                Toast.makeText(Music5.this,"Stop",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void play(){
        mediaPlayer = MediaPlayer.create(this,R.raw.darisabangsampaumerauke);
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
        btnplay.setEnabled(false);
        btnstop.setEnabled(true);

    }

    private void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }

        btnplay.setEnabled(true);
        btnstop.setEnabled(false);
    }
}
