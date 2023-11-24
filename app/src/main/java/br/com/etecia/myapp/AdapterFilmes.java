package br.com.etecia.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterFilmes extends RecyclerView.Adapter<AdapterFilmes.ViewHolder> {
    private Context context;
    private List<Filmes> LstFilmes;

    public AdapterFilmes(Context context, List<Filmes> lstFilmes) {
        this.context = context;
        LstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
