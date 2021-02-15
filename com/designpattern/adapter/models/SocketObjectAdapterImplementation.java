package com.designpattern.adapter.models;

import com.designpattern.adapter.interfaces.SocketAdapter;

public class SocketObjectAdapterImplementation implements SocketAdapter {

    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = socket.getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volts() {

        Volt v = socket.getVolt();
        return convertVolt(v,40);
    }

    @Override
    public Volt get1Volts() {

        Volt v = socket.getVolt();
        return convertVolt(v,120);
    }

    private Volt convertVolt(Volt v, int i){

        return new Volt(v.getVolts()/i);
    }
}
