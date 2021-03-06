package biz.netdevelopers.aukceadrazbyfragments.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import biz.netdevelopers.aukceadrazbyfragments.UI.MultiSelectionSpinner;
import biz.netdevelopers.aukceadrazbyfragments.R;

public class FiltersActivity extends Activity {

    MultiSelectionSpinner f_kraje;
    MultiSelectionSpinner f_typ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);


        String[] kraje = {"Hl. m. Praha", "Středočeský", "Jihočeský", "Plzeňský", "Ústecký", "Královéhradecký", "Vysočina", "Olomoucký", "Moravskoslezský"};
        f_kraje = (MultiSelectionSpinner) findViewById(R.id.f_kraje);
        f_kraje.setItems(kraje);

        String[] typy = {"Aukce", "Dražba", "Prodej"};
        f_typ = (MultiSelectionSpinner) findViewById(R.id.f_typ);
        f_typ.setItems(typy);
    }


    public void onClick(View v) {
        String s = "Vybrané typy: " + f_typ.getSelectedItemsAsString() + ", Vybrané kraje: " + f_kraje.getSelectedItemsAsString();
        //Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();

        String caller = getIntent().getStringExtra("caller");


        // (AuctionListActivity) caller = getCallingActivity();
        getCallingActivity();


        this.finish();
    }


    public void onClickCancel(View v) {
        this.finish();
    }
}
