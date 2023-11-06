package com.example.apprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] colors;

    private String[] nombres,codigosHex;

    private MiRecyclerViewAdapter adapter;

    private ArrayList<Card> cardsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = getResources().getStringArray(R.array.nombres_array);
        codigosHex = getResources().getStringArray(R.array.codigosHex_array);
        colors = getResources().getIntArray(R.array.nombresColores_array);

        initCards();

        if(adapter == null){
            adapter = new MiRecyclerViewAdapter(this,cardsList);
        }

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void initCards(){
        for(int i=0;i<nombres.length;i++){
            Card card = new Card();
            card.setId((int) i);
            card.setName(nombres[i]);
            card.setCodigoHex(codigosHex[i]);
            card.setColor_resource(colors[i]);
            Log.d("MAIN_ACTIVITY","Card created with id "+card.getId());
            cardsList.add(card);
        }
    }
}