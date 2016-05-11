package com.shineyang.testmvpmode.injector;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.shineyang.testmvpmode.model.OperateNumber;

/**
 * Created by ShineYang on 16/4/18.
 */
public interface DataInterface extends MvpView {

    void setPlusNumber(OperateNumber plus_number);

    void setMinusNumber(OperateNumber minus_number);
}
