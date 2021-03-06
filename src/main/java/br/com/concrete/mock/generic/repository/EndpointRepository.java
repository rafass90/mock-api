package br.com.concrete.mock.generic.repository;

import br.com.concrete.mock.generic.model.Endpoint;
import br.com.concrete.mock.generic.model.Request;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.Optional;

public interface EndpointRepository {

    Collection<Endpoint> getByMethodAndUri(RequestMethod requestMethod, String pathUri);

    Optional<Endpoint> getByMethodAndRequest(Request request);

}
