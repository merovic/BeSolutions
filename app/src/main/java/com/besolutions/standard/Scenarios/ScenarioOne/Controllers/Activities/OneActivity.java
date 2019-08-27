package com.besolutions.standard.Scenarios.ScenarioOne.Controllers.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.besolutions.standard.NetworkLayer.NetworkInterface;
import com.besolutions.standard.NetworkLayer.ResponseModel;
import com.besolutions.standard.R;
import com.besolutions.standard.Utils.TinyDB;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OneActivity extends AppCompatActivity implements NetworkInterface {

    @BindView(R.id.textview1)
    TextView textview1;
    @BindView(R.id.button1)
    Button button1;
    TinyDB tinyDB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        //Amr 
        ButterKnife.bind(this);

        tinyDB = new TinyDB(this);

        // Generate --> Generate butterknife injection

    }

    @OnClick(R.id.button1)
    public void onViewClicked() {


    }

    @Override
    public void OnStart() {

    }

    @Override
    public void OnResponse(ResponseModel model) {

        switch (model.getResponseCode())
        {
            case 0:
            case 1:

        }

    }

    @Override
    public void OnError(VolleyError error) {

    }
}
