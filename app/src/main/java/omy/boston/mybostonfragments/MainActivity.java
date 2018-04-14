package omy.boston.mybostonfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements BottomSectionFragment.BottomSectionFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }// onCreate the end!

    //This is called by BottomFragment when ME clickes the button
    @Override
    public void createMeme(String top, String bottom) {
        TopSectionFragment topFragment = (TopSectionFragment) getFragmentManager().findFragmentById(R.id.fragmentTop);
        topFragment.setMemeTekst(top, bottom);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    /**Metoda za puvratak podataka**/
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        qLog("Zabilježena je metoda - onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**Spremanje podataka**/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        qLog("Zabilježena je metoda - onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //Pračenje loga
    private void qLog(String logTekst){
        Log.d("napravi Log", logTekst);
    }
}
