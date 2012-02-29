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
