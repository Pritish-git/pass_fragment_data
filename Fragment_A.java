package com.technical.coding.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment_A extends Fragment {


    private EditText editText;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__a, container, false);

        editText = view.findViewById(R.id.editTextText);
        button = view.findViewById(R.id.button_click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = editText.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("key", message);

                Fragment_B fragmentB = new Fragment_B();
                fragmentB.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, fragmentB).commit();
            }
        });


        return view;
    }
}