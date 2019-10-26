package com.example.football;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "Detail Activity";

    TextView tvnamateam, tvjulukanteam, tvdetailteam;
    ImageView ivgambarteam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namateam = getIntent().getStringExtra("DataNama");
        int gambarteam = getIntent().getIntExtra("DataGambar", 0);
        String detailteam = getIntent().getStringExtra("DetailTeam");
        String julukanteam = getIntent().getStringExtra("JulukanTeam");

        //log
        Log.d(TAG, "Nama :"+ namateam);
        Log.d(TAG, "Gambar :"+ gambarteam);
        Log.d(TAG, "Detail : "+ detailteam);
        Log.d(TAG, "Julukan :"+ julukanteam);

        tvnamateam = findViewById(R.id.tv_item_nama);
        ivgambarteam = findViewById(R.id.iv_item_gambar);
        tvdetailteam = findViewById(R.id.tv_detail_team);
        tvjulukanteam = findViewById(R.id.tv_item_julukan);

        tvnamateam.setText(namateam);
        ivgambarteam.setImageResource(gambarteam);
        tvdetailteam.setText(detailteam);
        tvjulukanteam.setText(julukanteam);
    }
}
