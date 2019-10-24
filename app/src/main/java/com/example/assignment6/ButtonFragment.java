package com.example.assignment6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class ButtonFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View retView= inflater.inflate(R.layout.fragment_buttons, parent, false);
        if(retView!=null){
            Button load=(Button)retView.findViewById(R.id.load);
            /*
            load.setOnClickListener(new View.OnClickListener(){
                @Override
                public void OnClick(View view){

                }


            });

             */
        }

        return retView;

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button load = (Button) view.findViewById(R.id.load);
        Button show = (Button) view.findViewById(R.id.show);
    }
}
