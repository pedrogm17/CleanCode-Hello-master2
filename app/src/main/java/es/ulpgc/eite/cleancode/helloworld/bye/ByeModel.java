package es.ulpgc.eite.cleancode.helloworld.bye;

import android.util.Log;

import es.ulpgc.eite.cleancode.helloworld.bye.ByeContract;

public class ByeModel implements ByeContract.Model {

    public static String TAG = es.ulpgc.eite.cleancode.helloworld.bye.ByeModel.class.getSimpleName();

    private String message;

    public ByeModel(String message) {
        this.message = message;
    }

    @Override
    public String getByeMessage() {
        return message;
    }

}
