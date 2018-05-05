package ru.urvanov.javaexamples.mbeans;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

/**
 * 
 * Example from <a href="https://urvanov.ru">https://urvanov.ru</a>
 */
public class App
{
    public static void main( String[] args ) throws MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException, InterruptedException
    {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer(); 
        ObjectName name = new ObjectName("ru.urvanov.javaexamples.mbeans:type=My"); 
        My mbean = new My(); 
        mbs.registerMBean(mbean, name); 
     
        System.out.println("Waiting forever..."); 
        Thread.sleep(Long.MAX_VALUE); 
    }
}
