package sa.nsr.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import sa.nsr.myapplication.R;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnVat = root.findViewById(R.id.btn_vat);
        Button btnHrsd = root.findViewById(R.id.btn_hrsd);
        Button btnMs = root.findViewById(R.id.btn_ms);
        Button btnCa = root.findViewById(R.id.btn_ca);
        Button btnZatca = root.findViewById(R.id.btn_zatca);

        btnVat.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.nav_vat));
        btnHrsd.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.nav_hrsd));
        btnMs.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.nav_ms));
        btnCa.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.nav_ca));
        btnZatca.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.nav_zatca));

        return root;
    }

}
