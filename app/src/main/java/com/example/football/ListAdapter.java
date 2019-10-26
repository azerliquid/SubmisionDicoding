package com.example.football;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
public class ListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namaTeam, julukanTeam;
    private int[] gambarTeam;

    ListAdapter(@NonNull Context context1, String[] namaTeam, int[] gambarTeam, String[] julukanTeam) {
        super(context1, R.layout.list_item_team, namaTeam);
        this.context = context1;
        this.namaTeam = namaTeam;
        this.gambarTeam = gambarTeam;
        this.julukanTeam = julukanTeam;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //layout item
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_team, parent, false);

        //findbyid
        TextView tvNamaTeam = view.findViewById(R.id.tv_item_nama);
        ImageView ivGambarTeam = view.findViewById(R.id.iv_item_gambar);
        TextView tvJulukanTeam = view.findViewById(R.id.tv_item_julukan);

        //set data
        tvNamaTeam.setText(namaTeam[position]);
        ivGambarTeam.setImageResource(gambarTeam[position]);
        tvJulukanTeam.setText(julukanTeam[position]);

        return view;
    }

}
