package com.jhonlopera.practica1_p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double base,altura,lado,arista,area,radio,vol,peri,hipo1,hipo2;
    private String aux1,aux2,Areat,Volt,Perit;

    private RadioButton rTriangulo,rCuadrado,rCirculo,rCubo;
    private TextView tvAreao,tvPerimetro,tvVolumen;
    private EditText eBase,eAltura,eRadio,eArista,eLado;
    private Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Areat="0";
        base=altura=0;
        aux1="0";
        aux2="0";
        eBase=(EditText) findViewById(R.id.ebase);
        eAltura=(EditText) findViewById(R.id.ealtura);
        eRadio= (EditText)findViewById(R.id.eradio);
        eLado=(EditText)findViewById(R.id.elado);

        eArista=(EditText) findViewById(R.id.earista);
        rTriangulo=(RadioButton) findViewById(R.id.rTriangulo);
        rCirculo=(RadioButton) findViewById(R.id.rCirculo);
        rCuadrado=(RadioButton) findViewById(R.id.rCuadrado);
        rCubo=(RadioButton) findViewById(R.id.rCubo);
        tvAreao=(TextView) findViewById(R.id.tvarea);
        tvPerimetro=(TextView) findViewById(R.id.tvPerimetro);
        tvVolumen=(TextView) findViewById(R.id.tvVolumen);
        bCalcular =(Button) findViewById(R.id.bCalcular);

        tvVolumen.setVisibility(View.INVISIBLE);
        tvAreao.setVisibility(View.INVISIBLE);
        tvPerimetro.setVisibility(View.INVISIBLE);


        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (rTriangulo.isChecked()){
                    tvVolumen.setVisibility(View.INVISIBLE);

                    aux1=eBase.getText().toString();
                    aux2=eAltura.getText().toString();
                    base=Double.parseDouble(aux1);
                    altura=Double.parseDouble(aux2);
                    area=base*altura/2;
                    hipo1=Math.pow(altura,2)+Math.pow(base,2);
                    hipo2=Math.sqrt(hipo1);
                    peri=hipo2+base+altura;

                    Perit=String.valueOf(peri);
                    Areat=String.valueOf(area);

                    tvAreao.setText("Área:      "+Areat);
                    tvPerimetro.setText("Perímetro:     "+Perit);

                    tvAreao.setVisibility(View.VISIBLE);
                    tvPerimetro.setVisibility(View.VISIBLE);


                }


                else if (rCuadrado.isChecked()){
                    tvVolumen.setVisibility(View.INVISIBLE);

                    aux1=eLado.getText().toString();
                    lado=Double.parseDouble(aux1);
                    area=lado*lado;
                    peri=4*lado;

                    Perit=String.valueOf(peri);
                    Areat=String.valueOf(area);

                    tvAreao.setText("Área:      "+Areat);
                    tvPerimetro.setText("Perímetro:     "+Perit);
                    tvAreao.setVisibility(View.VISIBLE);
                    tvPerimetro.setVisibility(View.VISIBLE);


                }
                else if (rCirculo.isChecked()){
                    tvVolumen.setVisibility(View.INVISIBLE);

                    aux1=eRadio.getText().toString();
                    radio=Float.parseFloat(aux1);
                    area=Math.PI*radio*radio;
                    peri=Math.PI*2*radio;

                    Perit=String.valueOf(peri);
                    Areat=String.valueOf(area);

                    tvAreao.setText("Área:      "+Areat);
                    tvPerimetro.setText("Perímetro:     "+Perit);
                    tvAreao.setVisibility(View.VISIBLE);
                    tvPerimetro.setVisibility(View.VISIBLE);
                }
                else if (rCubo.isChecked()){
                    aux1=eArista.getText().toString();
                    arista=Double.parseDouble(aux1);
                    vol=Math.pow(arista,3);
                    area=arista*arista*6;
                    peri=arista*arista*4*6;
                    Perit=String.valueOf(peri);
                    Areat=String.valueOf(area);

                    tvAreao.setText("Área:      "+Areat);
                    tvPerimetro.setText("Perímetro:     "+peri);
                    tvVolumen.setText("Volmen:     "+vol);

                    tvAreao.setVisibility(View.VISIBLE);
                    tvPerimetro.setVisibility(View.VISIBLE);
                    tvVolumen.setVisibility(View.VISIBLE);
                }


            }


        });


    }
}
