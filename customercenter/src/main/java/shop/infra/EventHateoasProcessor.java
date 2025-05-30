package shop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import shop.domain.*;

@Component
public class EventHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Event>> {

    @Override
    public EntityModel<Event> process(EntityModel<Event> model) {
        return model;
    }
}
