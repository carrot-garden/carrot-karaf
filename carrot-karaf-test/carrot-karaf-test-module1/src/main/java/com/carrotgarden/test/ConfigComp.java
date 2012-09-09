package com.carrotgarden.test;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Property;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.carrotgarden.conf.event.ConfigEvent;
import com.carrotgarden.conf.sync.api.ConfigManager;

@Component(immediate = true)
public class ConfigComp implements EventHandler {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Property(name = EventConstants.EVENT_TOPIC)
	static final String TOPIC = ConfigEvent.CONFIG_CHANGE;

	@Activate
	protected void activate() {

		log.info("\n\t config-activate");

		processChange();

	}

	@Deactivate
	protected void deactivate() {

		log.info("\n\t config-deactivate");

	}

	@Override
	public void handleEvent(final Event event) {

		log.info("\n\t config-event : {}", event);

		processChange();

	}

	private ConfigManager manager;

	@Reference
	protected void bind(final ConfigManager s) {
		manager = s;
	}

	protected void unbind(final ConfigManager s) {
		manager = null;
	}

	private void processChange() {

		log.info("config: \n\t {}", manager.getConfig().root().render());

	}

}
