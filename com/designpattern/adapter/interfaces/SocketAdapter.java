package com.designpattern.adapter.interfaces;

import com.designpattern.adapter.models.Volt;

public interface SocketAdapter {
     Volt get120Volts();
     Volt get12Volts();
     Volt get3Volts();
     Volt get1Volts();

}
