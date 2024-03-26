package sara.dayse.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {// classe que representa o sistema principal

    @Override
    protected void onCreate(Bundle savedInstanceState) {// método usado pelo sistema operacional para criar funções
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// constrói a interface da tela

        Button btnEnviar = findViewById(R.id.btn_enviar);// obtém o botão enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() {//configuração do botão(atribuição de ouvidor de cliques)
            @Override
            public void onClick(View v) {//método usado para obter o clique do botão(dentro da classe View v)
                EditText etDigiteAqui = findViewById(R.id.et_digite_aqui);//obtém a caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString();//pegar o texto que tá dentro da caixa de texto(convertendo o objeto pra tipo string)

                Intent i = new Intent(MainActivity.this, NextActivity.class);//cria uma nova intenção com o objetivo de navegar de uma tela para outra

                i.putExtra("texto", textoDigitado);//chave e valor associado a chave para guardar valores(no caso o texto digitado na caixa de texto)


                startActivity(i);//executa a intenção declarada acima
            }
        });
    }
}