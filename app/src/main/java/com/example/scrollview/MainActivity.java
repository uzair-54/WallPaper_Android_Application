package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ImageView pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10;

    int picIds[] = {R.drawable.wall1,R.drawable.wall2,R.drawable.wall3,R.drawable.wall4,R.drawable.wall5,R.drawable.wall6,R.drawable.wall7,R.drawable.wall8,R.drawable.wall9,R.drawable.wall10};

    public void setWallpaper(ImageView btn,int picId){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bitmap bm = BitmapFactory.decodeResource(getResources(),picId);
                WallpaperManager man = WallpaperManager.getInstance(getApplicationContext());
                Toast.makeText(MainActivity.this, "Setting Wallpaper", Toast.LENGTH_SHORT).show();
                try{
                    man.setBitmap(bm);
                    Toast.makeText(MainActivity.this, "Wallpaper set", Toast.LENGTH_SHORT).show();
                }catch (IOException e){
                    Toast.makeText(MainActivity.this, "Some thing going Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pic1 = (ImageView) findViewById(R.id.btn1);
        pic2 = (ImageView) findViewById(R.id.btn2);
        pic3 = (ImageView) findViewById(R.id.btn3);
        pic4 = (ImageView) findViewById(R.id.btn4);
        pic5 = (ImageView) findViewById(R.id.btn5);
        pic6 = (ImageView) findViewById(R.id.btn6);
        pic7 = (ImageView) findViewById(R.id.btn7);
        pic8 = (ImageView) findViewById(R.id.btn8);
        pic9 = (ImageView) findViewById(R.id.btn9);
        pic10 = (ImageView) findViewById(R.id.btn10);

        setWallpaper(pic1,picIds[0]);
        setWallpaper(pic2,picIds[1]);
        setWallpaper(pic3,picIds[3]);
        setWallpaper(pic4,picIds[4]);
        setWallpaper(pic5,picIds[5]);
        setWallpaper(pic6,picIds[6]);
        setWallpaper(pic7,picIds[6]);
        setWallpaper(pic8,picIds[7]);
        setWallpaper(pic9,picIds[8]);
        setWallpaper(pic10,picIds[9]);
    }
}
