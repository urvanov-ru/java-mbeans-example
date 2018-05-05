package ru.urvanov.javaexamples.mbeans;

public interface MyMBean {
    
    String getMyName();
    
    void setSomeValue(int value1);
    
    int getSomeValue();
    
    void writeToConsole(String message);
    
    String concat(String str1, String str2);
}
