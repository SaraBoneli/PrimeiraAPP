package sara.dayse.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent();//obtém a intenção que essa tela recebeu ou que criou a tela

        String textoDigitado = i.getStringExtra("texto");//pega o texto que foi digitado na primeira tela

        TextView tvTexto = findViewById(R.id.tv_texto);//pego o TextView
        tvTexto.setText(textoDigitado);//aparecer o texto


    }
}