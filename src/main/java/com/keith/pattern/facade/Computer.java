package com.keith.pattern.facade;

/**
 * Facade 外观角色，组成其他角色接口
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class Computer {

    /**
     * 子系统
     */
    private final Cpu cpu;
    private final Memory memory;
    private final Disk disk;

    public Computer(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
