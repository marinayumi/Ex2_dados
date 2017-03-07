package br.com.fiap.dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgDadoUsuario;
    ImageView imgDadoPc;

    int[] jogar = {
            R.drawable.dado1,
            R.drawable.dado2,
            R.drawable.dado3,
            R.drawable.dado4,
            R.drawable.dado5,
            R.drawable.dado6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDadoUsuario = (ImageView)findViewById(R.id.imgUsuario);
        imgDadoPc = (ImageView)findViewById(R.id.imgPc);
    }

    public void jogar (View v){
        Random r = new Random();

        int aleatorio = r.nextInt(6);
        int aleatorio2 = r.nextInt(6);

        imgDadoUsuario.setImageResource(jogar[aleatorio]);
        imgDadoPc.setImageResource(jogar[aleatorio2]);

        if(jogar[aleatorio] > jogar[aleatorio2]){
            Toast.makeText(this, "Usuário ganhou do PC", Toast.LENGTH_SHORT).show();
        }else if(jogar[aleatorio] < jogar[aleatorio2]){
            Toast.makeText(this, "PC ganhou do usuário", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Deu empate", Toast.LENGTH_SHORT).show();
        }
        

    }
}
