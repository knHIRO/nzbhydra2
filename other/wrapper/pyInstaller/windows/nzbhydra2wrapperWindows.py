#!/usr/bin/env python3
import logging
#   (C) Copyright 2023 TheOtherP (theotherp@posteo.net)
#
#   Licensed under the Apache License, Version 2.0 (the "License");
#   you may not use this file except in compliance with the License.
#   You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#   Unless required by applicable law or agreed to in writing, software
#   distributed under the License is distributed on an "AS IS" BASIS,
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#   See the License for the specific language governing permissions and
#   limitations under the License.
# Just for pyinstaller

import sys
import time

import nzbhydra2wrapperPy3
import systemTray

if __name__ == '__main__':
    thread = systemTray.start()
    nzbhydra2wrapperPy3.quiet = True
    try:
        nzbhydra2wrapperPy3.main(sys.argv[1:])
        systemTray.stop()
    except SystemExit as e:
        logging.getLogger('root').info("Wrapper main thread quit")
        # For some reason thread / process is kept alive without sleeping
        time.sleep(1)
        systemTray.stop()
        sys.exit(e.code)