package gabriel.com.transitar;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
//import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
    //      Classe principal
public class TelaPrincipal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        // ações dos botões imagens

        // chama a Activity LimiteVelocidade
        ImageButton btn1 = (ImageButton) findViewById(R.id.imagemLimite);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent meuIntente = new Intent(TelaPrincipal.this, LimiteVelocidade.class);
                startActivity(meuIntente);
            }
        });
        // chama a activity Quiz
        ImageButton btn2 = (ImageButton) findViewById(R.id.imagemPlacas);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent meuIntente = new Intent(TelaPrincipal.this, Quiz.class);
                startActivity(meuIntente);
            }
        });
        // chama a activity Placas
        ImageButton btn3 = (ImageButton) findViewById(R.id.imagemQuiz);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent meuIntente = new Intent(TelaPrincipal.this, Placas.class);
                startActivity(meuIntente);
            }
        });}
                    // se decidirmos colocar botões no menu principal
        /*
        //chamar tela quiz
        Button botao_quiz = (Button)findViewById(R.id.botao_quiz);
        botao_quiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent meuIntente = new Intent(TelaPrincipal.this, Quiz.class);
                startActivity(meuIntente);
            }
        });

           // chamar tela limite de velocidade
        Button botao_limite = (Button)findViewById(R.id.botao_limite);
        botao_limite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent meuIntente1 = new Intent(TelaPrincipal.this, LimiteVelocidade.class);
                startActivity(meuIntente1);
            }
        });

               // chamar tela placas
        Button botao_placas = (Button)findViewById(R.id.botao_placas);
        botao_placas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent meuIntente2 = new Intent(TelaPrincipal.this, Placas.class);
                startActivity(meuIntente2);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tela_principal, menu);
        return true;
    }
    *
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
        */

        // Opções ocultas no menu (configurações, ajuda, sobre...)
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_tela_principal, menu);
            return super.onCreateOptionsMenu(menu);
        }
            // ação da escolha selecionada
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch(item.getItemId()){


            case R.id.configurações:
                //muda para a tela de configurações
                setContentView(R.layout.configuracoes);
               // Toast.makeText(getBaseContext(), "Voce escolheu CONFIGURACOES", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ajuda:
                //muda para tela de ajuda
                setContentView(R.layout.ajuda);
                //Toast.makeText(getBaseContext(), "Voce escolheu AJUDA", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sobre:
                // muda para tela sobre
                setContentView(R.layout.sobre);
                //Toast.makeText(getBaseContext(), "Voce escolheu SOBRE", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;



    }

}
