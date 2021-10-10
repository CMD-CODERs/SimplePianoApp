package comhaivaan.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(MainActivity.this,info.class);
                startActivity(categoryIntent);
                finish();
            }
        });
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }
        sound1=soundPool.load(this,R.raw.a2,1);
        sound2=soundPool.load(this,R.raw.a3,1);
        sound3=soundPool.load(this,R.raw.d,1);
        sound4=soundPool.load(this,R.raw.d2,1);
        sound5=soundPool.load(this,R.raw.j,1);
        sound6=soundPool.load(this,R.raw.petrov,1);
        sound7=soundPool.load(this,R.raw.piano,1);

    }

    public void click(View view) {
        switch(view.getId())
        {
            case R.id.b1:
                soundPool.play(sound1,1,1,0,0,1);
                break;
            case R.id.b2:
                soundPool.play(sound2,1,1,0,0,1);
                break;
            case R.id.b3:
                soundPool.play(sound3,1,1,0,0,1);
                break;
            case R.id.b4:
                soundPool.play(sound4,1,1,0,0,1);
                break;
            case R.id.b5:
                soundPool.play(sound5,1,1,0,0,1);
                break;
            case R.id.b6:
                soundPool.play(sound6,1,1,0,0,1);
                break;
            case R.id.b7:
                soundPool.play(sound7,1,1,0,0,1);
                break;



        }
    }
}