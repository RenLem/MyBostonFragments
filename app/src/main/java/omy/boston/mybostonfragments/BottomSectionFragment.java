package omy.boston.mybostonfragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by LosFrancisco on 01-Jan-17.
 */

public class BottomSectionFragment extends Fragment {

    private static EditText topTekstInput;
    private  static EditText bottomTekstInput;

    BottomSectionFragmentListener activityCommander;


    public interface BottomSectionFragmentListener{
        public void createMeme(String top, String bottom);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (BottomSectionFragmentListener) activity;
        }catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.bottom_fragment_layout, container, false);

        topTekstInput = (EditText) view.findViewById(R.id.tekstNaVrhu);
        bottomTekstInput = (EditText) view.findViewById(R.id.tekstPriDnu);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);

                    }
                }
        );

        return view;
    }

    //Call this when button is clicked
    public void buttonClicked(View view){
        activityCommander.createMeme(
                topTekstInput.getText().toString(),
                bottomTekstInput.getText().toString()
        );
    }



}
