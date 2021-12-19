package com.tuturu;

public class ShiinaMayuri extends Thread {

    private CompleteCallback completeCallback;

    public void setCompleteCallback(CompleteCallback completeCallback) {
        this.completeCallback = completeCallback;
    }

    @Override
    public void run() {
        if (completeCallback == null) return;
        completeCallback.onComplete();
    }

    public interface CompleteCallback {
        void onComplete();
    }
}
