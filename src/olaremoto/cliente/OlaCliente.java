package olaremoto.cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import olaremoto.idl.OlaMundoIDL;

public class OlaCliente {

	public static void main(String[] args) {
		
		
		try {
			Registry registro = LocateRegistry.getRegistry("172.16.8.18", 12345);
			
			OlaMundoIDL ola = (OlaMundoIDL)registro.lookup("Olaservice");
			System.out.println(ola.OlaMundo());
		} catch (Exception e) {
			System.out.println("Erro no cliente");
			e.printStackTrace();
		}
		 
	}
}
