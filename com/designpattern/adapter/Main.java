package com.designpattern.adapter;

import com.designpattern.adapter.interfaces.SocketAdapter;
import com.designpattern.adapter.models.SocketAdapterImplementation;
import com.designpattern.adapter.models.Volt;

public class Main {

    public static void main(String[] args){
        testingObjectAdapter();
        testingClassAdapter();
    }

    private static void testingClassAdapter(){
        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(" V3 volts is using class adapter " + v3.getVolts());
        System.out.println(" V3 volts is using class adapter " + v12.getVolts());
        System.out.println(" V3 volts is using class adapter " + v120.getVolts());
    }

    private static void testingObjectAdapter(){
        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(" V3 volts is using object adapter " + v3.getVolts());
        System.out.println(" V3 volts is using object adapter " + v12.getVolts());
        System.out.println(" V3 volts is using object adapter " + v120.getVolts());
    }
    private static Volt getVolt(SocketAdapter socketAdapter, int i){
        return switch (i) {
            case 3 -> socketAdapter.get3Volts();
            case 12 -> socketAdapter.get12Volts();
            case 1 -> socketAdapter.get1Volts();
            default -> socketAdapter.get120Volts();
        };
    }
}
