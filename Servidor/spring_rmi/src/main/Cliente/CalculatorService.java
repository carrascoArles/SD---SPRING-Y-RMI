/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.lab1;

/**
 *
 * @author arles
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorService extends Remote {
    int add(int a, int b) throws RemoteException;
    int subtract(int a, int b) throws RemoteException;
}
