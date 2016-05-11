package com.shineyang.testmvpmode;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.shineyang.testmvpmode.injector.DataInterface;
import com.shineyang.testmvpmode.model.OperateNumber;
import com.shineyang.testmvpmode.presenter.DataPresenter;

public class MainActivity extends MvpActivity<DataInterface, DataPresenter> implements DataInterface {

    private TextView tv_number;
    private Button btn_plus;
    private Button btn_minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @NonNull
    @Override
    public DataPresenter createPresenter() {
        return new DataPresenter();
    }


    public void initView() {
        tv_number = (TextView) findViewById(R.id.tv_number);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);

        btn_plus.setOnClickListener(btn_plus_listener);
        btn_minus.setOnClickListener(btn_minus_listener);
    }

    View.OnClickListener btn_plus_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getPresenter().doPlus();
        }
    };


    View.OnClickListener btn_minus_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getPresenter().doMinus();
        }
    };

    @Override
    public void setPlusNumber(OperateNumber plus_number) {
        tv_number.setText(plus_number.toString());
    }

    @Override
    public void setMinusNumber(OperateNumber minus_number) {
        tv_number.setText(minus_number.toString());
    }

}
