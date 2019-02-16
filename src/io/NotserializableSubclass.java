package io;

import java.io.Serializable;

public class NotserializableSubclass implements Serializable {

    public NotserializableSubclass(String sou) {
        this.sou = sou;
    }

    String sou;

    public String getSou() {
        return sou;
    }

    public void setSou(String sou) {
        this.sou = sou;
    }
}
