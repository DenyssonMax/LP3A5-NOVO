package programacaoConcorrente.src.akka;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class ecoActor extends UntypedActor {

    LoggingAdapter log = Logging.getLogger(getContext().system(), this);

   
    private actorRef childActor;

    @Override
    public void preStart() throws Exception {
        super.preStart();

       
        childActor = getContext().actorOf(Props.create(childActor.class), "childOfEco");
    }

    @Override
    public void onReceive(Object msg) throws Exception {

        if (msg instanceof helloMessage) {
            log.info("Mensagem recebida: " + msg);
            
            childActor.tell(msg, getSelf());
        }
        else {
            
            unhandled(msg);
        }
    }
}