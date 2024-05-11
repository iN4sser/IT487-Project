package sa.nsr.myapplication.ui.vat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import sa.nsr.myapplication.R;

public class VatFragment extends Fragment {

    private EditText editTextAmount1, editTextAmount2, editTextAmount3, editTextAmount4;
    private TextView textViewResult1, textViewResult2, textViewResult3, textViewResult4;

    private static final double VAT_PERCENTAGE = 0.15;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vat, container, false);

        // Initialize views
        editTextAmount1 = view.findViewById(R.id.editTextAmount1);
        editTextAmount2 = view.findViewById(R.id.editTextAmount2);
        editTextAmount3 = view.findViewById(R.id.editTextAmount3);

        textViewResult1 = view.findViewById(R.id.textViewResult1);
        textViewResult2 = view.findViewById(R.id.textViewResult2);
        textViewResult3 = view.findViewById(R.id.textViewResult3);

        // Calculate button for section 1
        Button buttonCalculate1 = view.findViewById(R.id.buttonCalculate1);
        buttonCalculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVATAmount();
            }
        });

        // Calculate button for section 2
        Button buttonCalculate2 = view.findViewById(R.id.buttonCalculate2);
        buttonCalculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAmountBeforeTax();
            }
        });

        // Calculate button for section 3
        Button buttonCalculate3 = view.findViewById(R.id.buttonCalculate3);
        buttonCalculate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTotalAmountIncludingVAT();
            }
        });

        return view;
    }

    // Method to calculate VAT amount
    private void calculateVATAmount() {
        double amountBeforeTax = Double.parseDouble(editTextAmount1.getText().toString());
        double vatAmount = amountBeforeTax * VAT_PERCENTAGE;
        textViewResult1.setText(String.valueOf(vatAmount));
    }

    // Method to calculate amount before tax
    private void calculateAmountBeforeTax() {
        double amountIncludingVAT = Double.parseDouble(editTextAmount2.getText().toString());
        double amountBeforeTax = amountIncludingVAT / (1 + VAT_PERCENTAGE);
        textViewResult2.setText(String.valueOf(amountBeforeTax));
    }

    // Method to calculate total amount including VAT
    private void calculateTotalAmountIncludingVAT() {
        double amountBeforeTax = Double.parseDouble(editTextAmount3.getText().toString());
        double totalAmountIncludingVAT = amountBeforeTax * (1 + VAT_PERCENTAGE);
        textViewResult3.setText(String.valueOf(totalAmountIncludingVAT));
    }
}
