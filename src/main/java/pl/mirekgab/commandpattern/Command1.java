/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.commandpattern;

public class Command1 implements CommandInterface {

    private ReceiverObject1 receiver;

    public Command1(ReceiverObject1 receiver) {
        this.receiver = receiver;
    }
    
    

    @Override
    public String execute() {
        return receiver.command1();
    }
}
