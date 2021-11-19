package com.sda.dsSDA.cBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ComputerLombok {

    //    required, minimum fields
    private String CPU;
    private String HDD;
    private String RAM;

    //    optional fields
    private boolean isGraphicCardEnable;
    private boolean isBluetoothEnable;













}
