package com.carrotgarden.test;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, name = AdminComp.NAME)
public class AdminComp {

	public static final String NAME = "com.carrotgarden.test.admin";

	private final Logger log = LoggerFactory.getLogger(getClass());

	private ComponentContext context;

	@Activate
	protected void activate(final ComponentContext c) {

		context = c;

		log.info("\n\t admin-activate {}", context.getProperties());

	}

	@Modified
	protected void modified() {

		log.info("\n\t admin-modified {}", context.getProperties());

	}

	@Deactivate
	protected void deactivate() {

		log.info("\n\t admin-deactivate {}", context.getProperties());

		context = null;

	}

}
