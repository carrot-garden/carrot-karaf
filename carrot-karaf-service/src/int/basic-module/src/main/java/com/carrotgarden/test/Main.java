/**
 * Copyright (C) 2010-2012 Andrei Pozolotin <Andrei.Pozolotin@gmail.com>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.carrotgarden.test;

import java.io.File;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class Main {

	private final static Logger log = LoggerFactory.getLogger(Main.class);

	static {
		log.info("load");
	}

	@Activate
	protected void activate() throws Exception {

		log.info("init");

		final File appDir = new File(System.getProperty("user.dir"));

		final File magicFile = new File(appDir, "magic-file");

		magicFile.createNewFile();

		log.info("done");

	}

}
