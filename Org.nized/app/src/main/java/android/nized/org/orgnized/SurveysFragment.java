package android.nized.org.orgnized;

/**
 * Created by greg on 12/21/14.
 */
import android.view.View;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class SurveysFragment extends Fragment {

    public SurveysFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_surveys, container, false);

        return rootView;
    }
}