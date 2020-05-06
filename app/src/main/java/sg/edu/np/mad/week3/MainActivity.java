package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("MAD Wk3");

        ImageView cuteBabyImage = findViewById(R.id.imageView2);
        cuteBabyImage.setImageURI(
                Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.cute_baby)
        );

        MediaPlayer babyLaughingAudio = MediaPlayer.create(this, R.raw.baby_laughing);
        babyLaughingAudio.start();

        VideoView rabbidVideo = findViewById(R.id.videoView);
        rabbidVideo.setVideoURI(
                Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid)
        );
        rabbidVideo.start();
    }
}
