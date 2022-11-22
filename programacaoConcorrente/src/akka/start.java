package programacaoConcorrente.src.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class start {

	public static void main(String[] args) {


	
		ActorSystem system = ActorSystem.create("HelloSystem");

	
		ActorRef ecoActor = system.actorOf(Props.create(ecoActor.class), "eco");

		
		ecoActor.tell(new helloMessage(), ActorRef.noSender());


	}

}