package com.keith.pattern.memetno;

import java.util.ArrayList;
import java.util.List;

/**
 * 对外接口
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Caretaker {

    private final List<Memetno> memetnoList=new ArrayList<>();

    public Memetno getMemotno(int index){
        return memetnoList.get(index);
    }

    public int setMemetno(Memetno memetno){
        if(memetnoList.size()>10){
            memetnoList.remove(0);
        }
        memetnoList.add(memetno);
        return memetnoList.size()-1;
    }
}
