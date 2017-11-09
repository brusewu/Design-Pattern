package com.net.facade;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }
    public void startCpu(){
        System.out.println("start the computer");
        cpu.startCpu();
        memory.startCpu();
        disk.startCpu();
        System.out.println("start the computer finished");
    }

    public void shutDown(){
        System.out.println("shut down computer");
        cpu.shutDown();
        memory.shutDown();
        disk.shutDown();
        System.out.println("computer closed");
    }
}
