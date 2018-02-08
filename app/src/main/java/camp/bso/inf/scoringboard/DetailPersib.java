package camp.bso.inf.scoringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailPersib extends AppCompatActivity {
    Button persibofc, bolapersib, homebasepersib, gblas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_persib);

        persibofc = (Button) findViewById(R.id.webpersib);
            persibofc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    String urllink = "http://www.persib.co.id/beranda.aspx#popup";
                    browserIntent.setData(Uri.parse(urllink));
                    startActivity(browserIntent);
                }
            });

        bolapersib = (Button) findViewById(R.id.bolapersib);
            bolapersib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    String urllink = "http://www.bola.com/indonesia";
                    browserIntent.setData(Uri.parse(urllink));
                    startActivity(browserIntent);
                }
            });

        homebasepersib = (Button) findViewById(R.id.grahapersib);
            homebasepersib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri gmmIntentUri=Uri.parse("geo:-6.899418, 107.610125");
                    Intent mapIntent= new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    if(mapIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(mapIntent);
                    }
                }
            });

            gblas = (Button) findViewById(R.id.gbla);
                gblas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri gmmIntentUri=Uri.parse("geo:-6.957398, 107.712090");
                        Intent mapIntent= new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        if(mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    }
                });
    }
}
