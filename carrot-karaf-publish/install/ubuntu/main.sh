#!/bin/bash
#
# Copyright (C) 2010-2012 Andrei Pozolotin <Andrei.Pozolotin@gmail.com>
#
# All rights reserved. Licensed under the OSI BSD License.
#
# http://www.opensource.org/licenses/bsd-license.php
#

#
# ${carrotTimeISO}
#

#
# disable apt-get dialogs
#
export DEBIAN_FRONTEND=noninteractive

#
# location of this script
#
folder=$(dirname $0)

#########################

ls -las "$folder"
