package com.suntoz.viewertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.suntoz.viewertest.R.layout.activity_room_select;

public class Room_select extends AppCompatActivity {
    WebView webview;

    private static final int TIME_DELAY = 2000;
    private static long back_pressed;


    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_room_select);

        setWebView();

    }


    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();


        if (back_pressed + TIME_DELAY > System.currentTimeMillis()) {
            super.onBackPressed();
            Room_select.this.overridePendingTransition(R.anim.trans_right_in,
                    R.anim.trans_right_out);
        } else {
            Intent returnBtn = new Intent(getApplicationContext(),
                    Room_select.class);
            Room_select.this.overridePendingTransition(R.anim.trans_right_in,
                    R.anim.trans_right_out);
            startActivity(returnBtn);

        }


        back_pressed = System.currentTimeMillis();
    }


    private void setWebView() {
        webview = (WebView) findViewById(R.id.myview);
        int scale = (int) (100 * webview.getScale());

        webview.setInitialScale(0);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);

        webview.loadUrl("https://viewer.rtt.in.th/");

    }


    private void setpageHidded() {

        WebSettings mysettings = webview.getSettings();
        mysettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                //  webview.loadUrl("javascript:document.getElementsByClassName('w3-sidenav w3-red w3-animate-left w3-collapse w3-top w3-large')[0].style.visibility=\"\";");
                webview.loadUrl("javascript:(function() { " +
                        "document.getElementsById('mySidenav')[0].style.display = 'none'; " +
                        "})()");

            }

        });

    }

//    private void setpageFull() {
//        webview = (WebView) findViewById(R.id.myview);
//        WebSettings mysettings = webview.getSettings();
//        mysettings.setJavaScriptEnabled(true);
//        webview.loadUrl("https://viewer.rtt.in.th/#");
//        webview.getSettings().setBuiltInZoomControls(true);
//        webview.setWebViewClient(new WebViewClient(){
//
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                webview.loadUrl("javascript:document.getElementsByClassName('w3-input w3-border')[2]  = \"\";");
//
//            }
//        });
//        webview.clearCache(true);
//        webview.clearHistory();
//        webview.getSettings().setJavaScriptEnabled(true);
//        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.scanqr, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Toast.makeText(getApplicationContext(), "scan QR Code", Toast.LENGTH_LONG).show();
        {
            switch (item.getItemId()) {
                case R.id.scan:

                    // Ex: launching new activity/screen or show alert message

                    Intent intent = new Intent(Room_select.this, Scanqr.class);
                    startActivityForResult(intent, REQUEST_CODE);


                    return true;

            }
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //Toast.makeText(this, "Got activity for result user defined. resultCode = " + resultCode, Toast.LENGTH_SHORT).show();
//        if (requestCode == REQUEST_CODE){}
        if (resultCode == RESULT_OK) {
            String returnlink = data.getStringExtra("URL");
            webview.loadUrl(returnlink);


//
//            TextView textView = (TextView) findViewById(R.id.text);
//            textView.setText(returnlink);


        }
    }

}
