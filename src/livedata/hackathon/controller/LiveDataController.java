package livedata.hackathon.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

import livedata.hackathon.builder.SearchesBuilder;
import livedata.hackathon.model.Searches;

@RestController
@RequestMapping("/live")
public class LiveDataController {

	@ControllerAdvice
    static class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {
        public JsonpAdvice() {
            super("callback");
        }
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public Searches registerAgent() {
		return SearchesBuilder.build();
	}

}
