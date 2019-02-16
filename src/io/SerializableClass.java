package io;

import java.io.Serializable;

public class SerializableClass implements Serializable {

    public SerializableClass(NotserializableSubclass notserializableSubclass) {
        this.notserializableSubclass = notserializableSubclass;
    }

    private NotserializableSubclass notserializableSubclass;
    public static String s;

    public NotserializableSubclass getNotserializableSubclass() {
        return notserializableSubclass;
    }

    public void setNotserializableSubclass(NotserializableSubclass notserializableSubclass) {
        this.notserializableSubclass = notserializableSubclass;
    }
}
