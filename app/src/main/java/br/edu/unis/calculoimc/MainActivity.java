package br.edu.unis.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtPeso;
    private EditText txtAltura;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        txtResultado = findViewById(R.id.txtResultado);

    }


    public void calculoImc(View view){

        double peso = Double.parseDouble(txtPeso.getText().toString());
        double altura = Double.parseDouble(txtAltura.getText().toString());
        double resultado = peso/(altura*altura);


/*testes para 1.70M*/
        if(resultado <= 16){
            txtResultado.setText("Voce está com Magreza Grave, IMC = "+resultado); /*40kg*/
        }
        else if(resultado > 16 && resultado <= 17){
            txtResultado.setText("Voce está com Magreza Moderada, IMC = "+resultado); /*48kg*/
        }
        else if(resultado > 17 && resultado <= 18.5){
            txtResultado.setText("Voce está com Magreza Leve, IMC = "+resultado);/*50kg*/
        }
        else if(resultado > 18.5 && resultado <= 25){
            txtResultado.setText("Voce está Saudável, IMC = "+resultado); /*60kg*/
        }
        else if(resultado > 25 && resultado <= 30){
            txtResultado.setText("Voce está com Sobrepeso, IMC = "+resultado); /*75kg*/
        }
        else if(resultado > 30 && resultado <= 35){
            txtResultado.setText("Voce está com Obesidade Grau I, IMC = "+resultado); /*90kg*/
        }
        else if(resultado > 35 && resultado <= 40){
            txtResultado.setText("Voce está com Obesidade Grau II, IMC = "+resultado); /*105kg*/
        }
        else if(resultado > 40){
            txtResultado.setText("Voce está com Obesidade Grau III, IMC = "+resultado); /*120kg*/
        }
    }
}