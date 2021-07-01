/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.commandpattern;

/**
 *
 * @author mirek
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("command pattern");

        Invoker1 invoker = new Invoker1();
        ReceiverObject1 receiver = new ReceiverObject1();
        
        String s1 = invoker.executeCommand(new Command1(receiver));
        System.out.println(s1);
        
        String s2 = invoker.executeCommand(new Command2(receiver));
        System.out.println(s2);
    }
}
