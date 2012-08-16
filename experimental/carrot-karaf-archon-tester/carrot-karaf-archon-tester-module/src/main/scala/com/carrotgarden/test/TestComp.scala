/**
 * Copyright (C) 2010-2012 Andrei Pozolotin <Andrei.Pozolotin@gmail.com>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.carrotgarden.test

import org.osgi.service.component.annotations._
import com.weiglewilczek.slf4s.Logging

@Component(immediate = true)
class TestComp extends Logging {

  @Activate
  protected def activate() {

    logger.info("### activate 12")

  }

  @Deactivate
  protected def deactivate() {

    logger.info("### deactivate 12")

  }

}
