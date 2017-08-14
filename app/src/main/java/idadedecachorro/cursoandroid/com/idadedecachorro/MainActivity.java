package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText textoIdade;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoIdade = (EditText) findViewById(R.id.textIdadeId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Recuperar o que foi digitado
                String textoDigitado = textoIdade.getText().toString();

                if(textoDigitado.isEmpty()){
                    resultadoIdade.setText("Digite a idade!");
                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);

                    resultadoIdade.setText("A idade humana do seu cão é: " + valorDigitado * 7 + " anos");
                }

            }
        });

    }
}
