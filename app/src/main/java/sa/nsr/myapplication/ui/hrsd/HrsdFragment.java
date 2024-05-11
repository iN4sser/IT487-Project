package sa.nsr.myapplication.ui.hrsd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import sa.nsr.myapplication.R;

public class HrsdFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hrsd, container, false);

        // Find buttons by their IDs
        View buttonOpenLink1 = view.findViewById(R.id.buttonOpenLink1);
        View buttonOpenLink2 = view.findViewById(R.id.buttonOpenLink2);

        // Set onClickListeners for the buttons
        buttonOpenLink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.hrsd.gov.sa/ministry-services/services/end-service-benefit-calculator");
            }
        });

        buttonOpenLink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://portaleservices.moj.gov.sa/LaborCalculator/LaborCalculator.aspx");
            }
        });

        return view;
    }

    // Method to open a link in a web browser
    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
