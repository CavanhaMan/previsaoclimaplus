package com.man.cavanha.previsaoclimaplus;

import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.man.cavanha.previsaoclimaplus.model.DadosClima;
import com.man.cavanha.previsaoclimaplus.service.RetrofitService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText lat;
    private EditText lon;
    private EditText city;
    TextView timezone;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lat = (EditText)findViewById(R.id.edlatitude);
        lon = (EditText)findViewById(R.id.edlongitude);
        //city = (EditText) findViewById(R.id.nomeCidadeEditText);

        timezone = (TextView) findViewById(R.id.txlocal);

        button = (Button) findViewById(R.id.btconsulta);
    }

    public void acaoBotao(View v){
        //limpaCampos();
        final double latD = Double.parseDouble(lat.getText().toString());
        final double lonD = Double.parseDouble(lon.getText().toString());
        if (latD > 90 || latD <-90 || lonD >180 || lonD<-180)
            Toast.makeText(getApplicationContext(),"Valores fora do intervalo!",Toast.LENGTH_SHORT).show();
        else {

            Call<DadosClima> call = RetrofitService.getServico().consulta(latD, lonD);

            call.enqueue(new Callback<DadosClima>() {
                @Override
                public void onResponse(Call<DadosClima> call, Response<DadosClima> response) {
                    DadosClima dadosClima = response.body();
                    String tempox = dadosClima.getCurrently().getIcon();
                    ImageView tempo = (ImageView) findViewById(R.id.imclima);

                    if (tempox.equals("clear-day"))
                        tempo.setImageResource(R.drawable.clearday);
                    else if (tempox.equals("clear-night"))
                        tempo.setImageResource(R.drawable.clearnight);
                    else if (tempox.equals("cloudy"))
                        tempo.setImageResource(R.drawable.cloudy);
                    else if (tempox.equals("fog"))
                        tempo.setImageResource(R.drawable.fog);
                    else if (tempox.equals("partly-cloudy-day"))
                        tempo.setImageResource(R.drawable.partlycloudday);
                    else if (tempox.equals("partly-cloudy-night"))
                        tempo.setImageResource(R.drawable.partlycloudynight);
                    else if (tempox.equals("rain"))
                        tempo.setImageResource(R.drawable.rain);
                    else if (tempox.equals("sleet"))
                        tempo.setImageResource(R.drawable.sleet);
                    else if (tempox.equals("snow"))
                        tempo.setImageResource(R.drawable.snow);
                    else if (tempox.equals("wind"))
                        tempo.setImageResource(R.drawable.wind);
                    else
                        tempo.setImageResource(R.drawable.error);

                    timezone.setText(getNomeCidade(latD, lonD));
                }

                @Override
                public void onFailure(Call<DadosClima> call, Throwable t) {
                    Log.i("debug", t.getMessage());
                }
            });
        }
    }

    private void limpaCampos() {
        lat.getText().clear();
        lon.getText().clear();
    }

    String getNomeCidade(double latitude, double longitude) {
        String retorno;
        Geocoder gcd = new Geocoder(this, Locale.getDefault());
        List<Address> addresses = null;
        try {
            addresses = gcd.getFromLocation(latitude, longitude, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (addresses.size() > 0) {
            retorno = addresses.get(0).getLocality();
        } else {
            retorno = "não encontrado";
        }
        return retorno;
    }



}
