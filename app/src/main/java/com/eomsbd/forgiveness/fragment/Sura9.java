package com.eomsbd.forgiveness.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eomsbd.forgiveness.OnBackPressed;
import com.eomsbd.forgiveness.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sura9 extends Fragment  implements OnBackPressed {


    public Sura9() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sura9, container, false);
    }

    @Override
    public void onBackPressed() {

    }
}
