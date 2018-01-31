package camp.bso.inf.scoringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailPersija extends AppCompatActivity {
    Button persijaofc, bwebpersija, persijahome, gbks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_persija);

        persijaofc = (Button) findViewById(R.id.webpersija);
            persijaofc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    String urllink = "http://www.persija.co.id/";
                    browserIntent.setData(Uri.parse(urllink));
                    startActivity(browserIntent);
                }
            });

        bwebpersija = (Button) findViewById(R.id.bolapersija);
            bwebpersija.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    String urllink = "http://www.bola.com/indonesia";
                    browserIntent.setData(Uri.parse(urllink));
                    startActivity(browserIntent);
                }
            });

        persijahome = (Button) findViewById(R.id.basepersija);
            persijahome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri gmmIntentUri=Uri.parse("geo:-6.253633, 106.834036");
                    Intent mapIntent= new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    if(mapIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(mapIntent);
                    }
                }
            });
        gbks = (Button) findViewById(R.id.gbk);
            gbks.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri gmmIntentUri=Uri.parse("geo:-6.218584, 106.801810");
                    Intent mapIntent= new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    if(mapIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(mapIntent);
                    }
                }
            });

    }
}
