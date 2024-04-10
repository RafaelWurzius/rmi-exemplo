package olaremoto.server;

import java.rmi.RemoteException;

import olaremoto.idl.OlaMundoIDL;


public class OlaMundoServer implements OlaMundoIDL{

	public String OlaMundo() throws RemoteException {

		return "Olá Mundo REMOTO";
	}
}
