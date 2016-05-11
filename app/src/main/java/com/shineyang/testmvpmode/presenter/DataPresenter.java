package com.shineyang.testmvpmode.presenter;

import android.util.Log;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.shineyang.testmvpmode.injector.DataInterface;
import com.shineyang.testmvpmode.model.OperateNumber;

/**
 * Created by ShineYang on 16/4/18.
 */
public class DataPresenter extends MvpBasePresenter<DataInterface> {
    private OperateNumber operate_number = new OperateNumber();

    public void doPlus() {
        DataInterface view = getView();
        operate_number.number++;
        Log.e("number", "===============>plus_number = " + operate_number);
        if (view != null) {
            view.setPlusNumber(operate_number);
        }
    }

    public void doMinus() {
        DataInterface view = getView();
        operate_number.number--;
        Log.e("number","===============>minus_number = " + operate_number);
        if (view != null) {
            view.setMinusNumber(operate_number);
        }
    }
}
