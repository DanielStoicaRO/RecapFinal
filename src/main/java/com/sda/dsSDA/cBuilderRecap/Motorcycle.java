package com.sda.dsSDA.cBuilderRecap;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Motorcycle {

    private String power;
    private String colour;
    private int speed;

    private boolean decals;
    private boolean storageBox;

}
