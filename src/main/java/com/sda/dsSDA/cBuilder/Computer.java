package com.sda.dsSDA.cBuilder;

public class Computer {

    //    required, minimum fields
    private String CPU;
    private String HDD;
    private String RAM;

    //    optional fields
    private boolean isGraphicCardEnable;
    private boolean isBluetoothEnable;

    //    Constructor
    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnable = builder.isBluetoothEnable;
        this.isGraphicCardEnable = builder.isGraphicCardEnable;
    }

    //    Builder Class Nested Class
    public static class ComputerBuilder {

        //    required, minimum fields
        private String CPU;
        private String HDD;
        private String RAM;

        //    optional fields
        private boolean isGraphicCardEnable;
        private boolean isBluetoothEnable;

        //        constructor with just required fields
        public ComputerBuilder(String CPU, String HDD, String RAM) {
            this.CPU = CPU;
            this.HDD = HDD;
            this.RAM = RAM;
        }

        //        setters of BUILDER
        public ComputerBuilder setGraphicCardEnable(boolean graphicCardEnable) {
            isGraphicCardEnable = graphicCardEnable;
            return this;
        }

        public ComputerBuilder setBluetoothEnable(boolean bluetoothEnable) {
            isBluetoothEnable = bluetoothEnable;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}




