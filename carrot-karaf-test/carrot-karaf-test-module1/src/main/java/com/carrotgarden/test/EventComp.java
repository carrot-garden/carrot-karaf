package com.carrotgarden.test;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Property;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.carrotgarden.conf.event.ConfigEvent;

@Component(immediate = true)
public class EventComp implements EventHandler {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Property(name = EventConstants.EVENT_TOPIC)
	static final String TOPIC = ConfigEvent.ALL;

	@Activate
	protected void activate() {

		log.info("\n\t event-activate");

	}

	@Deactivate
	protected void deactivate() {

		log.info("\n\t event-deactivate");

	}

	@Override
	public void handleEvent(final Event event) {

		log.info("\n\t event-event : {}", event);

	}

}
