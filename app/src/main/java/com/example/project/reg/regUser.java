package com.example.project.reg;

import static com.example.project.reg.Valid.isValid;
import static com.example.project.server_data.ServiceConstructor.CreateService;

import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.project.R;
import com.example.project.server_data.ResponseBody;
import com.example.project.server_data.Service;



public class regUser extends Fragment {

    Button reg;
    TextView goToLogin;
    EditText phone_number;
    EditText password;
    EditText clone_of_password;
    TextView res;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reg_user, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        reg = view.findViewById(R.id.reg);
        goToLogin = view.findViewById(R.id.goToLoginFragment);

        phone_number = view.findViewById(R.id.num);
        password = view.findViewById(R.id.password);
        clone_of_password = view.findViewById(R.id.password2);
        res = view.findViewById(R.id.res);

        reg.setOnClickListener(view1 -> Navigation.findNavController(view).navigate(R.id.action_regUser_to_infoUser));
        goToLogin.setOnClickListener(view1 -> Navigation.findNavController(view).navigate(R.id.action_regUser_to_loginUser));
    }

}