package com.kenjo_coding.fragmenttransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btn = getView().findViewById(R.id.btn_second);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager() // FragmentでManager取得はこれ
                        .beginTransaction()
                        .replace(R.id.fragment_container_view, new ScondFragment())
                        .setReorderingAllowed(true)
                        .addToBackStack("home")
                        .commit();

//                FragmentManager manager = getActivity().getSupportFragmentManager();
//                manager.saveBackStack();

//                getActivity().getSupportFragmentManager().saveFragmentInstanceState("home");
            }
        });
    }




}
