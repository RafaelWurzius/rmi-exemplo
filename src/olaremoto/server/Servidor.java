package olaremoto.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import olaremoto.idl.OlaMundoIDL;

public class Servidor {

		public static void main(String[] args) {
			try {
				System.setProperty("java.rmi.server.hostname", "172.16.8.18"); //meu ip
				

				
				// Aqui o objeto remoto ainda não é um stub
				OlaMundoServer ola = new OlaMundoServer();
//				OlaMundoRemoto = olaRemoto = new OlaMundoRemoto();				
				
				// Aqui gera o stub
				OlaMundoIDL stub = (OlaMundoIDL)UnicastRemoteObject.exportObject(ola, 0);
				
				// Executa o serviço RMIRESGISTRI
				Registry registro = LocateRegistry.createRegistry(12345);
				
				// Publica o objto remoto (stub) no rmiregistry
				registro.bind("Olaservice", stub);
				System.out.println("Se chegamos aqui, é que o servidor está rodando");
				
			} catch (Exception e) {
				System.out.println("Erro n RMI");
				
			}
		}
}
 