package net.shreygupta.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView nowPlaying = (CardView) findViewById(R.id.now_playing);
        CardView songs = (CardView) findViewById(R.id.songs);
        CardView albums = (CardView) findViewById(R.id.albums);
        CardView playlists = (CardView) findViewById(R.id.playlists);

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(i);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(i);
            }
        });

        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(i);
            }
        });
    }
}