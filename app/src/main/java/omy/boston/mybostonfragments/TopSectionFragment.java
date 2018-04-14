package omy.boston.mybostonfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by LosFrancisco on 01-Jan-17.
 */

public class TopSectionFragment extends Fragment {

    private static TextView textMemeTop;
    private static TextView textMemeBottom;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_picture_fragment_layout, container, false);

        textMemeTop = (TextView) view.findViewById(R.id.textVMemeTop);
        textMemeBottom = (TextView) view.findViewById(R.id.textMemeBottom);

        return view;
    }

    public void setMemeTekst(String top, String bottom){
        textMemeTop.setText(top);
        textMemeBottom.setText(bottom);
    }
}
