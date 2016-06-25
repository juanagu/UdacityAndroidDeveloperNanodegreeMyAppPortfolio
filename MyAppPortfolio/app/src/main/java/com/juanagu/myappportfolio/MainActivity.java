package com.juanagu.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.juanagu.myappportfolio.utils.AndroidUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * --------
     * Fields
     * --------
     **/

    //Components
    private Button mBtnSpotify;
    private Button nBtnScoresApp;
    private Button mBtnLibrary;
    private Button mBtnBuildItBigger;
    private Button mBtnBaconReader;
    private Button mBtnCapstone;

    //variables
    private boolean firstTime = true;

    /**
     * --------
     * Lifecycle
     * --------
     **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (firstTime) {
            findViewsById();
            applyListeners();
            firstTime = false;
        }

    }

    /**
     * --------
     * Methods
     * --------
     **/

    /**
     * find views by id
     */
    private void findViewsById() {
        mBtnSpotify = (Button) findViewById(R.id.btn_spotify);
        nBtnScoresApp = (Button) findViewById(R.id.btn_scores_app);
        mBtnLibrary = (Button) findViewById(R.id.btn_library_app);
        mBtnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        mBtnBaconReader = (Button) findViewById(R.id.btn_bacon_reader);
        mBtnCapstone = (Button) findViewById(R.id.btn_capstone);
    }

    /**
     * apply listeners
     */
    private void applyListeners() {
        mBtnSpotify.setOnClickListener(this);
        nBtnScoresApp.setOnClickListener(this);
        mBtnLibrary.setOnClickListener(this);
        mBtnBuildItBigger.setOnClickListener(this);
        mBtnBaconReader.setOnClickListener(this);
        mBtnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        checkButtonClick(id);
    }

    /**
     * check button click
     *
     * @param id
     */
    private void checkButtonClick(int id) {
        int launchButton = -1;
        switch (id) {
            case R.id.btn_spotify:
                launchButton = R.string.spotify_streamer;
                break;
            case R.id.btn_scores_app:
                launchButton = R.string.scores_app;
                break;
            case R.id.btn_library_app:
                launchButton = R.string.library_app;
                break;
            case R.id.btn_build_it_bigger:
                launchButton = R.string.build_it_bigger;
                break;
            case R.id.btn_bacon_reader:
                launchButton = R.string.bacon_reader;
                break;
            case R.id.btn_capstone:
                launchButton = R.string.capstone_my_own_app;
                break;
        }
        if (launchButton != -1) {
            Toast.makeText(this, String.format(AndroidUtils.getString(this, R.string.portfolio_launch_button), AndroidUtils.getString(this, launchButton)), Toast.LENGTH_SHORT).show();
        }
    }
}
