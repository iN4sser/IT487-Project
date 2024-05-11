package sa.nsr.myapplication.ui.ca;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import sa.nsr.myapplication.R;

public class CaFragment extends Fragment {

    private static final String URL = "https://portal.ca.gov.sa/#myTabContent";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ca, container, false);
        WebView webView = view.findViewById(R.id.webView);

        // Enable JavaScript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Disable caching
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);

        // Load the URL
        webView.loadUrl(URL);

        // Set WebViewClient to handle page navigation
        webView.setWebViewClient(new WebViewClient());

        return view;
    }
}
