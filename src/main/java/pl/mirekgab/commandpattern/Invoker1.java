/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.commandpattern;

public class Invoker1 {

    public String executeCommand(CommandInterface command) {
        return command.execute();
    }
}
