package camp.bso.inf.scoringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button persib, persija, scpluspersib, scminpersib, scminpersija, scpluspersija, resetpersibsc, resetpersijasc, news;
    TextView scorepersib, scorepersija;


    int scorevalpersib = 0;
    int scorevalpersija = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persib = (Button) findViewById(R.id.btn_detailspersib);
            persib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a = new Intent(getApplicationContext(), DetailPersib.class);
                    startActivity(a);
                }
            });

        persija = (Button) findViewById(R.id.btn_detailspersija);
            persija.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a = new Intent(getApplicationContext(), DetailPersija.class);
                    startActivity(a);
                }
            });

        scpluspersib = (Button) findViewById(R.id.pluspersib);
            scpluspersib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    scorevalpersib = scorevalpersib+1;
                    scorepersib.setText(String.valueOf(scorevalpersib));
                    if(scorevalpersib<0){
                        scorevalpersib=0;
                        scorepersib.setText(String.valueOf(scorevalpersib));
                    }
                }
            });

        scminpersib = (Button) findViewById(R.id.minpersib);
            scminpersib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    scorevalpersib = scorevalpersib-1;
                    scorepersib.setText(String.valueOf(scorevalpersib));
                    if(scorevalpersib<0){
                        scorevalpersib=0;
                        scorepersib.setText(String.valueOf(scorevalpersib));
                    }
                }
            });

        resetpersibsc = (Button) findViewById(R.id.resetpersib);
            resetpersibsc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    scorevalpersib = 0;
                    scorepersib.setText(String.valueOf(scorevalpersib));
                }
            });

        scpluspersija = (Button) findViewById(R.id.pluspersija);
            scpluspersija.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    scorevalpersija = scorevalpersija+1;
                    scorepersija.setText(String.valueOf(scorevalpersija));
                    if(scorevalpersija<0){
                        scorevalpersija=0;
                        scorepersija.setText(String.valueOf(scorevalpersija));
                    }
                }
            });

        scminpersija = (Button) findViewById(R.id.minpersija);
            scminpersija.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    scorevalpersija = scorevalpersija-1;
                    scorepersija.setText(String.valueOf(scorevalpersija));
                    if(scorevalpersija<0){
                        scorevalpersija=0;
                        scorepersija.setText(String.valueOf(scorevalpersija));
                    }
                }
            });

        resetpersijasc = (Button) findViewById(R.id.resetpersija);
            resetpersijasc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    scorevalpersija = 0;
                    scorepersija.setText(String.valueOf(scorevalpersija));
                }
            });

        scorepersib = (TextView) findViewById(R.id.skorpersib);

        scorepersija = (TextView) findViewById(R.id.skorpersija);

        news = (Button) findViewById(R.id.berita);
            news.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    String urllink = "http://www.persib.co.id/beranda.aspx#popup";
                    browserIntent.setData(Uri.parse(urllink));
                    startActivity(browserIntent);
                }
            });
    }
}
