package ru.urvanov.javaexamples.mbeans;

public class My implements MyMBean {

    private int someValue;
    
    @Override
    public String getMyName() {
        return "JustMBeanName" + someValue;
    }

    @Override
    public void setSomeValue(int value1) {
        this.someValue = value1;
    }

    @Override
    public int getSomeValue() {
        return this.someValue;
    }

    @Override
    public void writeToConsole(String message) {
        System.out.println(message);
    }

    @Override
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

}
