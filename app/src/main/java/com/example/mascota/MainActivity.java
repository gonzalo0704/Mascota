package  com.example.mascota;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar  miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.recyclerViewMascota);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdpatador();
    }

    public MyAdapter adaptador;
    private void inicializarAdpatador (){
        adaptador = new MyAdapter(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }
    public  void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("Pepe",5,R.drawable.p1));
        mascotas.add(new Mascotas("Luna",6,R.drawable.p2));
        mascotas.add(new Mascotas("Lupi",6,R.drawable.p3));
        mascotas.add(new Mascotas("Tim",6,R.drawable.p4));
        mascotas.add(new Mascotas("Fido",6,R.drawable.p5));
        mascotas.add(new Mascotas("Loly",6,R.drawable.p6));
        mascotas.add(new Mascotas("Sun",6,R.drawable.p7));
    }
    public void pantalla2(View view){
        Intent i = new Intent(this,Pantalla2.class);
        startActivity(i);
    }
}
