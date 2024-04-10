package olaremoto.idl;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface OlaMundoIDL extends Remote{

		String OlaMundo() throws RemoteException;
}
