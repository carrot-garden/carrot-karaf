package com.carrotgarden.test;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class BasicComp {

	private final Logger log = LoggerFactory.getLogger(getClass());

	//

	@Activate
	protected void activate() {

		log.info("\n\t basic-activate");

	}

	@Deactivate
	protected void deactivate() {

		log.info("\n\t basic-deactivate");

	}

}
