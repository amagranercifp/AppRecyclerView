package com.example.apprecyclerview;

import android.content.Context;
import android.nfc.cardemulation.CardEmulation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MiRecyclerViewAdapter extends RecyclerView.Adapter<MiRecyclerViewAdapter.ViewHolder> {
    public Context context;
    private LayoutInflater inflater;
    public ArrayList<Card> cardList;

    public MiRecyclerViewAdapter(Context c, ArrayList<Card> cardList){
        this.inflater = LayoutInflater.from(c);
        this.context = c;
        this.cardList = cardList;
    }

    @Override
    public int getItemCount(){return cardList.size();}


    @Override
    public MiRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.list_element,null);
        return new MiRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MiRecyclerViewAdapter.ViewHolder holder, final int position){
        holder.bindData(cardList.get(position));
    }

    public void setItems(ArrayList<Card> items){cardList = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvCodigoColor, tvNombreColor;
        View viewColor;

        ViewHolder(View itemView){
            super(itemView);

            tvCodigoColor = itemView.findViewById(R.id.tvCodigoColor);
            tvNombreColor = itemView.findViewById(R.id.tvNombreColor);
            viewColor = itemView.findViewById(R.id.viewColor);

        }

        void bindData(final Card card){
            viewColor.setBackgroundColor(card.getColor_resource());
            tvCodigoColor.setText(card.getCodigoHex());
            tvNombreColor.setText(card.getName());
        }


    }

}
